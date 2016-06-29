package space.levan.mvc_demo.implement;

import space.levan.mvc_demo.model.OnSignInListener;

/**
 * Created by WangZhiYao on 2016/6/30.
 */
public interface SignInImplement {

    void getStuToken(String userName, String passWord, OnSignInListener listener);
}
