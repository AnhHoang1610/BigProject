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

public class form_search extends AppCompatActivity {
    Button home,user,cart,mail,search, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_search);

        user = (Button) findViewById(R.id.btnuser_searchform);
        home = (Button) findViewById(R.id.btnhome_searchform);
        cart = (Button) findViewById(R.id.btncart_searchform);
        mail = (Button) findViewById(R.id.btnmail_searchform);
        search = (Button) findViewById(R.id.btnsearch_searchform);
        back = (Button) findViewById(R.id.btnback_searchform);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_search.this, Form_user.class));
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_search.this, Form_mail.class));
            }
        });

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_search.this, form_cart.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_search.this, MainActivity.class));
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_search.this, MainActivity.class));
            }
        });
    }
}