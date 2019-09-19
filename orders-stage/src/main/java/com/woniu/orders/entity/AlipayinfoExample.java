package com.woniu.orders.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlipayinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlipayinfoExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andClubOrderIdIsNull() {
            addCriterion("club_order_id is null");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdIsNotNull() {
            addCriterion("club_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdEqualTo(Integer value) {
            addCriterion("club_order_id =", value, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdNotEqualTo(Integer value) {
            addCriterion("club_order_id <>", value, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdGreaterThan(Integer value) {
            addCriterion("club_order_id >", value, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("club_order_id >=", value, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdLessThan(Integer value) {
            addCriterion("club_order_id <", value, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("club_order_id <=", value, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdIn(List<Integer> values) {
            addCriterion("club_order_id in", values, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdNotIn(List<Integer> values) {
            addCriterion("club_order_id not in", values, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("club_order_id between", value1, value2, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andClubOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("club_order_id not between", value1, value2, "clubOrderId");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNull() {
            addCriterion("trade_status is null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIsNotNull() {
            addCriterion("trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andTradeStatusEqualTo(Boolean value) {
            addCriterion("trade_status =", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotEqualTo(Boolean value) {
            addCriterion("trade_status <>", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThan(Boolean value) {
            addCriterion("trade_status >", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("trade_status >=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThan(Boolean value) {
            addCriterion("trade_status <", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("trade_status <=", value, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusIn(List<Boolean> values) {
            addCriterion("trade_status in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotIn(List<Boolean> values) {
            addCriterion("trade_status not in", values, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("trade_status between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("trade_status not between", value1, value2, "tradeStatus");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Double value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Double value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Double value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Double value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Double value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Double> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Double> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Double value1, Double value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Double value1, Double value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountIsNull() {
            addCriterion("receipt_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountIsNotNull() {
            addCriterion("receipt_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountEqualTo(Double value) {
            addCriterion("receipt_amount =", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotEqualTo(Double value) {
            addCriterion("receipt_amount <>", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountGreaterThan(Double value) {
            addCriterion("receipt_amount >", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("receipt_amount >=", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountLessThan(Double value) {
            addCriterion("receipt_amount <", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountLessThanOrEqualTo(Double value) {
            addCriterion("receipt_amount <=", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountIn(List<Double> values) {
            addCriterion("receipt_amount in", values, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotIn(List<Double> values) {
            addCriterion("receipt_amount not in", values, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountBetween(Double value1, Double value2) {
            addCriterion("receipt_amount between", value1, value2, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotBetween(Double value1, Double value2) {
            addCriterion("receipt_amount not between", value1, value2, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNull() {
            addCriterion("invoice_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIsNotNull() {
            addCriterion("invoice_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountEqualTo(Double value) {
            addCriterion("invoice_amount =", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotEqualTo(Double value) {
            addCriterion("invoice_amount <>", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThan(Double value) {
            addCriterion("invoice_amount >", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("invoice_amount >=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThan(Double value) {
            addCriterion("invoice_amount <", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountLessThanOrEqualTo(Double value) {
            addCriterion("invoice_amount <=", value, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountIn(List<Double> values) {
            addCriterion("invoice_amount in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotIn(List<Double> values) {
            addCriterion("invoice_amount not in", values, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountBetween(Double value1, Double value2) {
            addCriterion("invoice_amount between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAmountNotBetween(Double value1, Double value2) {
            addCriterion("invoice_amount not between", value1, value2, "invoiceAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountIsNull() {
            addCriterion("buyer_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountIsNotNull() {
            addCriterion("buyer_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountEqualTo(Double value) {
            addCriterion("buyer_pay_amount =", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountNotEqualTo(Double value) {
            addCriterion("buyer_pay_amount <>", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountGreaterThan(Double value) {
            addCriterion("buyer_pay_amount >", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("buyer_pay_amount >=", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountLessThan(Double value) {
            addCriterion("buyer_pay_amount <", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountLessThanOrEqualTo(Double value) {
            addCriterion("buyer_pay_amount <=", value, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountIn(List<Double> values) {
            addCriterion("buyer_pay_amount in", values, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountNotIn(List<Double> values) {
            addCriterion("buyer_pay_amount not in", values, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountBetween(Double value1, Double value2) {
            addCriterion("buyer_pay_amount between", value1, value2, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andBuyerPayAmountNotBetween(Double value1, Double value2) {
            addCriterion("buyer_pay_amount not between", value1, value2, "buyerPayAmount");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNull() {
            addCriterion("refund_fee is null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIsNotNull() {
            addCriterion("refund_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFeeEqualTo(Double value) {
            addCriterion("refund_fee =", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotEqualTo(Double value) {
            addCriterion("refund_fee <>", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThan(Double value) {
            addCriterion("refund_fee >", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("refund_fee >=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThan(Double value) {
            addCriterion("refund_fee <", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeLessThanOrEqualTo(Double value) {
            addCriterion("refund_fee <=", value, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeIn(List<Double> values) {
            addCriterion("refund_fee in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotIn(List<Double> values) {
            addCriterion("refund_fee not in", values, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeBetween(Double value1, Double value2) {
            addCriterion("refund_fee between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andRefundFeeNotBetween(Double value1, Double value2) {
            addCriterion("refund_fee not between", value1, value2, "refundFee");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIsNull() {
            addCriterion("notify_time is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIsNotNull() {
            addCriterion("notify_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeEqualTo(Date value) {
            addCriterion("notify_time =", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotEqualTo(Date value) {
            addCriterion("notify_time <>", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeGreaterThan(Date value) {
            addCriterion("notify_time >", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_time >=", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLessThan(Date value) {
            addCriterion("notify_time <", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("notify_time <=", value, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeIn(List<Date> values) {
            addCriterion("notify_time in", values, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotIn(List<Date> values) {
            addCriterion("notify_time not in", values, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeBetween(Date value1, Date value2) {
            addCriterion("notify_time between", value1, value2, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andNotifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("notify_time not between", value1, value2, "notifyTime");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentIsNull() {
            addCriterion("gmt_payment is null");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentIsNotNull() {
            addCriterion("gmt_payment is not null");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentEqualTo(Date value) {
            addCriterion("gmt_payment =", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentNotEqualTo(Date value) {
            addCriterion("gmt_payment <>", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentGreaterThan(Date value) {
            addCriterion("gmt_payment >", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_payment >=", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentLessThan(Date value) {
            addCriterion("gmt_payment <", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentLessThanOrEqualTo(Date value) {
            addCriterion("gmt_payment <=", value, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentIn(List<Date> values) {
            addCriterion("gmt_payment in", values, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentNotIn(List<Date> values) {
            addCriterion("gmt_payment not in", values, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentBetween(Date value1, Date value2) {
            addCriterion("gmt_payment between", value1, value2, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtPaymentNotBetween(Date value1, Date value2) {
            addCriterion("gmt_payment not between", value1, value2, "gmtPayment");
            return (Criteria) this;
        }

        public Criteria andGmtRefundIsNull() {
            addCriterion("gmt_refund is null");
            return (Criteria) this;
        }

        public Criteria andGmtRefundIsNotNull() {
            addCriterion("gmt_refund is not null");
            return (Criteria) this;
        }

        public Criteria andGmtRefundEqualTo(Date value) {
            addCriterion("gmt_refund =", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundNotEqualTo(Date value) {
            addCriterion("gmt_refund <>", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundGreaterThan(Date value) {
            addCriterion("gmt_refund >", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_refund >=", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundLessThan(Date value) {
            addCriterion("gmt_refund <", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundLessThanOrEqualTo(Date value) {
            addCriterion("gmt_refund <=", value, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundIn(List<Date> values) {
            addCriterion("gmt_refund in", values, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundNotIn(List<Date> values) {
            addCriterion("gmt_refund not in", values, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundBetween(Date value1, Date value2) {
            addCriterion("gmt_refund between", value1, value2, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtRefundNotBetween(Date value1, Date value2) {
            addCriterion("gmt_refund not between", value1, value2, "gmtRefund");
            return (Criteria) this;
        }

        public Criteria andGmtCloseIsNull() {
            addCriterion("gmt_close is null");
            return (Criteria) this;
        }

        public Criteria andGmtCloseIsNotNull() {
            addCriterion("gmt_close is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCloseEqualTo(Date value) {
            addCriterion("gmt_close =", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseNotEqualTo(Date value) {
            addCriterion("gmt_close <>", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseGreaterThan(Date value) {
            addCriterion("gmt_close >", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_close >=", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseLessThan(Date value) {
            addCriterion("gmt_close <", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseLessThanOrEqualTo(Date value) {
            addCriterion("gmt_close <=", value, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseIn(List<Date> values) {
            addCriterion("gmt_close in", values, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseNotIn(List<Date> values) {
            addCriterion("gmt_close not in", values, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseBetween(Date value1, Date value2) {
            addCriterion("gmt_close between", value1, value2, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andGmtCloseNotBetween(Date value1, Date value2) {
            addCriterion("gmt_close not between", value1, value2, "gmtClose");
            return (Criteria) this;
        }

        public Criteria andTradenoIsNull() {
            addCriterion("tradeNo is null");
            return (Criteria) this;
        }

        public Criteria andTradenoIsNotNull() {
            addCriterion("tradeNo is not null");
            return (Criteria) this;
        }

        public Criteria andTradenoEqualTo(String value) {
            addCriterion("tradeNo =", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotEqualTo(String value) {
            addCriterion("tradeNo <>", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoGreaterThan(String value) {
            addCriterion("tradeNo >", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoGreaterThanOrEqualTo(String value) {
            addCriterion("tradeNo >=", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLessThan(String value) {
            addCriterion("tradeNo <", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLessThanOrEqualTo(String value) {
            addCriterion("tradeNo <=", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLike(String value) {
            addCriterion("tradeNo like", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotLike(String value) {
            addCriterion("tradeNo not like", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoIn(List<String> values) {
            addCriterion("tradeNo in", values, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotIn(List<String> values) {
            addCriterion("tradeNo not in", values, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoBetween(String value1, String value2) {
            addCriterion("tradeNo between", value1, value2, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotBetween(String value1, String value2) {
            addCriterion("tradeNo not between", value1, value2, "tradeno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoIsNull() {
            addCriterion("out_bizNo is null");
            return (Criteria) this;
        }

        public Criteria andOutBiznoIsNotNull() {
            addCriterion("out_bizNo is not null");
            return (Criteria) this;
        }

        public Criteria andOutBiznoEqualTo(String value) {
            addCriterion("out_bizNo =", value, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoNotEqualTo(String value) {
            addCriterion("out_bizNo <>", value, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoGreaterThan(String value) {
            addCriterion("out_bizNo >", value, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoGreaterThanOrEqualTo(String value) {
            addCriterion("out_bizNo >=", value, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoLessThan(String value) {
            addCriterion("out_bizNo <", value, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoLessThanOrEqualTo(String value) {
            addCriterion("out_bizNo <=", value, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoLike(String value) {
            addCriterion("out_bizNo like", value, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoNotLike(String value) {
            addCriterion("out_bizNo not like", value, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoIn(List<String> values) {
            addCriterion("out_bizNo in", values, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoNotIn(List<String> values) {
            addCriterion("out_bizNo not in", values, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoBetween(String value1, String value2) {
            addCriterion("out_bizNo between", value1, value2, "outBizno");
            return (Criteria) this;
        }

        public Criteria andOutBiznoNotBetween(String value1, String value2) {
            addCriterion("out_bizNo not between", value1, value2, "outBizno");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdIsNull() {
            addCriterion("buyer_logon_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdIsNotNull() {
            addCriterion("buyer_logon_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdEqualTo(String value) {
            addCriterion("buyer_logon_id =", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdNotEqualTo(String value) {
            addCriterion("buyer_logon_id <>", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdGreaterThan(String value) {
            addCriterion("buyer_logon_id >", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_logon_id >=", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdLessThan(String value) {
            addCriterion("buyer_logon_id <", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdLessThanOrEqualTo(String value) {
            addCriterion("buyer_logon_id <=", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdLike(String value) {
            addCriterion("buyer_logon_id like", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdNotLike(String value) {
            addCriterion("buyer_logon_id not like", value, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdIn(List<String> values) {
            addCriterion("buyer_logon_id in", values, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdNotIn(List<String> values) {
            addCriterion("buyer_logon_id not in", values, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdBetween(String value1, String value2) {
            addCriterion("buyer_logon_id between", value1, value2, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andBuyerLogonIdNotBetween(String value1, String value2) {
            addCriterion("buyer_logon_id not between", value1, value2, "buyerLogonId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}