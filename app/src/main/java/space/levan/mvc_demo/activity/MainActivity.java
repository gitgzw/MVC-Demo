package space.levan.mvc_demo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import space.levan.mvc_demo.R;
import space.levan.mvc_demo.implement.SignInImplement;
import space.levan.mvc_demo.model.OnSignInListener;
import space.levan.mvc_demo.model.SignInModel;

public class MainActivity extends AppCompatActivity implements OnSignInListener{

    private SignInImplement signInImplement;

    @Bind(R.id.username_et)
    EditText mUserNameEt;
    @Bind(R.id.password_et)
    EditText mPassWordEt;
    @OnClick(R.id.sign_in_bt)
    public void onClick()
    {
        String userName = mUserNameEt.getText().toString().trim();
        String passWord = mPassWordEt.getText().toString().trim();

        signInImplement.getStuToken(userName, passWord, this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        signInImplement = new SignInModel();
    }

    @Override
    public void onSignInSuccess(String response)
    {
        Toast.makeText(MainActivity.this, response, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSignInFailure(String response)
    {
        Toast.makeText(MainActivity.this, response, Toast.LENGTH_SHORT).show();
    }
}
