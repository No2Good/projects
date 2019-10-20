/**
 * 公司：金刚葫芦娃
 * 文件名：ProvincePartitioner
 * 作者：ZhaoJinGang
 * 时间：2019/4/9 8:51
 * 描述：
 */

package com.smartparking.utils.smartparking;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class UserPartitioner extends Partitioner<Text, Orders> {

    private static Map<String,Integer> userMap = new HashMap<String, Integer>();

    //加载外部的字典数据到本地内存
    static {
        for(int i = 1; i <= 100; i++){
            userMap.put(""+i, i-1);
        }
    }


    public int getPartition(Text text, Orders orders, int i) {
        String strs = text.toString();
        String[] strings = strs.split(",");

        Integer userNumb = userMap.get(strings[0]);
        if (userNumb == null){
            userNumb = 100;
        }
        return userNumb;
    }
}
