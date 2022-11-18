package edu.com.ngpos.service.impl;

import edu.com.ngpos.domain.ProductDescription;
import edu.com.ngpos.mapper.CategoryMapper;
import edu.com.ngpos.mapper.ProductMapper;
import edu.com.ngpos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public ProductDescription getProductBySn(String productSn) {
        return productMapper.getProductBySn(productSn);
    }

    @Override
    public List<ProductDescription> listAllProduct(ProductDescription productDescription) {
        return productMapper.listAllProduct();
    }

    /**
     * 根据SN找产品
     * @param productSn
     * @return
     */
    @Override
    public ProductDescription getProductByProductSn(String productSn){
        return productMapper.getProductBySn(productSn);
    }

    /**
     * 列出所有产品
     * @return
     */
    @Override
    public List<ProductDescription> listAllProduct(){
        return productMapper.listAllProduct();
    }

    @Override
    public ProductDescription selectProductById(Long productId) {
        return productMapper.selectProductById(productId);
    }

    @Override
    public List<ProductDescription> selectProductList(ProductDescription productDescription) {
        return productMapper.selectProductList(productDescription);
    }

    @Override
    public int insertProduct(ProductDescription productDescription) {
        productDescription.setCreateTime(new Date());
        return productMapper.insertProduct(productDescription);
    }

    @Override
    public int updateProduct(ProductDescription productDescription) {
        productDescription.setUpdateTime(new Date());
        return productMapper.updateProduct(productDescription);
    }

    @Override
    public int deleteProductById(Long productId) {
        return productMapper.deleteProductById(productId);
    }
}
