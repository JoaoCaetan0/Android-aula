package com.example.conversoruniversal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConversorUniversal5 extends AppCompatActivity {

    private Button bt1;
    private CheckBox ck1, ck2, ck3, ck4;
    private TextView r1;
    private EditText edn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_universal5);

        bt1 = findViewById(R.id.buttonConverte);
        ck1 = findViewById(R.id.checkBox1);
        ck2 = findViewById(R.id.checkBox2);
        r1 = findViewById(R.id.textViewResultado);
        edn1 = findViewById(R.id.editTextValor1);


        //ouvinte do checkbox
        ck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck1.isChecked()){
                    Toast.makeText(getApplicationContext(), "CheckBox1 marcado", Toast.LENGTH_SHORT).show();

                }
                if(ck2.isChecked()){
                    Toast.makeText(getApplicationContext(), "CheckBox2 marcado", Toast.LENGTH_SHORT).show();
                }

            }
        });


        //ouvinte do button
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ck1.isChecked()){
                    double n1 = Double.parseDouble(edn1.getText().toString());
                    double resultado = n1 * 3.6;
                    r1.setText(String.format("%.2f", resultado));

                }
                if(ck2.isChecked()){
                    double n1 = Double.parseDouble(edn1.getText().toString());
                    double resultado = n1/3.6;
                    r1.setText(String.format("%.2f", resultado));

            }
        }

    });

}}