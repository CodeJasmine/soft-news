package com.soft1851.article.service;

import com.soft1851.pojo.Category;

import java.util.List;

/**
 * @author wususu
 * @date 2020/11/24 22:27
 */
public interface CategoryService {
    /**
     * 查询所有文章分类
     * @return
     */
    List<Category> selectAll();
}
