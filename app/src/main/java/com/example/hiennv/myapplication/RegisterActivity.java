package com.example.hiennv.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText txtUserName;
    private EditText txtPassWord;
    private EditText txtFullName;
    private EditText txtEmail;
    private Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        this.btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtUserName = findViewById(R.id.txtUserName);
                Log.v("UserName = ", txtUserName.getText().toString());
                txtPassWord = findViewById(R.id.txtPassWord);
                Log.v("PassWord = ", txtPassWord.getText().toString());
                txtPassWord = findViewById(R.id.txtPassWord);
                Log.v("FullName = ", txtFullName.getText().toString());
                txtPassWord = findViewById(R.id.txtPassWord);
                Log.v("Email = ", txtEmail.getText().toString());

            }
        });
    }

}
