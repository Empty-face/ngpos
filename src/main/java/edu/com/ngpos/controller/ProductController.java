package edu.com.ngpos.controller;

import edu.com.ngpos.core.domain.AjaxResult;
import edu.com.ngpos.service.IProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @ApiOperation("根据sn查找product")
    @GetMapping("/{productSn}")
    public AjaxResult getBySn(@PathVariable("productSn") String productSn) {
        return AjaxResult.success(productService.getProductBySn(productSn));

    }

    @ApiOperation("查询所有product")
    @GetMapping("/listAll")
    public AjaxResult listAllProduct() {
        return AjaxResult.success(productService.listAllProduct());
    }

}
