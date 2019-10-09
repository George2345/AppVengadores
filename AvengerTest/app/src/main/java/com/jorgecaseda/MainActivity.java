package com.jorgecaseda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jorgecaseda.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonStart;
    private EditText editTextName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_avenger);

        buttonStart = (Button) findViewById(R.id.buttonStart);
        editTextName = (EditText) findViewById(R.id.editTextName);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString();
                if (name != null && !name.isEmpty()){
                    Intent intent = new Intent(MainActivity.this, FirstQuestionActivity.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Introduce a name!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
