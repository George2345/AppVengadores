package com.jorgecaseda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class LoadingActivity extends AppCompatActivity {

    private Button buttonResults;

    int ironman=0;
    int capi=0;
    int blackwidow=0;
    int blackpanther=0;
    int hulk=0;
    int thor=0;
    int hawkeye=0;
    int strange=0;
    int spiderman=0;
    int starlord=0;
    int antman=0;
    public final int DURACION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_avenger);

        buttonResults = (Button) findViewById(R.id.buttonResults);
        buttonResults.setVisibility(View.INVISIBLE);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            ironman = bundle.getInt("ironman");
            capi = bundle.getInt("capi");
            blackwidow = bundle.getInt("blackwidow");
            blackpanther = bundle.getInt("blackpanther");
            hulk = bundle.getInt("hulk");
            thor = bundle.getInt("thor");
            hawkeye = bundle.getInt("hawkeye");
            strange = bundle.getInt("strange");
            spiderman = bundle.getInt("spiderman");
            starlord = bundle.getInt("starlord");
            antman = bundle.getInt("antman");
        }

        Toast.makeText(LoadingActivity.this, "Cargando...", Toast.LENGTH_LONG).show();
        esperar3segundos(DURACION);

        buttonResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoadingActivity.this, FinalActivity.class);
                intent.putExtra("hulk", hulk);
                intent.putExtra("thor", thor);
                intent.putExtra("antman", antman);
                intent.putExtra("starlord", starlord);
                intent.putExtra("capi", capi);
                intent.putExtra("blackwidow", blackwidow);
                intent.putExtra("hawkeye", hawkeye);
                intent.putExtra("ironman", ironman);
                intent.putExtra("blackpanther", blackpanther);
                intent.putExtra("strange", strange);
                intent.putExtra("spiderman", spiderman);
                startActivity(intent);
            }
        });
    }

    public void esperar3segundos(int milisegundos) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                buttonResults.setVisibility(View.VISIBLE);
            }
        }, milisegundos);
    }
}

