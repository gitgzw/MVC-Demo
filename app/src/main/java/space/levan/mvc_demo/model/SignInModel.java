package space.levan.mvc_demo.model;

import com.google.gson.Gson;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;
import space.levan.mvc_demo.api.DemoApi;
import space.levan.mvc_demo.bean.SignBean;
import space.levan.mvc_demo.implement.SignInImplement;

/**
 * Created by WangZhiYao on 2016/6/30.
 */
public class SignInModel implements SignInImplement {

    private SignBean signBean;

    @Override
    public void getStuToken(String userName, String passWord, final OnSignInListener listener)
    {
        DemoApi.getStuToken(userName, passWord, new JsonHttpResponseHandler()
        {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response)
            {
                super.onSuccess(statusCode, headers, response);
                signBean = new Gson().fromJson(response.toString(), SignBean.class);
                int errCode = signBean.getError();
                switch (errCode)
                {
                    case 0:
                        listener.onSignInSuccess("登录成功,Token为：" + signBean.getToken());
                        break;
                    case 1:
                        listener.onSignInFailure("登录失败，" + signBean.getMessage());
                        break;
                    default:
                        listener.onSignInFailure("登录失败");
                        break;
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse)
            {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                listener.onSignInFailure("登录失败");
            }
        });
    }
}
