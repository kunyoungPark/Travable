package com.kypark.trav_able;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CardGame extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardgame);

        Button show = findViewById(R.id.btnShow);
        Button hide = findViewById(R.id.btnHide);
        ImageView imv = findViewById(R.id.myImg);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imv.setVisibility(View.VISIBLE); // or imv.setVisibility(0);
            }
        });

        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imv.setVisibility(View.GONE); // or imv.setVisibility(2);
            }
        });

    }
}
