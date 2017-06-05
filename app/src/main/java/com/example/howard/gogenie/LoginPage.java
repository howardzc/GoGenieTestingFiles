package com.example.howard.gogenie;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {
    public Button loginButton;
    public Button registerButton;
    public Button forgotButton;
    public EditText email;
    public EditText password;

    private String username = "test";
    private String pw = "test";

    public void init(){
        loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                password = (EditText) findViewById(R.id.Password);
                String inputPW = password.getText().toString();
                email = (EditText) findViewById(R.id.Email);
                String inputEmail = email.getText().toString();
                login(inputEmail, inputPW);
            }
        });
        registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent reg = new Intent(LoginPage.this, RegisterPage.class);
                startActivity(reg);
                LoginPage.this.finish();
            }
        });
        forgotButton = (Button) findViewById(R.id.forgotButton);
        forgotButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent forgot = new Intent(LoginPage.this, ForgotPWPage.class);
                startActivity(forgot);
                LoginPage.this.finish();
            }
        });
    }

    public void login(String inputEmail, String inputPW){
        if(inputEmail == username && inputPW == pw){
            Intent login = new Intent(LoginPage.this, MainPage.class);
            startActivity(login);
            LoginPage.this.finish();
        }else{
            AlertDialog.Builder loginFailAlert = new AlertDialog.Builder(this);
            loginFailAlert.setMessage("請檢查你的用戶密碼然後再試一次.").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).setTitle("登入失敗").create();
            loginFailAlert.show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
}
