package edu.com.ngpos.service;

import edu.com.ngpos.domain.Category;

import java.util.List;

public interface ICategoryService {
    /**
     * 根据ID获得category对象
     * @param categoryId
     * @return
     */
    public Category getCategoryById(Long categoryId);

    /**
     * 查询所有的category对象
     * @return
     */
    public List<Category> listAllCategory();
}
