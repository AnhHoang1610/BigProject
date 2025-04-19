package com.example.bigproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Form_mail extends AppCompatActivity {
    Button home,user,cart,mail,search;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_mail);


        user = (Button) findViewById(R.id.btnuser_mailform);
        home = (Button) findViewById(R.id.btnhome_mailform);
        cart = (Button) findViewById(R.id.btncart_mailform);
        mail = (Button) findViewById(R.id.btnmail_mailform);
        search = (Button) findViewById(R.id.btnsearch_mailform);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_mail.this, Form_user.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_mail.this, MainActivity.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_mail.this, form_cart.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Form_mail.this, form_search.class));
            }
        });
    }
}