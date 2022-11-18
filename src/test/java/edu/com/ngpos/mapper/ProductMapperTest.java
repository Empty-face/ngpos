package edu.com.ngpos.mapper;

import edu.com.ngpos.domain.ProductDescription;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.util.Assert;

import java.math.BigDecimal;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)  // 是否回滚，设为false即会更新数据库，设为true则不会更新。
class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;

    @Test
    void selectProductById() {
//        ProductDescription p = productMapper.selectProductById(1l);
//        System.out.println(p);
        ProductDescription p = productMapper.getProductBySn("1001");
        Assert.isTrue(p.getProductId()==1,"测试根据sn查询");
    }

    @Test
    void selectProductList() {
        ProductDescription param = productMapper.selectProductById(1L);
        param.setProductName("笔");
        System.out.println(productMapper.selectProductList(param));
    }

    @Test
    void insertProduct() {
        ProductDescription newProduct = new ProductDescription();
        newProduct.setProductSn("1008");
        newProduct.setProductName("牙膏");
        newProduct.setPrice(new BigDecimal("15.00"));
        System.out.println(productMapper.insertProduct(newProduct));
    }

    @Test
    void updateProduct() {
        ProductDescription p = productMapper.getProductBySn("1007");
        p.setProductName("牙刷");
        p.setPrice(new BigDecimal("5.00"));
        System.out.println(productMapper.updateProduct(p));
    }

    @Test
    void deleteProductById() {
        System.out.println(productMapper.deleteProductById(7l));
    }
}