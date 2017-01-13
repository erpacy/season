package org.seasonteam.season.util;

import com.cloopen.rest.sdk.CCPRestSmsSDK;

import java.util.HashMap;

/**
 * acyyu
 * <p>
 * 2017-01-13
 */
public class SmsUtil {

    private static CCPRestSmsSDK restAPI = new CCPRestSmsSDK();

    static {
        //******************************注释*********************************************
        //*初始化服务器地址和端口                                                       *
        //*沙盒环境（用于应用开发调试）：restAPI.init("sandboxapp.cloopen.com", "8883");*
        //*生产环境（用户应用上线使用）：restAPI.init("app.cloopen.com", "8883");       *
        //*******************************************************************************
        restAPI.init("app.cloopen.com", "8883");

        //******************************注释*********************************************
        //*初始化主帐号和主帐号令牌,对应官网开发者主账号下的ACCOUNT SID和AUTH TOKEN     *
        //*ACOUNT SID和AUTH TOKEN在登陆官网后，在“应用-管理控制台”中查看开发者主账号获取*
        //*参数顺序：第一个参数是ACOUNT SID，第二个参数是AUTH TOKEN。                   *
        //*******************************************************************************
        restAPI.setAccount("8aaf07085995ddef0159962be563002d", "dcff1e5fed244dfa89616ab4b9b4ca7f");


        //******************************注释*********************************************
        //*初始化应用ID                                                                 *
        //*测试开发可使用“测试Demo”的APP ID，正式上线需要使用自己创建的应用的App ID     *
        //*应用ID的获取：登陆官网，在“应用-应用列表”，点击应用名称，看应用详情获取APP ID*
        //*******************************************************************************
        restAPI.setAppId("8aaf07085995ddef015998066d2a010f");
    }

    /**
     * 发送信息
     *
     * @param phone      手机号
     * @param templateId 模板号
     * @param args       参数
     * @return 结果
     */
    public static boolean sendMeg(String phone, String templateId, String... args) {
        HashMap<String, Object> result = restAPI.sendTemplateSMS(phone, templateId, args);

        //System.out.println("SDKTestGetSubAccounts result=" + result);
        if ("000000".equals(result.get("statusCode"))) {
            //正常返回输出data包体信息（map）
            System.out.println("发送成功:" + phone);
            return true;
        } else {
            //异常返回输出错误码和错误信息
            System.out.println("错误码=" + result.get("statusCode") + " 错误信息= " + result.get("statusMsg"));
            return false;
        }
    }

    /**
     * 发送验证码
     *
     * @param phone 手机号
     * @param code  验证码
     * @return 结果
     */
    public static boolean sendCode(String phone, String code) {
        return sendMeg(phone, "1", code, "5");
    }
}
