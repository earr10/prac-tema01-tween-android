package com.example.practema01tween;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relacionarVistas();
    }

    public void relacionarVistas() {
        btn1 = (Button) findViewById(R.id.anim1);
        btn2 = (Button) findViewById(R.id.anim2);
        btn3 = (Button) findViewById(R.id.anim3);
        btn4 = (Button) findViewById(R.id.anim4);
        btn5 = (Button) findViewById(R.id.anim5);
        img = (ImageView) findViewById(R.id.img);
    }

    public void animacion1(View v) {
        primerAnimacion();
    }

    public void animacion2(View v) {
        segundaAnimacion();
    }

    public void animacion3(View v) {
        terceraAnimacion();
    }

    public void animacion4(View v) {
        cuartaAnimacion();
    }

    public void animacion5(View v) {
        quintaAnimacion();
    }

    public void primerAnimacion() {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim1);
        animation.setFillAfter(true);
        img.startAnimation(animation);
    }

    public void segundaAnimacion() {
        Animation animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim2);
        animation2.setFillAfter(false);
        img.startAnimation(animation2);
    }

    public void terceraAnimacion() {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim3);
        animation.setFillAfter(true);
        img.startAnimation(animation);
    }

    public void cuartaAnimacion() {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim4);
        animation.setFillAfter(true);
        img.startAnimation(animation);
    }

    public void quintaAnimacion() {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim5);
        animation.setFillAfter(true);
        img.startAnimation(animation);
    }
}
