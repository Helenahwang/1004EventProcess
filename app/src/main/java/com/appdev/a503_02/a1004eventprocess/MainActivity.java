package com.appdev.a503_02.a1004eventprocess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //터치메소드
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        String message = String.format("X:%.1f / Y:%.1f 터치",x,y);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2개의 버튼을 찾아오는 코드
        final Button button1 = (Button)findViewById(R.id.idbutton1);
        final Button button2 = (Button)findViewById(R.id.idbutton2);

        //클릭할 때 메소드 - setOnClickListener
        /*
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            //v와 button1과 같다. 자료형은 다르다. View는 최상위 클래스이다.
            // 자료형 View -> Button으로 바꾸어서 비교가능
            public void onClick(View v) {
                // this 만 쓰면 View.OnClickListener 를 말하는 것이다
                Toast.makeText(MainActivity.this, "Button1 결과",Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button2 결과", Toast.LENGTH_LONG).show();
            }
        });
        */

        View.OnClickListener eventHandler = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button btn = (Button)v;

                /*
                String msg = "";

                if(btn == button1) {
                    msg = "첫번째 버튼 클릭";
                }else if(btn == button2){
                    msg = "두번째 버튼 클릭";
                }
                */

                String msg = btn.getText().toString();

                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
            }
        };

        // 이벤트 처리 객체 연결
        button1.setOnClickListener(eventHandler);
        button2.setOnClickListener(eventHandler);





    }
}
