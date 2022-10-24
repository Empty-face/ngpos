package edu.com.ngpos.service.impl;

import edu.com.ngpos.domain.Category;
import edu.com.ngpos.mapper.ProductCatalog;
import edu.com.ngpos.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ProductCatalog categoryCatalog;
    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryCatalog.getCategoryById(categoryId);
    }
    @Override
    public List<Category> listAllCategory() {
        return categoryCatalog.listAllCategory();
    }
}
