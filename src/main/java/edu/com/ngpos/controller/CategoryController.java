package edu.com.ngpos.controller;

import edu.com.ngpos.core.domain.AjaxResult;
import edu.com.ngpos.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 类别控制器
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
//    @Qualifier(value = "CategoryServiceImpl")
    private ICategoryService categoryService;

    @GetMapping("/{categoryId}")
    public AjaxResult getById(@PathVariable("categoryId") Long categoryId) {
        return AjaxResult.success(categoryService.getCategoryById(categoryId));
    }

    @GetMapping("/listAll")
    public AjaxResult listAll(){
        return AjaxResult.success(categoryService.listAllCategory());
    }
}
