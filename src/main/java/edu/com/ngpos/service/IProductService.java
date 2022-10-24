package edu.com.ngpos.service;

import edu.com.ngpos.domain.ProductDescription;

import java.util.List;

/**
 * 产品服务接口
 */
public interface IProductService {
    /**
     * 根据编号获得product对象
     * @param productSn
     * @return
     */
    public ProductDescription getProductBySn(String productSn);
    /**
     * 查询所有的product
     * @return
     */
    public List<ProductDescription> listAllProduct();
}
