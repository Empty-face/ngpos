package edu.com.ngpos.service.impl;

import edu.com.ngpos.domain.Category;
import edu.com.ngpos.mapper.CategoryMapper;
import edu.com.ngpos.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryMapper.getCategoryById(categoryId);
    }
    @Override
    public List<Category> listAllCategory() {
        return categoryMapper.listAllCategory();
    }

    @Override
    public int insertCategory(Category category) {;
        category.setCreateTime(new Date());
        return categoryMapper.insertCategory(category);
    }

    /**
     * 修改产品
     *
     * @param category@return 影响记录数
     */
    @Override
    public int updateCategory(Category category) {
        category.setUpdateTime(new Date());
        return categoryMapper.updateCategory(category);
    }

    /**
     * 删除产品
     *
     * @param categoryId@return 影响记录数
     */
    @Override
    public int deleteCategory(Long categoryId) {
        return categoryMapper.deleteCategoryById(categoryId);
    }


}
