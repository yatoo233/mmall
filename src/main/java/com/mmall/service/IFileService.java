package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * created by wangbl
 * 2019/7/4 5:52 PM
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
