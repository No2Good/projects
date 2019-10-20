/**
 * 公司：金刚葫芦娃
 * 文件名：HDFSGet
 * 作者：ZhaoJinGang
 * 时间：2019/7/1 16:25
 * 描述：
 */

package com.smartparking.utils.smartparking;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.net.URI;

public class HDFSGet {

    @Test
    public void testDownload() throws Exception {
        FileSystem fileSystem = null;
        fileSystem = FileSystem.get(new URI("hdfs://192.168.31.130:9000"),new Configuration(), "root");
        //输入流
        FSDataInputStream inputStream = fileSystem.open(new Path("/sp/output3/part-r-00000"));
        //输出流
        FileOutputStream fileOutputStream = new FileOutputStream("E:/IDEA4/Maven/smartparking/src/main/resources/smartparkingMapReduce.txt");

        //IOUtils 工具
        IOUtils.copyBytes(inputStream,fileOutputStream,new Configuration());
        IOUtils.closeStream(fileOutputStream);
        IOUtils.closeStream(inputStream);
    }

}
