/////**
//// * 公司：金刚葫芦娃
//// * 文件名：ProvinceFlowCountReducer
//// * 作者：ZhaoJinGang
//// * 时间：2019/4/9 8:26
//// * 描述：
//// */
////
////package com.smartparking.utils.smartparking;
////
////import org.apache.hadoop.io.Text;
////import org.apache.hadoop.mapreduce.Reducer;
////
////import java.io.IOException;
////import java.text.ParseException;
////
////public class SmartparkingReducer extends Reducer<Text, Orders, Text, Text> {
////
////    private Text totalTime = new Text();
////
////    @Override
////    protected void reduce(Text key, Iterable<Orders> values, Context context) throws IOException, InterruptedException {
////
////        Long totalTimeLong = new Long(0);
////
////        for(Orders value:values){
////            try {
////                totalTimeLong += value.getTotalTime();
////            } catch (ParseException e) {
////                e.printStackTrace();
////            }
////        }
////
////        totalTime.set(totalTimeLong.toString());
////
////        context.write(key,totalTime);
////
////    }
////}
///**
// * 公司：金刚葫芦娃
// * 文件名：ProvinceFlowCountReducer
// * 作者：ZhaoJinGang
// * 时间：2019/4/9 8:26
// * 描述：
// */
//
//package com.smartparking.utils.smartparking;
//
//import org.apache.hadoop.io.Text;
//import org.apache.hadoop.mapreduce.Reducer;
//
//import java.io.IOException;
//import java.text.ParseException;
//
//public class SmartparkingReducer extends Reducer<Text, Text, Text, Text> {
//
//    private Text totalTime = new Text();
//
//    @Override
//    protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
//
//        Long totalTimeLong = new Long(0);
//
//        for(Text value:values){
//            Long aLong = new Long(String.valueOf(value));
//            totalTimeLong += aLong;
//        }
//
//        totalTime.set(totalTimeLong.toString());
//
//        context.write(key,totalTime);
//
//    }
//}
/**
 * 公司：金刚葫芦娃
 * 文件名：ProvinceFlowCountReducer
 * 作者：ZhaoJinGang
 * 时间：2019/4/9 8:26
 * 描述：
 */

package com.smartparking.utils.smartparking;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.text.ParseException;

public class SmartparkingReducer extends Reducer<Text, Text, Text, Text> {

    private Text totalTime = new Text();

    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {

        Long totalTimeLong = new Long(0);

        for(Text value:values){
            Long aLong = new Long(String.valueOf(value));
            totalTimeLong += aLong;
        }

        totalTime.set(totalTimeLong.toString());

        context.write(key,totalTime);

    }
}
