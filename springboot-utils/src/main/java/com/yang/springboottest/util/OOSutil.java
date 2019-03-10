package com.yang.springboottest.util;

import java.io.*;

import com.aliyun.oss.ClientConfiguration;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.OSSObject;
import com.aliyun.oss.model.ObjectMetadata;


public class OOSutil {
    // Endpoint以杭州为例，其它Region请按实际情况填写。
    static String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
    static String accessKeyId = "LTAIzP5GyKN8dYrR";
    static String accessKeySecret = "6t2kOrcRiWT9v0ih9luW4jecsD6suJ";
    static String bucketName = "yang-xiao-dao-bucket";


    public static void testput() {
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        // 上传字符串。
        String content = "Hello OSS";
        ossClient.putObject(bucketName, "字符串", new ByteArrayInputStream(content.getBytes()));
        // 关闭OSSClient。
        ossClient.shutdown();
    }

    public static void testget() throws IOException {
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

// 调用ossClient.getObject返回一个OSSObject实例，该实例包含文件内容及文件元信息。
        OSSObject ossObject = ossClient.getObject(bucketName, "字符串");
// 调用ossObject.getObjectContent获取文件输入流，可读取此输入流获取其内容。
        InputStream content = ossObject.getObjectContent();
        if (content != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(content));
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                System.out.println("\n" + line);
            }
            // 数据读取完成后，获取的流必须关闭，否则会造成连接泄漏，导致请求无连接可用，程序无法正常工作。
            content.close();
        }

        ossClient.shutdown();
    }

    public void moreClint() {
        // 创建ClientConfiguration实例，按照您的需要修改默认参数。
        ClientConfiguration conf = new ClientConfiguration();
        // 开启支持CNAME。CNAME是指将自定义域名绑定到存储空间上。
        conf.setSupportCname(true);
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret, conf);
        ossClient.shutdown();
    }


    public static void main(String[] args) throws IOException {
       // testput();
        testget();
    }
}
