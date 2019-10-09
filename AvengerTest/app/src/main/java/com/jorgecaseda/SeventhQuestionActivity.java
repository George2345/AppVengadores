package com.jorgecaseda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SeventhQuestionActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button buttonNextQuestion;

    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;

    public static final int first = 1;
    public static final int second = 2;
    public static final int third = 3;
    public static final int fourth = 4;
    public static final int fifth = 5;
    public static final int sixth = 6;



    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_question);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_avenger);

        buttonNextQuestion = (Button) findViewById(R.id.buttonNextQuestion1);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) findViewById(R.id.radioButton6);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            name =bundle.getString("name");
        }

        buttonNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioGroup.getCheckedRadioButtonId() == -1){
                    Toast.makeText(SeventhQuestionActivity.this, "Choose an option!", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(SeventhQuestionActivity.this, LoadingActivity.class);
                    int option = 0;
                    if (radioButton1.isChecked()){
                        option = 1;
                    }
                    else if (radioButton2.isChecked()){
                        option = 2;
                    }
                    else if (radioButton3.isChecked()){
                        option = 3;
                    }
                    else if (radioButton4.isChecked()){
                        option = 4;
                    }
                    else if (radioButton5.isChecked()){
                        option = 5;
                    }
                    else if (radioButton6.isChecked()){
                        option = 6;
                    }
                    intent.putExtra("option", option);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
            }
        });



    }
}
