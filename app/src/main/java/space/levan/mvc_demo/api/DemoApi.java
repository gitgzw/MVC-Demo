package space.levan.mvc_demo.api;

import com.loopj.android.http.AsyncHttpResponseHandler;

/**
 * Created by WangZhiYao on 2016/6/30.
 */
public class DemoApi {

    private static String BASE_URL = "http://api.13550101.com/";

    /**
     * 获取用户Token
     * @param userName 学号
     * @param PassWord 密码
     * @param handler  请求结果
     */
    public static void getStuToken(String userName,String PassWord, AsyncHttpResponseHandler handler)
    {

        String urlString = BASE_URL + "login/token?username=" + userName + "&password=" + PassWord;
        Client.get(urlString, handler);
    }
}
