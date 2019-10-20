/////**
//// * 公司：金刚葫芦娃
//// * 文件名：JobSubmitterClient
//// * 作者：ZhaoJinGang
//// * 时间：2019/4/9 8:25
//// * 描述：
//// */
////
////package com.smartparking.utils.smartparking;
////
////import org.apache.hadoop.conf.Configuration;
////import org.apache.hadoop.fs.Path;
////import org.apache.hadoop.io.Text;
////import org.apache.hadoop.mapreduce.Job;
////import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
////import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
////
////
////public class JobSubmitterClient {
////
////    public static void main(String[] args) throws Exception {
////
////        if(args.length < 2){
////            System.out.println("参数不正确：输入数据路径 输出数据路径 reduce-task进程数");
////            System.exit(2);
////        }
////
////        Job job = Job.getInstance(new Configuration());
////
////        //!重要：指定job所在的jar包的路径
////        job.setJarByClass(JobSubmitterClient.class);
////
////        //指定job所用的mapper逻辑类为哪个类
////        job.setMapperClass(SmartparkingMapper.class);
////        //指定job所用的reducer逻辑类为哪个类
////        job.setReducerClass(SmartparkingReducer.class);
////
////        //设置 map task 阶段输出的KV数据类型
////        //map输出的kv类型与reduce输出的kv类型一致时，MapOutput KV Class 可以省略
////        job.setMapOutputKeyClass(Text.class);
////        job.setMapOutputValueClass(Orders.class);
////
////        //设置 reduce task 阶段输出的KV数据类型
////        job.setOutputKeyClass(Text.class);
////        job.setOutputValueClass(Text.class);
////
////        //指定Partitioner类来让我们自定义的Partitioner起作用，替换掉系统默认的HashPartitioner
//////        job.setPartitionerClass(UserPartitioner.class);
////
////        //设置本次job运行时的 reduce task 进程数，数量应该根 Partitioner 的分区数匹配，默认为1个
//////        job.setNumReduceTasks(new Integer(args[2]));
////
////        //设置要处理的文本数据所存放的路径
////        FileInputFormat.setInputPaths(job,new Path(args[0]));
////        //设置最终输出结果所存放的路径
////        FileOutputFormat.setOutputPath(job,new Path(args[1]));
////
////        //提交 job 给 hadoop集群
////        boolean success = job.waitForCompletion(true);
////
////        System.exit(success ? 0:1);
////
////    }
////
////}
///**
// * 公司：金刚葫芦娃
// * 文件名：JobSubmitterClient
// * 作者：ZhaoJinGang
// * 时间：2019/4/9 8:25
// * 描述：
// */
//
//package com.smartparking.utils.smartparking;
//
//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.fs.Path;
//import org.apache.hadoop.io.Text;
//import org.apache.hadoop.mapreduce.Job;
//import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
//import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
//
//
//public class JobSubmitterClient {
//
//    public static void main(String[] args) throws Exception {
//
//        if(args.length < 2){
//            System.out.println("参数不正确：输入数据路径 输出数据路径 reduce-task进程数");
//            System.exit(2);
//        }
//
//        Job job = Job.getInstance(new Configuration());
//
//        //!重要：指定job所在的jar包的路径
//        job.setJarByClass(JobSubmitterClient.class);
//
//        //指定job所用的mapper逻辑类为哪个类
//        job.setMapperClass(SmartparkingMapper.class);
//        //指定job所用的reducer逻辑类为哪个类
//        job.setReducerClass(SmartparkingReducer.class);
//
//        //设置 map task 阶段输出的KV数据类型
//        //map输出的kv类型与reduce输出的kv类型一致时，MapOutput KV Class 可以省略
////        job.setMapOutputKeyClass(Text.class);
////        job.setMapOutputValueClass(Text.class);
//
//        //设置 reduce task 阶段输出的KV数据类型
//        job.setOutputKeyClass(Text.class);
//        job.setOutputValueClass(Text.class);
//
//        //指定Partitioner类来让我们自定义的Partitioner起作用，替换掉系统默认的HashPartitioner
////        job.setPartitionerClass(UserPartitioner.class);
//
//        //设置本次job运行时的 reduce task 进程数，数量应该根 Partitioner 的分区数匹配，默认为1个
////        job.setNumReduceTasks(new Integer(args[2]));
//
//        //设置要处理的文本数据所存放的路径
//        FileInputFormat.setInputPaths(job,new Path(args[0]));
//        //设置最终输出结果所存放的路径
//        FileOutputFormat.setOutputPath(job,new Path(args[1]));
//
//        //提交 job 给 hadoop集群
//        boolean success = job.waitForCompletion(true);
//
//        System.exit(success ? 0:1);
//
//    }
//
//}
/**
 * 公司：金刚葫芦娃
 * 文件名：JobSubmitterClient
 * 作者：ZhaoJinGang
 * 时间：2019/4/9 8:25
 * 描述：
 */

package com.smartparking.utils.smartparking;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


// com.smartparking.utils.smartparking.JobSubmitterClient
public class JobSubmitterClient {

    public static void main(String[] args) throws Exception {

        if(args.length < 1){
            System.out.println("参数不正确：输入数据路径 输出数据路径");
            System.exit(2);
        }

        Job job = Job.getInstance(new Configuration());

        //!重要：指定job所在的jar包的路径
        job.setJarByClass(JobSubmitterClient.class);

        //指定job所用的mapper逻辑类为哪个类
//        job.setMapperClass(SmartparkingMapper.class);
//        指定job所用的reducer逻辑类为哪个类
//        job.setReducerClass(SmartparkingReducer.class);

        //设置 map task 阶段输出的KV数据类型
        //map输出的kv类型与reduce输出的kv类型一致时，MapOutput KV Class 可以省略
//        job.setMapOutputKeyClass(Text.class);
//        job.setMapOutputValueClass(Text.class);

        //设置 reduce task 阶段输出的KV数据类型
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);

        //指定Partitioner类来让我们自定义的Partitioner起作用，替换掉系统默认的HashPartitioner
//        job.setPartitionerClass(UserPartitioner.class);

        //设置本次job运行时的 reduce task 进程数，数量应该根 Partitioner 的分区数匹配，默认为1个
//        job.setNumReduceTasks(new Integer(args[2]));

        //设置要处理的文本数据所存放的路径
        FileInputFormat.setInputPaths(job,new Path(args[0]));
        //设置最终输出结果所存放的路径
        FileOutputFormat.setOutputPath(job,new Path(args[1]));

        //提交 job 给 hadoop集群
        boolean success = job.waitForCompletion(true);

        System.exit(success ? 0:1);

    }

}
