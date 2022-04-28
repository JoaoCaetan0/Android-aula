package com.example.conversoruniversal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ConversorUniversal3 extends AppCompatActivity {

    RadioGroup radioGroup1_;
    RadioGroup radioGroup2_;
    Button calc;
    EditText v1;
    final Dialog dialog = new Dialog(this);
    //int radioG = (RadioGroup) dialog.findViewById(R.id.radioGroup1_);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_universal3);
        v1 = findViewById (R.id.editTextValor1);
        radioGroup1_ = findViewById(R.id.radioGroup1_);

       // radioGroup1_.setOnCheckedChangeListener(mOuvinte);

        radioGroup2_ = findViewById(R.id.radioGroup2_);

        //radioGroup2_.setOnCheckedChangeListener(mOuvinte);

        calc = findViewById(R.id.buttonCalcular);
    }
    /*public void onClick(View v) {
        if (v.getId() == R.id.buttonCalcular) {
            if (v1.getText().toString().trim().equals("")) {
                v1.setError("Preencha!");
            } else {
                float n1 = Float.parseFloat(v1.getText().toString());
                if ((v.getId() == R.id.radioGroup1_) && ((v.getId() == R.id.radioGroup2_)) == R.id.radioButtonC1_ ) {
                    int resultado = n1 * 1,8
                        Toast.makeText(this, n1 , Toast.LENGTH_LONG).show();
                }

            }
        }
    }*/


    /*RadioGroup.OnCheckedChangeListener mOuvinte = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

            switch (checkedId){
                case R.id.radioButtonC1_:
                    return R.id.radioButtonC1_;

                    break;
                case R.id.radioButton2_:
                    Toast.makeText(getApplicationContext(),
                            "Segunda opção",
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton3_:
                    Toast.makeText(getApplicationContext(),
                            "Terceira opção",
                            Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };*/
}