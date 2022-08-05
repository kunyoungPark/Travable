package com.kypark.trav_able;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Test1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.test1);

        Button btn = findViewById(R.id.add);
        TextView tv = findViewById(R.id.textView);
        TextView tv1 = findViewById(R.id.textView34);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Test1","in the button");
                String temp = tv.getText().toString();
                String str = "\nhello";
                tv.setText(temp + str);
                Log.e("Test1",temp + str);
            }
        });
        final List<String> ListItems = new ArrayList<>();
        ListItems.add("사과");
        ListItems.add("배");
        ListItems.add("귤");
        ListItems.add("바나나");
        final CharSequence[] items =  ListItems.toArray(new String[ ListItems.size()]);

        final List SelectedItems  = new ArrayList();


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("AlertDialog Title");
        builder.setMultiChoiceItems(items, null,
                new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which,
                                        boolean isChecked) {
                        if (isChecked) {
                            //사용자가 체크한 경우 리스트에 추가
                            SelectedItems.add(which);
                        } else if (SelectedItems.contains(which)) {
                            //이미 리스트에 들어있던 아이템이면 제거
                            SelectedItems.remove(Integer.valueOf(which));
                        }
                    }
                });
        builder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        String msg="";
                        for (int i = 0; i < SelectedItems.size(); i++) {
                            int index = (int) SelectedItems.get(i);

                            msg=msg+"\n"+(i+1)+" : " +ListItems.get(index);
                        }
                        Toast.makeText(getApplicationContext(),
                                        "Total "+ SelectedItems.size() +" Items Selected.\n"+ msg , Toast.LENGTH_LONG)
                                .show();
                    }
                });
        builder.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.show();
    }
}