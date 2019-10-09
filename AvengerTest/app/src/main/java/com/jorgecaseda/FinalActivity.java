package com.jorgecaseda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FinalActivity extends AppCompatActivity {

    private Button buttonShare;
    private TextView textViewCongratulations;
    private TextView textViewAvenger;
    private TextView textViexDescription;
    private ImageView imageViewAvenger;

    String name = "";
    String mensaje = "";
    MediaPlayer mediaPlayer;
    private int opcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_avenger);

        buttonShare = (Button) findViewById(R.id.buttonShare);
        textViewCongratulations = (TextView) findViewById(R.id.textViewCongratulations);
        textViewAvenger = (TextView) findViewById(R.id.textViewAvenger);
        textViexDescription = (TextView) findViewById(R.id.textViewDescripcion);
        imageViewAvenger = (ImageView) findViewById(R.id.imageViewAvenger);



        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            name =bundle.getString("name");
            opcion = bundle.getInt("option");
        }

        textViewCongratulations.setText("Enhorabuena " + name + ", eres:");

        if (opcion == 1){
            textViewAvenger.setText("Capitán América");
            imageViewAvenger.setImageResource(R.mipmap.capitan_america);
            textViexDescription.setText("Serías tan valiente y noble como Capitán América. Y no dudarías en sacrificarte para mantener el orden y la paz en tu país. Tienes una gran fuerza y eres muy hábil en los enfrentamientos cuerpo a cuerpo. También posees una gran capacidad de liderazgo y decisión.");
            mensaje = "SOY CAPITÁN AMÉRICA!!";
        }
        else if (opcion == 2){
            textViewAvenger.setText("Iron Man");
            imageViewAvenger.setImageResource(R.mipmap.iron_man);
            textViexDescription.setText("Serías, como Iron Man, uno de los superhéroes más carismáticos y queridos por todos. Además, usarías tu extraordinaria inteligencia para diseñar todo tipo de armas que te hicieran invencible en combate. No habría persona o máquina que no te temiese.");
            mensaje = "SOY IRON MAN!!";
        }
        else if (opcion == 3){
            textViewAvenger.setText("Hulk");
            imageViewAvenger.setImageResource(R.mipmap.hulk);
            textViexDescription.setText("Tú serías Hulk y tu súper poder sería tu fuerza sobrenatural. Y aunque odias tener que hace uso de la violencia, nada te pararía para combatir el crimen o las injusticias. No habría ser vivo que no temiese hacerte enfadar.");
            mensaje = "SOY HULK!!";
        }
        else if (opcion == 4){
            textViewAvenger.setText("Ojo de Halcón");
            imageViewAvenger.setImageResource(R.mipmap.ojodehalcon);
            textViexDescription.setText("Serías el hombre con la mejor puntería del universo, Ojo de Halcón. Con su destreza en el cuerpo a cuerpo y, por supuesto, su gran arco no hay enemigo que se le acerce.");
            mensaje = "SOY OJO DE HALCÓN!!";
        }
        else if (opcion == 5){
            textViewAvenger.setText("Viuda Negra");
            imageViewAvenger.setImageResource(R.mipmap.viuda_negra);
            textViexDescription.setText("Serías un formidable espía tras completar tu entrenamiento en la Habitación Roja de Rusia. Como Viuda Negra, eres valiente, decidida, inteligente y prácticamente invencible en el cuerpo a cuerpo.");
            mensaje = "SOY VIUDA NEGRA!!";
        }
        else if (opcion == 6){
            textViewAvenger.setText("Thor");
            imageViewAvenger.setImageResource(R.mipmap.thor);
            textViexDescription.setText("Seriás el dios del trueno y destrozarías a tus enemigos con tu gran martillo, Mjolnir. Posees una gran fuerza, eres valiente y , lógicamente, los poderes del trueno te dan una gran ventaja en el campo de batalla.");
            mensaje = "SOY THOR!!";
        }

        sonido();

        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, mensaje);
                startActivity(Intent.createChooser(intent, "Compartir vía:"));
            }
        });
    }

    public void sonido(){
        mediaPlayer = MediaPlayer.create(this, R.raw.theavengers);

        mediaPlayer.seekTo(85000);
        mediaPlayer.start();
    }

    public void onPause(){
        super.onPause();

        if(mediaPlayer != null){
            mediaPlayer.release();
        }
    }
}
