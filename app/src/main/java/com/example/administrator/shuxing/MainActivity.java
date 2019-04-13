package com.example.administrator.shuxing;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBt = (Button) findViewById(R.id.bt);
        //initView();
        initView2();
    }

    private void initView2() {
        ValueAnimator anim = ValueAnimator.ofFloat(0, 3);
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.a);
// 载入XML动画

        animator.setTarget(mBt);
// 设置动画对象

        animator.start();
    }

    private void initView() {

        mBt.setOnClickListener(this);
        ValueAnimator animator = ValueAnimator.ofInt(mBt.getLayoutParams().width, 5000);
        animator.setDuration(3000);
        animator.setStartDelay(1000);
        animator.setRepeatCount(2);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animation.getAnimatedValue();

                mBt.getLayoutParams().width = value;

                mBt.requestLayout();
            }
        });

        animator.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bt:
                break;
        }
    }
}
