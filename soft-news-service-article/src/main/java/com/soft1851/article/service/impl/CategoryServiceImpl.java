package com.soft1851.article.service.impl;

import com.soft1851.article.mapper.CategoryMapper;
import com.soft1851.article.service.CategoryService;
import com.soft1851.pojo.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wususu
 * @date 2020/11/24 22:29
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper categoryMapper;
    @Override
    public List<Category> selectAll() {
        System.out.println("categoryMapper.selectAll()"+categoryMapper.selectAll());
        return categoryMapper.selectAll();
    }
}

