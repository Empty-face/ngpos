package edu.com.ngpos.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 前端Swing的（总之给前端用的）
 */
public class SaleItemVo implements Serializable {
    private String itemSn;
    private String productName;
    private BigDecimal price;
    private int quantity;

    public SaleItemVo() {
    }

    public SaleItemVo(String itemSn, String productName, BigDecimal price, int quantity) {
        this.itemSn = itemSn;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemSn() {
        return itemSn;
    }

    public void setItemSn(String itemSn) {
        this.itemSn = itemSn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
