package com.kypark.trav_able;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Data2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data2);

        TextView tv = findViewById(R.id.getBtnName);
        tv.setText(getIntent().getStringExtra("name"));

        TextView tvColor = findViewById(R.id.setColor);
        String temp = getIntent().getStringExtra("color");
        tvColor.setBackgroundColor(Color.parseColor(temp));

    }
}
