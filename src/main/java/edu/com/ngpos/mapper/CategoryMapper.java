package edu.com.ngpos.mapper;

import edu.com.ngpos.domain.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
// mybatis的注解
@Mapper
public interface CategoryMapper {
    /**
     * 根据ID获取category对象
     */
    public Category getCategoryById(Long categoryId);

    /**
     * 查询所有的category
     * @return
     */

    public List<Category> listAllCategory();


    public int insertCategory(Category category);

    public int updateCategory(Category category);

    public int deleteCategoryById(Long categoryId);
}
