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

    String mensaje = "";
    MediaPlayer mediaPlayer;
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
            ironman = bundle.getInt("ironman");//
            capi = bundle.getInt("capi");//
            blackwidow = bundle.getInt("blackwidow");//
            blackpanther = bundle.getInt("blackpanther");//
            hulk = bundle.getInt("hulk");//
            thor = bundle.getInt("thor");//
            hawkeye = bundle.getInt("hawkeye");//
            strange = bundle.getInt("strange");//
            spiderman = bundle.getInt("spiderman");//
            starlord = bundle.getInt("starlord");
            antman = bundle.getInt("antman");
        }

        textViewCongratulations.setText("Enhorabuena, eres:");

        if (capi>ironman && capi>blackwidow && capi>blackpanther && capi>hulk && capi>thor && capi>hawkeye && capi>strange && capi>spiderman && capi>starlord && capi>antman){
            textViewAvenger.setText("Capitán América");
            imageViewAvenger.setImageResource(R.mipmap.capitan_america);
            textViexDescription.setText("Serías tan valiente y noble como Capitán América. Y no dudarías en sacrificarte para mantener el orden y la paz en tu país. Tienes una gran fuerza y eres muy hábil en los enfrentamientos cuerpo a cuerpo. También posees una gran capacidad de liderazgo y decisión.");
            mensaje = "SOY CAPITÁN AMÉRICA!!";
        }
        else if (ironman>capi && ironman>blackwidow && ironman>blackpanther && ironman>hulk && ironman>thor && ironman>hawkeye && ironman>strange && ironman>spiderman && ironman>starlord && ironman>antman){
            textViewAvenger.setText("Iron Man");
            imageViewAvenger.setImageResource(R.mipmap.iron_man);
            textViexDescription.setText("Serías uno de los superhéroes más carismáticos y queridos por todos. Además, usarías tu extraordinaria inteligencia para diseñar todo tipo de armas que te hicieran invencible en combate. No habría persona o máquina que no te temiese.");
            mensaje = "SOY IRON MAN!!";
        }
        else if (hulk>capi && hulk>blackwidow && hulk>blackpanther && hulk>ironman && hulk>thor && hulk>hawkeye && hulk>strange && hulk>spiderman && hulk>starlord && hulk>antman){
            textViewAvenger.setText("Hulk");
            imageViewAvenger.setImageResource(R.mipmap.hulk);
            textViexDescription.setText("Tú serías Hulk y tu súper poder sería tu fuerza sobrenatural. Y aunque odias tener que hace uso de la violencia, nada te pararía para combatir el crimen o las injusticias. No habría ser vivo que no temiese hacerte enfadar.");
            mensaje = "SOY HULK!!";
        }
        else if (hawkeye>capi && hawkeye>blackwidow && hawkeye>blackpanther && hawkeye>ironman && hawkeye>thor && hawkeye>hulk && hawkeye>strange && hawkeye>spiderman && hawkeye>starlord && hawkeye>antman){
            textViewAvenger.setText("Ojo de Halcón");
            imageViewAvenger.setImageResource(R.mipmap.ojodehalcon);
            textViexDescription.setText("Serías el hombre con la mejor puntería del universo, Ojo de Halcón. Con su destreza en el cuerpo a cuerpo y, por supuesto, su gran arco no hay enemigo que se le acerce.");
            mensaje = "SOY OJO DE HALCÓN!!";
        }
        else if (blackwidow>capi && blackwidow>hawkeye && blackwidow>blackpanther && blackwidow>ironman && blackwidow>thor && blackwidow>hulk && blackwidow>strange && blackwidow>spiderman && blackwidow>starlord && blackwidow>antman){
            textViewAvenger.setText("Viuda Negra");
            imageViewAvenger.setImageResource(R.mipmap.viuda_negra);
            textViexDescription.setText("Serías un formidable espía tras completar tu entrenamiento en la Habitación Roja de Rusia. Como Viuda Negra, eres valiente, decidida, inteligente y prácticamente invencible en el cuerpo a cuerpo.");
            mensaje = "SOY VIUDA NEGRA!!";
        }
        else if (thor>capi && thor>hawkeye && thor>blackpanther && thor>ironman && thor>blackwidow && thor>hulk && thor>strange && thor>spiderman && thor>starlord && thor>antman){
            textViewAvenger.setText("Thor");
            imageViewAvenger.setImageResource(R.mipmap.thor);
            textViexDescription.setText("Seriás el dios del trueno y destrozarías a tus enemigos con tu gran martillo, Mjolnir. Posees una gran fuerza, eres valiente y , lógicamente, los poderes del trueno te dan una gran ventaja en el campo de batalla.");
            mensaje = "SOY THOR!!";
        }
        else if (blackpanther>capi && blackpanther>hawkeye && blackpanther>thor && blackpanther>ironman && blackpanther>blackwidow && blackpanther>hulk && blackpanther>strange && blackpanther>spiderman && blackpanther>starlord && blackpanther>antman){
            textViewAvenger.setText("Black Panther");
            imageViewAvenger.setImageResource(R.mipmap.blackpanther);
            textViexDescription.setText("Seriás el rey de Wakanda. Tu gran agilidad y habilidades únicas en el combate cuerpo a cuerpo, unidas a un traje de vibranium te harían invencible. Lucharías hasta el final y siempre ayudarías a cualquier compañero caído.");
            mensaje = "SOY THOR!!";
        }
        else if (strange>capi && strange>hawkeye && strange>thor && strange>ironman && strange>blackwidow && strange>hulk && strange>blackpanther && strange>spiderman && strange>starlord && strange>antman){
            textViewAvenger.setText("Dr Strange");
            imageViewAvenger.setImageResource(R.mipmap.strange);
            textViexDescription.setText("Serías el hechicero supremo de las artes místicas. Podrás lanzar hechizos con nombres complicados, crear armas y escudos, y hacer portales para viajar a cualquier parte del mundo. También serías el protector de la gema del infinito del tiempo.");
            mensaje = "SOY THOR!!";
        }
        else if (spiderman>capi && spiderman>hawkeye && spiderman>thor && spiderman>ironman && spiderman>blackwidow && spiderman>hulk && spiderman>blackpanther && spiderman>strange && spiderman>starlord && spiderman>antman){
            textViewAvenger.setText("Spiderman");
            imageViewAvenger.setImageResource(R.mipmap.spiderman);
            textViexDescription.setText("Serías el amigo y vecino, Spiderman. Tendrías las habilidades de pegarte a cualquier sitio, lanzar telarañas y el sentido arácnido. Ayudarías a cualquier persona en peligro, incluso a una anciana perdida.");
            mensaje = "SOY THOR!!";
        }
        else if (starlord>capi && starlord>hawkeye && starlord>thor && starlord>ironman && starlord>blackwidow && starlord>hulk && starlord>blackpanther && starlord>strange && starlord>spiderman && starlord>antman){
            textViewAvenger.setText("Starlord");
            imageViewAvenger.setImageResource(R.mipmap.starlord);
            textViexDescription.setText("Seriás el capitán de los guardianes de la galaxia. LlevaRÍAS un uniforme que te otorga fuerza y durabilidad aumentadas, además de la habilidad de viajar a través del espacio. Utilizarías un arma elemental, una pistola especial capaz de proyectar uno de los cuatro elementos (aire, tierra, fuego y agua).");
            mensaje = "SOY THOR!!";
        }
        else if (antman>capi && antman>hawkeye && antman>thor && antman>ironman && antman>blackwidow && antman>hulk && antman>blackpanther && antman>strange && antman>spiderman && antman>starlord){
            textViewAvenger.setText("Ant-man");
            imageViewAvenger.setImageResource(R.mipmap.antman);
            textViexDescription.setText("Seriás el hombre hormiga. Podrás hacerte diminuto y mantener tu fuerza humana en esa forma. Gran capacidad de infiltración y destreza. A veces usarías tu poder para beneficio personal, para robar un poco de dinero.");
            mensaje = "SOY THOR!!";
        }
        else{
            textViewAvenger.setText("Mantis");
            imageViewAvenger.setImageResource(R.mipmap.mantis);
            textViexDescription.setText("Serías una especie de humanoide llamada Mantis. Mantendrías siempre el orden y la calma donde te encuentres. Siempre estarías dispuesto a ayudar a los que lo necesitan. Tendrías la habilidad de poder dormir y saber los sentimientos de cualquier persona.");
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(FinalActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
