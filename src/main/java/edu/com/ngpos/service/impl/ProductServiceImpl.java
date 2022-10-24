package edu.com.ngpos.service.impl;

import edu.com.ngpos.domain.ProductDescription;
import edu.com.ngpos.mapper.ProductCatalog;
import edu.com.ngpos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
//
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired

    private ProductCatalog productCatalog;
    @Override
    public ProductDescription getProductBySn(String productSn) {
        return productCatalog.getProductBySn(productSn);
    }

    @Override
    public List<ProductDescription> listAllProduct() {
        return productCatalog.listAllProduct();
    }
}
