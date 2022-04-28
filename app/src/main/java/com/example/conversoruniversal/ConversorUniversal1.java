package com.example.conversoruniversal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class ConversorUniversal1 extends AppCompatActivity {

    EditText ed1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_universal1);

        ed1 = findViewById(R.id.editText1);
        bt1 = findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConversorUniversal1.this, ConversorUniversal2.class);
                startActivity(intent);
            }
        });
    }
}
