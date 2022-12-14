package edu.com.ngpos.service;

import edu.com.ngpos.domain.ProductDescription;

import java.math.BigDecimal;

public interface ISaleService {
    /**
     * 开始新的销售
     */
    void makeNewSale();

    /**
     * 实例化SaleItem
     * @param product 商品对象
     * @param quantity 数量
     */
    void makeLineItem(ProductDescription product, int quantity);

    /**
     * 结束订单商品录入
     * @return 总金额
     */
    BigDecimal endSale();

    /**
     * 订单支付
     * @param cashTendered 付款金额
     * @return 找零
     */
    BigDecimal makePayment(BigDecimal cashTendered);
}
