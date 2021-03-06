package com.example.laboratorinisnumber1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    TextView tvMainColor;
    TextView tvMainBackgroundColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.tvMainColor = findViewById(R.id.txtChangeColor);
        this.tvMainBackgroundColor = findViewById(R.id.txtChangeBackgroundColor);
    }

    public void OnBtnclick(View view) {
        this.tvMain.setText(R.string.changed_label_caption);
    }

    public void OnBtnclickChangeColour(View view) {
        this.tvMainColor.setTextColor(Color.YELLOW);
    }

    public void OnBtnclickChangeBackgroundColor(View view){this.tvMainBackgroundColor.setBackgroundColor(Color.parseColor("#B1BCFF"));}
};


