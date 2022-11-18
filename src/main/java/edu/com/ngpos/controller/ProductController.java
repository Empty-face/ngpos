package edu.com.ngpos.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.com.ngpos.core.domain.AjaxResult;
import edu.com.ngpos.domain.ProductDescription;
import edu.com.ngpos.service.IProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public AjaxResult listAllProduct(ProductDescription productDescription) {
        return AjaxResult.success(productService.listAllProduct(productDescription));
    }

    @PostMapping
    @ApiOperation("新增产品")
    public AjaxResult add(@RequestBody ProductDescription product) {
        int rows = productService.insertProduct(product);
        return rows > 0 ? AjaxResult.success("添加产品成功") : AjaxResult.error("添加产品失败");
    }

    @PutMapping
    @ApiOperation("修改产品")
    public AjaxResult edit(@RequestBody ProductDescription product) {
        int rows = productService.updateProduct(product);
        return rows > 0 ? AjaxResult.success("修改产品成功") : AjaxResult.error("修改产品失败");
    }

    @DeleteMapping("/{productId}")
    @ApiOperation("删除产品")
    public AjaxResult remove(@PathVariable Long productId) {
        int rows = productService.deleteProductById(productId);
        return rows > 0 ? AjaxResult.success("删除产品成功") : AjaxResult.error("删除产品失败");
    }



//    @GetMapping("/listAll")
//    @ApiOperation("列出所有产品")
//    public AjaxResult listAll(){
//        return AjaxResult.success(productService.listAllProduct());
//    }
//
//    @GetMapping("/list")
//    @ApiOperation("查询产品列表")
//    public AjaxResult list(ProductDescription product) {
//        List<ProductDescription> list = productService.selectProductList(product);
//        return AjaxResult.success(list);
//    }

    @GetMapping("/page")
    @ApiOperation("分页查询")
    public AjaxResult page(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize, ProductDescription product) {
        PageHelper.startPage(pageNum,pageSize);
        List<ProductDescription> list = productService.selectProductList(product);
        PageInfo<ProductDescription> pageInfo = new PageInfo(list);
        return AjaxResult.success(pageInfo);
    }
}
