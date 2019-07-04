package com.mmall.service.impl;

import com.mmall.common.ServerResponse;
import com.mmall.dao.CategoryMapper;
import com.mmall.pojo.Category;
import com.mmall.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by wangbl
 * 2019/7/3 5:22 PM
 */
@Service("iCategoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public ServerResponse<Integer> insert(String categoryName,int parentId) {
        Category category = new Category();
        category.setName(categoryName);
        category.setParentId(parentId);
        category.setStatus(true);

        int count = categoryMapper.insert(category);
        if (count == 0) {
            return ServerResponse.createBySuccessMessage("新增产品分类失败");
        }
        return ServerResponse.createBySuccessMessage("新增产品分类成功");
    }
}
