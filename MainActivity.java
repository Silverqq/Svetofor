package com.example.svetofor;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.graphics.Color;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClicksetredlayout(View view) {
        LinearLayout backlayout = findViewById(R.id.layout123);
        backlayout.setBackgroundColor(Color.RED);
    }

    public void OnClicksetyellowlayout(View view) {
        LinearLayout backlayout = findViewById(R.id.layout123);
        backlayout.setBackgroundColor(Color.YELLOW);
    }

    public void OnClicksetgreenlayout(View view) {
        LinearLayout backlayout = findViewById(R.id.layout123);
        backlayout.setBackgroundColor(Color.GREEN);
    }
}
