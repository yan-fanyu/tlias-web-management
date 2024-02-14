package com.itheima.controller;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.itheima.utils.AliOSSUtils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UploadController {
    // 本地上传
//    @PostMapping("/upload")
//    public Result upload(String username, Integer age, MultipartFile image) throws Exception {
//        log.info("文件上传：username = {}, age = {}, image = {}", username, age, image);
//
//        // 获取原始文件名
//        String originalFilename = image.getOriginalFilename();
//
//        // 构造唯一的文件名（不能重复） - uuid(通用唯一识别码)
//        int index = originalFilename.lastIndexOf(".");
//        String extname = originalFilename.substring(index);
//        String newFileName = UUID.randomUUID().toString() + extname;
//        log.info("新的文件名：{}", newFileName);
//
//        // 将文件存储在服务器的磁盘目录中 E:\images
//        image.transferTo(new File("E:\\images\\" + newFileName));
//
//        return Result.success();
//    }

    @Autowired
    private AliOSSUtils aliOSSUtils;

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        log.info("文件上传：username = {}, age = {}, image = {}", image.getOriginalFilename());


        // 调用阿里云OSS工具类进行文件上传
        String url = aliOSSUtils.upload(image);

        log.info("文件上传完成，文件访问的url：{}", url);

        return Result.success(url);


    }
}
