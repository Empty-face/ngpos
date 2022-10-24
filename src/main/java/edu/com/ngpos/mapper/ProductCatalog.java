package edu.com.ngpos.mapper;

import edu.com.ngpos.domain.Category;
import edu.com.ngpos.domain.ProductDescription;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//@Component
//加在dao上的一个注解
@Repository
public class ProductCatalog {

    //Map HashMap key-value Map<String,Object>
    private Map<String,Category> categories = new HashMap<>();
    private Map<String,ProductDescription> products = new HashMap<>();
    public ProductCatalog(){
        Category category1 = new Category(1L,"文具");
        Category category2 = new Category(2L,"日用品");
        ProductDescription product1 = new ProductDescription(1L,"1001",category1,"钢笔",new BigDecimal("65.00"));
        ProductDescription product2 = new ProductDescription(2L,"1002",category1,"日记本",new BigDecimal("20.00"));
        ProductDescription product3 = new ProductDescription(3L,"1003",category1,"铅笔盒 ",new BigDecimal("45.00"));
        ProductDescription product4 = new ProductDescription(4L,"1004",category2,"毛巾",new BigDecimal("10.00"));
        ProductDescription product5 = new ProductDescription(5L,"1005",category2,"香波",new BigDecimal("80.00"));
        ProductDescription product6 = new ProductDescription(6L,"1006",category2,"拖鞋",new BigDecimal("30.00"));
        products.put(product1.getProductSn(),product1);
        products.put(product2.getProductSn(),product2);
        products.put(product3.getProductSn(),product3);
        products.put(product4.getProductSn(),product4);
        products.put(product5.getProductSn(),product5);
        products.put(product6.getProductSn(),product6);
        categories.put(category1.getCategoryId().toString(),category1);
        categories.put(category2.getCategoryId().toString(),category2);
    }

    /**
     * 根据ID获取category对象
     */

    public Category getCategoryById(Long categoryId){
        Category category = categories.get(categoryId.toString());
        return category;
    }

    /**
     * 查询所有的category
     * @return
     */
    public List<Category> listAllCategory(){
        List<Category> categoryList = new ArrayList<>();
        for (Category c : categories.values()){
            categoryList.add(c);
        }
        return categoryList;
    }

    /**
     * 根据编号获得product对象
     * @param productSn
     * @return
     */
    public ProductDescription getProductBySn(String productSn){
        ProductDescription product = products.get(productSn);
        return product;
    }

    /**
     * 查询所有的product
     * @return
     */
    public List<ProductDescription> listAllProduct(){
        List<ProductDescription> productDescriptionList = new ArrayList<>();
        for (ProductDescription p: products.values()){
            productDescriptionList.add(p);
        }
        return productDescriptionList;
    }

}
