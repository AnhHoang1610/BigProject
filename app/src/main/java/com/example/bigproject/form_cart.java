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

public class form_cart extends AppCompatActivity {
    Button home,user,cart,mail,search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_cart);

        user = (Button) findViewById(R.id.btnuser_formcart);
        home = (Button) findViewById(R.id.btnhome_formcart);
        cart = (Button) findViewById(R.id.btncart_formcart);
        mail = (Button) findViewById(R.id.btnmail_formcart);
        search = (Button) findViewById(R.id.btnsearch_formcart);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_cart.this, MainActivity.class));
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_cart.this, Form_mail.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_cart.this, form_search.class));
            }
        });

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_cart.this, Form_user.class));
            }
        });
    }
}