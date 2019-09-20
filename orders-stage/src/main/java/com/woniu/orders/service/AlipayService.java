package com.woniu.orders.service;

import com.alipay.api.AlipayApiException;
import com.woniu.orders.util.Result;
/*import com.woniu.common.ServerResponse;*/

import java.text.ParseException;
import java.util.Map;

public interface AlipayService {

    /**
     * web端订单支付
     *
     * @param outTradeNo  订单编号（唯一）
     * @param totalAmount 订单价格
     * @param subject     商品名称
     */
    String webPagePay(String outTradeNo, String totalAmount, String subject) throws Exception;

    /**
     * app端订单支付
     *
     * @param outTradeNo  订单编号
     * @param totalAmount 订单价格
     * @param subject     商品名称
     */
    String appPagePay(String outTradeNo, String totalAmount, String subject) throws Exception;

    /**
     * 退款
     *
     * @param outTradeNo   订单编号
     * @param refundReason 退款原因
     * @param refundAmount 退款金额
     * @param outRequestNo 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传
     */
    String insertRefund(String outTradeNo, String refundReason, String refundAmount, String outRequestNo) throws Exception;

    /**
     * 交易查询
     *
     * @param outTradeNo 订单编号（唯一）
     */
    String query(String outTradeNo) throws Exception;

    /**
     * 交易关闭
     *
     * @param outTradeNo 订单编号（唯一）
     */
    String close(String outTradeNo) throws Exception;

    /**
     * 退款查询
     *
     * @param outTradeNo   订单编号（唯一）
     * @param outRequestNo 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传
     */
    String refundQuery(String outTradeNo, String outRequestNo) throws Exception;

    String insertAliCallback(Map<String, String> conversionParams) throws Exception;
}
