package com.appdev.a503_02.a1004eventprocess;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class RemoveTitle extends AppCompatActivity {


    CountDownTimer timer2;
    Animation ani1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_title);

        final ImageView imv = (ImageView)findViewById(R.id.imageView);

        //애니메이션 찾아오기
        ani1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.im);

       //애니메이션 리스너를 설정
        ani1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                Animation ani2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                ani2.setFillAfter(true);
                imv.startAnimation(ani2);
                //imv.startAnimation(ani1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



        timer2 = new CountDownTimer(12000, 3000) {
            @Override
            public void onTick(long millisUntilFinished) {
                imv.startAnimation(ani1);
            }

            @Override
            public void onFinish() {
                Toast.makeText(RemoveTitle.this, "반복 끝", Toast.LENGTH_LONG).show();
            }
        };

        timer2.start();


        //imv.startAnimation(ani1);

    }
}
