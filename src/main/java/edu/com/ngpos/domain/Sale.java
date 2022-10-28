package edu.com.ngpos.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 销售实体类
 * 标准POJO类
 */
public class Sale implements Serializable {
    // 主键
    private Long saleId;
    // 订单编号
    private String saleNo;
    // 总金额
    private BigDecimal total;
    //　销售时间
    private Date saleTime;
    // 状态
    private String status;
    // 订单的商品明细
    private List<SaleItem> saleItems = new ArrayList<>();
    // 支付
    private Payment payment;

    // 无参的构造方法
    public Sale() {
    }

    // 为了测试方便，我们会加上一个有参的全构造方法
    public Sale(Long saleId, String saleNo, BigDecimal total, Date saleTime, String status, List<SaleItem> saleItems, Payment payment) {
        this.saleId = saleId;
        this.saleNo = saleNo;
        this.total = total;
        this.saleTime = saleTime;
        this.status = status;
        this.saleItems = saleItems;
        this.payment = payment;
    }

    // Setter和Getter

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void setSaleItems(List<SaleItem> saleItems) {
        this.saleItems = saleItems;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // 为了打印方便，我们复写toString方法

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", saleNo='" + saleNo + '\'' +
                ", total=" + total +
                ", saleTime=" + saleTime +
                ", status='" + status + '\'' +
                ", saleItems=" + saleItems +
                ", payment=" + payment +
                '}';
    }
}

