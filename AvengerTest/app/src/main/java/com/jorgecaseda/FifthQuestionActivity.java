package com.jorgecaseda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FifthQuestionActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button buttonNextQuestion;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;

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
        setContentView(R.layout.activity_fifth_question);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_avenger);

        buttonNextQuestion = (Button) findViewById(R.id.buttonNextQuestion);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);

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

        buttonNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioGroup.getCheckedRadioButtonId() == -1){
                    Toast.makeText(FifthQuestionActivity.this, "Choose an option!", Toast.LENGTH_LONG).show();
                }
                else{
                    if(radioButton2.isChecked()){
                        antman++;
                        starlord++;
                    }
                    else if(radioButton3.isChecked()){
                        capi++;
                        spiderman++;
                    }
                    else if(radioButton4.isChecked()){
                        hulk++;
                        blackwidow++;
                        hawkeye++;
                    }
                    else if(radioButton5.isChecked()){
                        ironman++;
                        strange++;
                        thor++;
                    }
                    else if(radioButton1.isChecked()){
                        blackpanther++;
                    }
                    Intent intent = new Intent(FifthQuestionActivity.this, SixthQuestionActivity.class);
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
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(FifthQuestionActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
