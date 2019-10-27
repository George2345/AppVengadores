package com.jorgecaseda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FourthQuestionActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button buttonNextQuestion;
    private Button buttonPreviousQuestion;

    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_avenger);

        buttonNextQuestion = (Button) findViewById(R.id.buttonNextQuestion);
        buttonPreviousQuestion = (Button) findViewById(R.id.buttonPreviousQuestion);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            name =bundle.getString("name");
        }

        buttonNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioGroup.getCheckedRadioButtonId() == -1){
                    Toast.makeText(FourthQuestionActivity.this, "Choose an option!", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(FourthQuestionActivity.this, FifthQuestionActivity.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
            }
        });

        buttonPreviousQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthQuestionActivity.this, ThirdQuestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
