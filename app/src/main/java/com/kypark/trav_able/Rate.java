package com.kypark.trav_able;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Rate extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate);

        String a = "hello";

        Button btn = findViewById(R.id.rate_btn);
        TextView tv = findViewById(R.id.textView4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code here
                //1. page 변환
                Intent it = new Intent(Rate.this, Main.class);
                startActivity(it);
                finish();
                //2. 다른 component를 변환
                tv.setText("hello");
            }
        });




    }
}
