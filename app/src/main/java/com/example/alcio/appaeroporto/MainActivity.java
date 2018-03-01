package com.example.alcio.appaeroporto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity{


    ImageView image;
    TextView texto;

    Animation aparece;
    Animation some;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.minhaImagem);
        texto = findViewById(R.id.textMeuTexto);

        aparece = new AlphaAnimation(0,1);
        some = new AlphaAnimation(1,0);

        aparece.setDuration(500);
        some.setDuration(500);

        texto.setText("Toque para continuar!");
        image.setVisibility(View.INVISIBLE);

        aparece.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                image.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                image.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        some.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                image.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                image.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    public void clicouTela(View view){


        if(Math.random() < 0.5){
            texto.setText("Siga para a direita!");
            image.setScaleX(-1f);
        }else{
            texto.setText("Siga para a esquerda!");
            image.setScaleX(1f);
        }
        image.startAnimation(aparece);


    }
}
