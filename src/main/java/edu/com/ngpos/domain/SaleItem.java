package edu.com.ngpos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class SaleItem implements Serializable {
    // 主键
    private Long saleItemId;
    // 产品
    private ProductDescription productDescription;
    // 数量
    private int quantity;

    public SaleItem() {
    }

    public SaleItem(Long saleItemId, ProductDescription productDescription, int quantity) {
        this.saleItemId = saleItemId;
        this.productDescription = productDescription;
        this.quantity = quantity;
    }

    public Long getSaleItemId() {
        return saleItemId;
    }

    // Setter和Getter
    public void setSaleItemId(Long saleItemId) {
        this.saleItemId = saleItemId;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SaleItem{" +
                "saleItemId=" + saleItemId +
                ", productDescription=" + productDescription +
                ", quantity=" + quantity +
                '}';
    }

    /**
     * 计算小计
     * @return 小计
     */
    public BigDecimal getSubTotal(){
        BigDecimal subTotal =  productDescription.getPrice().multiply(new BigDecimal(quantity));
        return subTotal;
    }


}
