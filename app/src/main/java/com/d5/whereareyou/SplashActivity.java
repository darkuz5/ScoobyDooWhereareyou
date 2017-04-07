package com.d5.whereareyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ImageView satelite;
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN  );

        satelite = (ImageView) findViewById(R.id.imageView4);
        Animation mover = AnimationUtils.loadAnimation(this, R.anim.layout);
        mover.reset();
        satelite.startAnimation(mover);


        AnimationSet s = new AnimationSet(false);//false means don't share interpolators
        s.addAnimation(mover);
        s.addAnimation(mover);
        satelite.startAnimation(s);

    }
}
