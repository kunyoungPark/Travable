package com.kypark.trav_able;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Data1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data1);
        Button[] btn = {findViewById(R.id.data1_btn1),findViewById(R.id.data1_btn2),findViewById(R.id.data1_btn3),findViewById(R.id.data1_btn4),findViewById(R.id.data1_btn5)};
        String[]  btnColor= {"#D61818","#FF5722","#673AB7","#4CAF50","#2192A7"};
        for (int i = 0; i<5; i++){
            int finalI = i;
            btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ColorStateList cd =  btn[finalI].getBackgroundTintList();
                    Intent it = new Intent(Data1.this, Data2.class);
                    it.putExtra("name",btn[finalI].getText().toString());
                    it.putExtra("color", btnColor[finalI]);
                    startActivity(it);
                }
            });
        }
    }


}
