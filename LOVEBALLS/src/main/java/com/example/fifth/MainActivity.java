package com.example.fifth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView angel;
Button btn;
Animation slide;
Animation translate;
Animation moveback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        translate = new TranslateAnimation(0, 0, 0, -1800);
        translate.setDuration(3000);
        moveback = new TranslateAnimation(0, 0, 0, 1800);
        moveback.setDuration(1500);
        final AnimationSet move = new AnimationSet(true);
        move.addAnimation(translate);
        move.addAnimation(moveback);

        angel = (ImageView)findViewById(R.id.parachute);
        btn = (Button)findViewById(R.id.btnDelivery);
        slide = (Animation) AnimationUtils.loadAnimation(this,R.anim.slidedown);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angel.startAnimation(move);

            }
        });
    }
}
