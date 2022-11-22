package edu.com.ngpos.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.com.ngpos.core.domain.AjaxResult;
import edu.com.ngpos.domain.Category;
import edu.com.ngpos.service.ICategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 类别控制器
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
//    @Qualifier(value = "CategoryServiceImpl")
    private ICategoryService categoryService;
    @ApiOperation("查询所有product")
    @GetMapping("/{categoryId}")
    public AjaxResult getById(@PathVariable("categoryId") Long categoryId) {
        return AjaxResult.success(categoryService.getCategoryById(categoryId));
    }

    @ApiOperation("查询所有product")
    @GetMapping("/listAll")
    public AjaxResult listAll(){
        return AjaxResult.success(categoryService.listAllCategory());
    }

    @PostMapping
    @ApiOperation("新增产品")
    public AjaxResult add(@RequestBody Category category) {
        int rows = categoryService.insertCategory(category);
        return rows > 0 ? AjaxResult.success("添加成功") : AjaxResult.error("添加失败");
    }

    @PutMapping
    @ApiOperation("修改产品")
    public AjaxResult edit(@RequestBody Category category) {
        int rows = categoryService.updateCategory(category);
        return rows > 0 ? AjaxResult.success("修改成功") : AjaxResult.error("修改失败");
    }

    @DeleteMapping("/{categoryId}")
    @ApiOperation("删除产品")
    public AjaxResult remove(@PathVariable Long categoryId) {
        int rows = categoryService.deleteCategory(categoryId);
        return rows > 0 ? AjaxResult.success("删除成功") : AjaxResult.error("删除失败");
    }
    @ApiOperation("分页查询")
    @GetMapping("/page")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, Category category){
        PageHelper.startPage(pageNum,pageSize);
        List<Category> list = categoryService.listAllCategory();
        PageInfo<Category> pageInfo = new PageInfo<>(list);
        return  AjaxResult.success(pageInfo);
    }
}
