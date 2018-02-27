package com.example.androidanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FrameAnimActivity extends AppCompatActivity {
    private ImageView ivFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_anim);

        ivFrame = (ImageView) findViewById(R.id.iv_frame);
        ivFrame.setImageResource(R.drawable.animlist);

        AnimationDrawable drawable = (AnimationDrawable) ivFrame.getDrawable();
        drawable.start();  //开始
        //drawable.stop();  //结束
    }
}
