/**
 * 公司：金刚葫芦娃
 * 文件名：InsertInfo
 * 作者：ZhaoJinGang
 * 时间：2019/7/1 17:40
 * 描述：
 */

package com.smartparking.utils;

import java.io.*;

public class InsertInfo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("e:/smartparkingMapReduce.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String line = "";
        while ((line = br.readLine()) != null){

            String[] strings = line.split(" ");


        }

    }

}
