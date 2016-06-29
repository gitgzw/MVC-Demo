package space.levan.mvc_demo.bean;

/**
 * Created by WangZhiYao on 2016/6/30.
 */
public class SignBean {

    /**
     * error : 0
     * message : ok
     * token : 7c75015e92e40511911e34752ee456e1
     * execute_time : 0.2160
     */

    private int error;
    private String message;
    private String token;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
