package com.kypark.trav_able;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);

        Button call = findViewById(R.id.button_call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01085043145";
                if (checkSelfPermission(Main3.this, Manifest.permission.CALL_PHONE)!=Package.M)
                Intent it = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
                startActivity(it);
            }
        });

    }
}
