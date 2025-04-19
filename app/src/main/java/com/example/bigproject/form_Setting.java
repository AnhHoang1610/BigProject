package com.example.bigproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class form_Setting extends AppCompatActivity {

    TextView textView6, txtvietnamese, txtEnglish;
    Button circleon_Notification,circleoff_Notification,khungon_Notification,khungoff_Notification,
            back,
            circleoff_Darkmode,circleon_Darkmode,khungoff_Darkmode,khungon_Darkmode;
    Button cdlangue,vietnamdopen, englishdopen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form_setting);

        

        back = (Button) findViewById(R.id.btnbackSetting);
        circleoff_Notification = (Button) findViewById(R.id.circle_notification_off);
        circleon_Notification = (Button) findViewById(R.id.circle_notification_on);
        khungoff_Notification = (Button) findViewById(R.id.khung_notification_off);
        khungon_Notification = (Button) findViewById(R.id.khung_notification_on);

        circleoff_Darkmode = (Button) findViewById(R.id.circle_Darkmode_off);
        circleon_Darkmode = (Button) findViewById(R.id.circle_Darkmode_on);
        khungoff_Darkmode = (Button) findViewById(R.id.khung_Darkmode_off);
        khungon_Darkmode = (Button) findViewById(R.id.khung_Darkmode_on);

        vietnamdopen = (Button) findViewById(R.id.btnVietnamese);
        englishdopen = (Button) findViewById(R.id.btnEnglish);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(form_Setting.this, Form_user.class));
            }
        });

        circleoff_Notification.setOnClickListener(v -> OnNotification());
        khungoff_Notification.setOnClickListener(v -> OnNotification());

        circleoff_Darkmode.setOnClickListener(v -> OnDarkmode());
        khungoff_Darkmode.setOnClickListener(v -> OnDarkmode());


        circleon_Notification.setOnClickListener(v -> OffNotification());
        khungon_Notification.setOnClickListener(v -> OffNotification());

        circleon_Darkmode.setOnClickListener(v -> offDarkmode());
        khungon_Darkmode.setOnClickListener(v -> offDarkmode());

        englishdopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vietnamdopen.setVisibility(View.INVISIBLE);
                englishdopen.setVisibility(View.VISIBLE);
            }
        });

        vietnamdopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                englishdopen.setVisibility(View.INVISIBLE);
                vietnamdopen.setVisibility(View.VISIBLE);
            }
        });

    }
    private void OnNotification() {
        circleon_Notification.setVisibility(View.VISIBLE);
        khungon_Notification.setVisibility(View.VISIBLE);
        circleoff_Notification.setVisibility(View.INVISIBLE);
        khungoff_Notification.setVisibility(View.INVISIBLE);

    }

    private void OnDarkmode() {
        circleon_Darkmode.setVisibility(View.VISIBLE);
        khungon_Darkmode.setVisibility(View.VISIBLE);
        circleoff_Darkmode.setVisibility(View.INVISIBLE);
        khungoff_Darkmode.setVisibility(View.INVISIBLE);

    }

    private void OffNotification(){
        circleon_Notification.setVisibility(View.INVISIBLE);
        khungon_Notification.setVisibility(View.INVISIBLE);
        circleoff_Notification.setVisibility(View.VISIBLE);
        khungoff_Notification.setVisibility(View.VISIBLE);
    }

    private void offDarkmode() {
        circleon_Darkmode.setVisibility(View.INVISIBLE);
        khungon_Darkmode.setVisibility(View.INVISIBLE);
        circleoff_Darkmode.setVisibility(View.VISIBLE);
        khungoff_Darkmode.setVisibility(View.VISIBLE);

    }
}