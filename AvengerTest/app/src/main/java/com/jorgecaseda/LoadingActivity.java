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

    String name = "";
    private int option;
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
            name =bundle.getString("name");
            option = bundle.getInt("option");
        }

        Toast.makeText(LoadingActivity.this, "Cargando...", Toast.LENGTH_LONG).show();
        esperar3segundos(DURACION);

        buttonResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoadingActivity.this, FinalActivity.class);
                intent.putExtra("option", option);
                intent.putExtra("name", name);
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

