package com.david.aplikasipenjualanmobil.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.david.aplikasipenjualanmobil.R;
import com.david.aplikasipenjualanmobil.admin.HomeAdmin;
import com.ornach.nobobutton.NoboButton;

public class LoginActivity extends AppCompatActivity {
    Button btnRegistrasi;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnLogin = (NoboButton) findViewById(R.id.Login);

        btnLogin.setOnClickListener((v) -> {
            Intent i = new Intent(LoginActivity.this, HomeAdmin.class);
            startActivity(i);
            finish();
        });

        btnRegistrasi = (Button) findViewById(R.id.Register);

        btnRegistrasi.setOnClickListener((v) -> {
            Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(i);
            finish();
        });
    }
}