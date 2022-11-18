package edu.com.ngpos.test.service;

import edu.com.ngpos.domain.ProductDescription;
import edu.com.ngpos.mapper.ProductCatalog;
import edu.com.ngpos.service.IProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceImplTest {
    @Autowired
    private IProductService productService;

    @Test
    void getProductBySn() {
        ProductDescription p = productService.getProductBySn("1001");
        System.out.println(p);
        Assertions.assertEquals(1L,p.getProductId(),"SN查找product失败");

    }

    @Test
    void listAllProduct() {
        ProductDescription p = new ProductDescription();
//        p.setProductSn("1005");
        p.setProductName("笔");
        List<ProductDescription> products = productService.listAllProduct(p);
        System.out.println(products);
    }
}