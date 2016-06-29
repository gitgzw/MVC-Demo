package space.levan.mvc_demo.model;

/**
 * Created by WangZhiYao on 2016/6/30.
 */
public interface OnSignInListener {

    void onSignInSuccess(String response);
    void onSignInFailure(String response);
}
