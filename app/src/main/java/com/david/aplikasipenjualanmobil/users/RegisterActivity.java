package com.david.aplikasipenjualanmobil.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.david.aplikasipenjualanmobil.R;

public class RegisterActivity extends AppCompatActivity {
    Button btnKembaliLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();

        btnKembaliLogin = (Button) findViewById(R.id.kembaliLogin);

        btnKembaliLogin.setOnClickListener((v) -> {
            Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        });
    }
}