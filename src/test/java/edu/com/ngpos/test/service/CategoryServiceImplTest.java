package edu.com.ngpos.test.service;

import edu.com.ngpos.domain.Category;
import edu.com.ngpos.domain.ProductDescription;
import edu.com.ngpos.mapper.ProductCatalog;
import edu.com.ngpos.service.ICategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CategoryServiceImplTest {
    @Autowired
    private ICategoryService categoryService;

    @Test
    void getCategoryById() {
        Category c = categoryService.getCategoryById(1L);
        System.out.println(c);
        Assertions.assertEquals("文具",c.getCategoryName(),"失败!!!");
    }

    @Test
    void listAllCategory() {
        List<Category> categories = categoryService.listAllCategory();
        Assertions.assertTrue(categories.size() == 2);
    }
}