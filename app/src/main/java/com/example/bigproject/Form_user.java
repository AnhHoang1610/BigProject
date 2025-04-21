package com.example.bigproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Form_user extends AppCompatActivity {
    Button home,user,cart,mail,search,setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_user);

        setting = (Button) findViewById(R.id.btnSetting);

        user = (Button) findViewById(R.id.btnuser_userform);
        home = (Button) findViewById(R.id.btnhome_userform);
        cart = (Button) findViewById(R.id.btncart_userform);
        mail = (Button) findViewById(R.id.btnmail_userform);
        search = (Button) findViewById(R.id.btnsearch_userform);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_user.this, MainActivity.class));
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_user.this, Form_mail.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_user.this, form_cart.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_user.this, form_search.class));
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_user.this, form_Setting.class));
            }
        });
    }
}