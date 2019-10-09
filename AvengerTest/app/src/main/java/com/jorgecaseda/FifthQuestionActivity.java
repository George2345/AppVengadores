package com.jorgecaseda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FifthQuestionActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button buttonNextQuestion;


    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_avenger);

        buttonNextQuestion = (Button) findViewById(R.id.buttonNextQuestion1);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            name =bundle.getString("name");
        }

        buttonNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioGroup.getCheckedRadioButtonId() == -1){
                    Toast.makeText(FifthQuestionActivity.this, "Choose an option!", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(FifthQuestionActivity.this, SixthQuestionActivity.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
            }
        });



    }
}
