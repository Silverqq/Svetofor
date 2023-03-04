package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.graphics.Color;
import android.widget.AdapterView;


public class MainActivity extends AppCompatActivity {

    private LinearLayout mBackgroundLinearLayout;

    private String[] colors = { "BLUE", "CYAN", "DKGRAY",
            "GRAY", "GREEN", "LTGRAY", "MAGENTA", "RED", "TRANSPARENT",
            "WHITE", "YELLOW" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBackgroundLinearLayout = findViewById(R.id.layout123);
    }
    public void OnClicksetredlayout(View view){
        mBackgroundLinearLayout.setBackgroundColor(Integer.parseInt("#FF0000"));
    }
    public void OnClicksetyellowlayout(View view){
        mBackgroundLinearLayout.setBackgroundColor(Integer.parseInt("#FFE500"));
    }
    public void OnClicksetgreenlayout(View view){
        mBackgroundLinearLayout.setBackgroundColor(Integer.parseInt("#00FF0A"));
    }
}