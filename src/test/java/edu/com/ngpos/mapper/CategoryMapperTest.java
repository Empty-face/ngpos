package edu.com.ngpos.mapper;

import edu.com.ngpos.domain.Category;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
class CategoryMapperTest {

    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    void insertCategory() {
        Category newCategory = new Category();
        newCategory.setCategoryId(3l);
        newCategory.setCategoryName("测试");
        System.out.println(categoryMapper.insertCategory(newCategory));

    }

    @Test
    void updateCategory() {
        Category c = categoryMapper.getCategoryById(3l);
        c.setCategoryName("测试架");
        System.out.println(categoryMapper.updateCategory(c));
    }

    @Test
    void deleteCategoryById() {
        System.out.println(categoryMapper.deleteCategoryById(3l));
    }

    @Test
    void getCategoryById() {
        Category c = categoryMapper.getCategoryById(1L);
        System.out.println(c);
    }
}