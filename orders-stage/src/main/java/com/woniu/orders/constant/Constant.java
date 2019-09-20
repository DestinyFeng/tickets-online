package com.woniu.orders.constant;
//这是常量类
public class Constant {
    public enum Page{
        PAGE_DISPLAYED (10);
        private int  pageData;



        Page(int pageData) {
            this.pageData=pageData;
        }
         public int getpageData() {
            return pageData;
        }

    }
      public enum OrderStatusEnum{
        CANCELED(0,"订单超时"),
        NO_PAY(10,"未支付"),
        PAID(20,"已付款"),
        ORDER_SUCCESS(30,"订单完成"),
        ORDER_CLOSE(40,"已退款");


        OrderStatusEnum(int code,String value){
            this.code = code;
            this.value = value;
        }
        private String value;
        private int code;

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static OrderStatusEnum codeOf(int code){
            for(OrderStatusEnum orderStatusEnum : values()){
                if(orderStatusEnum.getCode() == code){
                    return orderStatusEnum;
                }
            }
            throw new RuntimeException("么有找到对应的枚举");
        }
    }
}
