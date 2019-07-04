package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

/**
 * created by wangbl
 * 2019/7/3 5:21 PM
 */
public interface ICategoryService {

    ServerResponse<Integer> insert(String categoryName,int parentId);
}
