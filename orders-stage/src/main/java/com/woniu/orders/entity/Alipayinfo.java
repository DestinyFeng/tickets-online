package com.woniu.orders.entity;

import java.util.Date;



public class Alipayinfo {
    /**
     * 商家订单主键
     */
    private Integer clubOrderId;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 交易状态
     */
    private Byte tradeStatus;

    /**
     * 订单金额
     */
    private Double totalAmount;

    /**
     * 实收金额
     */
    private Double receiptAmount;

    /**
     * 开票金额
     */
    private Double invoiceAmount;

    /**
     * 付款金额
     */
    private Double buyerPayAmount;

    /**
     * 总退款金额
     */
    private Double refundFee;

    /**
     * 通知时间
     */
    private Date notifyTime;

    /**
     * 交易创建时间
     */
    private Date gmtCreate;

    /**
     * 交易付款时间
     */
    private Date gmtPayment;

    /**
     * 交易退款时间
     */
    private Date gmtRefund;

    /**
     * 交易结束时间
     */
    private Date gmtClose;

    /**
     * 支付宝的交易号
     */
    private String tradeno;

    /**
     * 商户业务号
     */
    private String outBizno;

    /**
     * 买家支付宝账号
     */
    private String buyerLogonId;

    /**
     * 卖家支付宝用户号
     */
    private String sellerId;

    public Integer getClubOrderId() {
        return clubOrderId;
    }

    public void setClubOrderId(Integer clubOrderId) {
        this.clubOrderId = clubOrderId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Byte getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Byte tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Double getBuyerPayAmount() {
        return buyerPayAmount;
    }

    public void setBuyerPayAmount(Double buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    public Double getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Double refundFee) {
        this.refundFee = refundFee;
    }

    public Date getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtPayment() {
        return gmtPayment;
    }

    public void setGmtPayment(Date gmtPayment) {
        this.gmtPayment = gmtPayment;
    }

    public Date getGmtRefund() {
        return gmtRefund;
    }

    public void setGmtRefund(Date gmtRefund) {
        this.gmtRefund = gmtRefund;
    }

    public Date getGmtClose() {
        return gmtClose;
    }

    public void setGmtClose(Date gmtClose) {
        this.gmtClose = gmtClose;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getOutBizno() {
        return outBizno;
    }

    public void setOutBizno(String outBizno) {
        this.outBizno = outBizno;
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return "Alipayinfo{" +
                "clubOrderId=" + clubOrderId +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", tradeStatus=" + tradeStatus +
                ", totalAmount=" + totalAmount +
                ", receiptAmount=" + receiptAmount +
                ", invoiceAmount=" + invoiceAmount +
                ", buyerPayAmount=" + buyerPayAmount +
                ", refundFee=" + refundFee +
                ", notifyTime=" + notifyTime +
                ", gmtCreate=" + gmtCreate +
                ", gmtPayment=" + gmtPayment +
                ", gmtRefund=" + gmtRefund +
                ", gmtClose=" + gmtClose +
                ", tradeno='" + tradeno + '\'' +
                ", outBizno='" + outBizno + '\'' +
                ", buyerLogonId='" + buyerLogonId + '\'' +
                ", sellerId='" + sellerId + '\'' +
                '}';
    }
}