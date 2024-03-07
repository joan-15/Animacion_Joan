package com.Joan.animacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView JoanFelipeTextView = findViewById(R.id.JoanFelipeTextView);
        TextView DispositivosMovilesTextView = findViewById(R.id.DispositivosMovilesTextView)
        ImageView pascual = findViewById(R.id.pascual);

        JoanFelipeTextView.SetAnimation(animacion2);
        DispositivosMovilesTextView.SetAnimation(animacion2);
        ImageView pascual.SetAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run (){
                Intent intent = new Intent(MainActivity.this, CalculadoraActovity.class);
                startActivity(intent);
                finish();
            }
        }, 400);



    }
}