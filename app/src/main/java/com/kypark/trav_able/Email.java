package com.kypark.trav_able;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class Email extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        TextInputEditText title = findViewById(R.id.email_title);
        TextInputEditText content = findViewById(R.id.email_content);
        Button send = findViewById(R.id.button_email);

        final String a = title.getText().toString();
        final String b = content.getText().toString();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "pky3145@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, a);
                email.putExtra(Intent.EXTRA_TEXT, b);

                //need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));
            }
        });

    }
}
