/**
 * FunName:  函数名
 * Description :   描述这个方法是干嘛的
 * Create Date:
 *
 * @exception Exception   异常没有处理
 * @param 参数名(如果没有删除改行)  参数说明
 * @return 返回值类型, 如没有, 删除该行 返回是否找到
 * @author LIUTAO
 */
package com.woniu.orders.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String APP_ID = "2016101100663043";

	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String MERCHANT_PRIVATE_KEY ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCC2JHOJVbKobfu4Ct4hYqRxDMvP+bpY5C9g6MHwMy/8LsulkzF8rC0APIXf8wpVzYPnoMv56l86J+A8L9toDv9UmwgYRxWclv0MappbPZ53HDc28qeynimOicL4LYgXAXDOw31NQ+0bX3ecocRkL4G4O1QUSQDblM9iFIi5kju6LldQ+zPLuTlXxMhu/KAKNK2FTQyivAysXiFwaOa5757nlhdFf5cYvJYe+JckyRMAt3Fc1/LtpFDSMOMFCbhGCGtX33FAhxJYSAqKGnGGBU6WWKQU8+qLOF+81tAZZMBn55+Ke4hIa6NMFgB/K/ZxMzOlMWLVleZVv1EMRJAP+nhAgMBAAECggEAKPTlXuOtMSxByNH+iXEzmMETTHzyKKfzzH6B75FYBdSyoriFO4jl6tJI9TYZj+8uiuERK1OWZ/TgyJmTMhtv67F7Cv+awSx2wA8zymBDHo3z/g4GdIHoFhAp3LvwBl0HqL65dcGwMsf7GEA9KzBlav3JCtT7Mt+7yoz7ONVgivdyDguKVSwxv0xeiLIen+4vAfIyXd/ObUJ1qcC6gwutLKXzSo4bwf4pXZ+4NNPyzZGFT/O/XrVBCfhnG4bwEfdmXAZmeFaqNEYNYO3pslE3UrUi8KHHAWS+ETzQN881Q3lQWl6V3EuY2Jrss9WutEk2NUrvBMPcAy1XnigUHnzKqQKBgQD3V3V5XGi7Ep95YK89Qtnl4SHhglimWfrnoGMhE2TdFDHA6pkA+EesPizCkT7+zKC+z8XFA9FdIEM+r6rGBXlAtHeJhU4hSyvvLf5xerw7JfwSZkV5JPoVCQc55bk2zXKQNOrc0I5iE913T+nCVU8T5rRNOHBF3qm9f4Q4Wd4jswKBgQCHbSPUWoH9dAd7vZjiPTksrJo3jrMrtU+TUHYkcDj5tae+gEXaOSD/Uq1Lg8unFqcx/BRK6GIzBfoMr7XU2qD/B5J9Yw4fvsjs6SeEImPxZE0Ry7QkafJjKSOLi4yf26QJEt/4/n5RvNbqy1onH0dknUlRKud1DSXdKclAJepCGwKBgQDR7eE/CDe7z6qbEnypujvG6LYg+MjVKDnUrkR0pklNev5fhr4mHJR4lKzY1v5otLUaPq7U8NCaAfARHHgNakfnq0Rp7ELL70lyz87N8iYg7bRsyXDdyYyYnfkMIvZ4lRdPXhqZIEo45DNsON9mmZFsirstb2Gba8kVlU1bpqrsEQKBgGkkoUbDplzjctPtlf9AzV0T/P/ZeN4cfNXBCJit0G5/TOcorBMLe8T/qbAReVIW0mSKdC7cUTGQGF01JpVF0O1wMZnMCDE5bMITGy0JjlLiLrv8TbZf02KNlB1JkTqjyq2Iy/+Dhwtq8+mDTFFHhaRmQYAVMXK9bIJTaP628TO1AoGAE6xNmgr3UhS+tLYXx5vJlbnekTJjq0Jz7vjUpHi7HOqQFDcKo7lZhFuuXGDcm96tb8+whNMWW7/HXf0expHL3fgqsnKAspWMc3PIuhQa9tKFewv3xN1FDa3TVd1FAzvT9EyUfcEje0e7C4Z35fPPTZB8oVu2So68Kw1cd2zlqRQ=";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArc0E3GbRBSqvWHqUFrAdggWFQpWNIIwcujQsVjUP3u9v3D7ZPxaW+SBUIa7QsY1u5JPa9Duq51nuK+M5Sz8GEuz0Qab6knO1FpRkKHEz+7M/FS9js+ewRGLjFT7I6zKY9OTovZ4DJnfkbrcUiuKsN8E8I082UObyd4hJ9gDxotwj66H2XZJjwR7ZsQMdO9F5Hn+lyzm6zg2Vtkmu/Q6YffaoAaXUWFHsKeE4F2jVSrw9NqXDHc0fpqGkVk+lM3sWCGLnhYdcm4fraoHoS2jfLFVrOId318N2fczohhQhI0FRySJIN97r/ntbcK8vQ+CJWJhe8NKr6G8vPazUbs4tHQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://v266p12387.wicp.vip/orders/pay/alipay_callback";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	/*public static String return_url = "http://localhost/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";*/
    public static String return_url = "http://v266p12387.wicp.vip/web/profile/orders.html";
	// 签名方式，注意这里，如果步骤设置的是RSA则用RSA
	public static String SIGN_TYPE = "RSA2";

	// 字符编码格式
	public static String CHARSET = "UTF-8";

	// 支付宝网关
	public static String GATEWAYURL  = "https://openapi.alipaydev.com/gateway.do";

	// 支付宝网关
	public static String log_path = "C:\\";


}
