package edu.com.ngpos.view;

import edu.com.ngpos.domain.ProductDescription;
import edu.com.ngpos.mapper.ProductCatalog;
import edu.com.ngpos.service.ISaleService;
import edu.com.ngpos.vo.SaleItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 记账本
 * GRASP:控制器
 */
@Component
public class Register {
    @Autowired
    private ISaleService saleService;

    @Autowired
    private ProductCatalog productCatalog;

    /**
     * 开始一次新的销售
     */
    public void makeNewSale(){
        saleService.makeNewSale();

    }
    /**
     * 输入商品
     * @param itemSn
     * @param quantity
     */
    public SaleItemVo enterItem(String itemSn, int quantity){
        SaleItemVo saleItemVo = null;
        ProductDescription product = productCatalog.getProductBySn(itemSn);
        if(product != null) {
            saleService.makeLineItem(product, quantity);
            saleItemVo = new SaleItemVo(itemSn, product.getProductName(), product.getPrice(), quantity);
        }
        return saleItemVo;
    }
    /**
     * 结束销售
     */
    public BigDecimal endSale(){
        return saleService.endSale();
    }
    /**
     * 确认支付
     * @param cashTendered
     */
    public BigDecimal makePayment(BigDecimal cashTendered){
        return saleService.makePayment(cashTendered);
    }
}
