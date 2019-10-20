/**
 * 公司：金刚葫芦娃
 * 文件名：ProvinceFlowCountMapper
 * 作者：ZhaoJinGang
 * 时间：2019/4/9 8:26
 * 描述：
 */

package com.smartparking.utils.smartparking;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SmartparkingMapper extends Mapper<LongWritable, Text, Text, Text> {




    private Text userInfo = new Text();
    private Text time = new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        String line = value.toString();
        String[] fields = StringUtils.split(line, ",");

        String userIdStr = fields[7];
        String garageName = fields[0];
        String carportName = fields[1];

        userInfo.set(userIdStr+","+garageName+","+carportName);

        Long totalTime = null;
        try {
            Date startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(fields[3]);
            Date endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(fields[4]);
            totalTime = endTime.getTime() - startTime.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        time.set(totalTime.toString());

        context.write(userInfo,time);

    }
}
