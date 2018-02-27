package com.example.androidanimation;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivTween;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_frame).setOnClickListener(this);
        findViewById(R.id.btn_tween).setOnClickListener(this);
        findViewById(R.id.btn_value).setOnClickListener(this);
        ivTween = (ImageView) findViewById(R.id.iv_tween);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_frame:
                startActivity(new Intent(MainActivity.this,FrameAnimActivity.class));
                break;
            case R.id.btn_tween:
                tweenAnim();
                break;
            case R.id.btn_value:
                valueAnim();
                break;
        }
    }

    private void tweenAnim(){
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animset);
        animation.setFillAfter(false);
        ivTween.startAnimation(animation);
    }

    private void valueAnim(){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(ivTween,"alpha",0,1);
        objectAnimator.setDuration(2000);
        objectAnimator.start();

        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(ivTween,"scaleX",1,2);
        objectAnimator1.setDuration(2000);
        objectAnimator1.start();

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(ivTween,"scaleY",1,2);
        objectAnimator2.setDuration(2000);
        objectAnimator2.start();

        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat(ivTween,"rotation",0,360);
        objectAnimator3.setDuration(2000);
        objectAnimator3.start();

    }
}
