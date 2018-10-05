package com.appdev.a503_02.a1004eventprocess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class ResourceAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_animation);

        //레이아웃에서 뷰와 버튼 찾아오기
        final ImageView imageView = (ImageView)findViewById(R.id.dongwook);
        final Button button = (Button)findViewById(R.id.idstart);

        //버튼을 눌렀을 때 수행할 내용 작성
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //애니메이션 가져오기
                //Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                //뷰에 애니메이션 적용
                //imageView.startAnimation(animation1);
                imageView.startAnimation(animation2);


            }
        });



    }
}
