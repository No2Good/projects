/**
 * 公司：金刚葫芦娃
 * 文件名：HDFSPut
 * 作者：ZhaoJinGang
 * 时间：2019/7/1 16:24
 * 描述：
 */

package com.smartparking.utils.smartparking;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URI;

public class HDFSPut {

    @Test
    public void testDownload() throws Exception {
        FileSystem fileSystem = null;
        fileSystem = FileSystem.get(new URI("hdfs://192.168.31.130:9000"),new Configuration(), "root");
        //本地的输入流
        FileInputStream fileInputStream = new FileInputStream("e:/smartparking.txt");
        //hdfs的输出流
        FSDataOutputStream fsDataOutputStream = fileSystem.create(new Path("/sp/srcdata/smartparking.txt"));

        //IOUtils 工具
        IOUtils.copyBytes(fileInputStream,fsDataOutputStream,4096);
        IOUtils.closeStream(fsDataOutputStream);
        IOUtils.closeStream(fileInputStream);
    }

}
