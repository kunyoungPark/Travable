package com.kypark.trav_able;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Spotdetail  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendmail);

//        ImageButton share = findViewById(R.id.imageButton_share);
//
//        share.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent shareIntent = new Intent();
//                shareIntent.setAction(Intent.ACTION_SEND);
//                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Android Development Tutorials");
//                shareIntent.putExtra(Intent.EXTRA_TEXT, "www.technxt.net");
//                shareIntent.setType("text/plain");
//                startActivity(shareIntent);
//            }
//        });
    }
}
