package com.kypark.trav_able;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //이 class는 위에 있듯이 방금 본 main.xml과 연결된 애야
        //이제 아까 수정한 id로 이 class 에서 실제로 사용할 variable을 만들어 줄거야

        //review: variable define 하는 방법
        int i = 3;
        String a = "hello world";

        //[Type] [variable] = [value];
        //Button var = findViewById(R.id.[내가 쓸 component의 id]);
        Button btn = findViewById(R.id.toTestPage);

        //button을 눌렀을 때 일어나는 일을 'event'라고 부르고, 그 event를 조정 하는 것을 'handling'한다고 표현해
        //button을 눌렀을 때의 event handle 하는 code를 쓸건데, 외울 필요는 없어. 어디에서 handling 하는 지만 알면 돼
        //먼저, 우리가 쓸 Button을 앞으로 code에서는 btn 으로 쓸 수 있어 (28줄에서 define 해두었기 때문에)
        //그리고 그 btn에서 일어나는 일 중 하나이기 때문에 btn.function() 형식으로 쓸거야 (.을 쓴다는 것이 point야)
        btn.setOnClickListener(new View.OnClickListener() { //이 format은 복붙해서 쓰면 돼. 문법이 복잡해서 설명은 지금 안할게.
            @Override
            public void onClick(View v) {
                //이 안에다가 event를 넣어줄거야

                //event 1. page 넘어가기
                //android studio 에서 page 사이의 일을 'intent'라고 불러
                //우리가 지금 발생시켜야 할 intent는 현재 page와 버튼을 눌렀을 때 이동할 page야.
                //현재 page는 Main.class 가 가지고 있고 (17번째 줄)
                //가야할 page는 Test.class가 가지고 있다고 할게.
                //Intent를 정의 할거야
                Intent it = new Intent(Main.this, Test.class);
                //Intent var = new Intent ([지금 class].this, [가야할 class].class);

                //이제 앞에서 정의한 intent를 시작할거야, 함수를 사용해서(17번째 줄처럼)
                startActivity(it);
                //끝!
                //+ 만약에 page가 넘어가고 현재 있는 page는 끝내고 싶다면
                finish();
                //finish()를 안쓰면, page가 넘어 갔다가 '뒤로가기'를 하면 이전 페이지로 떠'


                //event 2. textView 바꾸기 (다른 component 응용가능!)
                /*
                * TextView tv = findViewById(R.id.tvId);
                * tvId.setText("hello world!);
                * */
            }
        });



    }
}
