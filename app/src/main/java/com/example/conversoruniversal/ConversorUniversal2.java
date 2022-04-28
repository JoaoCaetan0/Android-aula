package com.example.conversoruniversal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConversorUniversal2 extends ListActivity {

    // fonte de dados
    String[] TELAS = new String[]{"Temperatura", "Volume", "Velocidade"};

    Intent intent;

    //arrayAdapter;
    ArrayAdapter<String> meuArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setar/configurar/instanciar o arrayadapter
        meuArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, TELAS);

        setListAdapter(meuArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                AlertDialog.Builder janela = new AlertDialog.Builder(this);
                janela.setTitle("Alerta");
                janela.setMessage("Deseja mesmo converter temperatura? ");
                janela.setPositiveButton("Ok", mOuvinte);
                janela.setNegativeButton("Cancelar", null);
                janela.show();
                break;
            case 1:
                janela = new AlertDialog.Builder(this);
                janela.setTitle("Alerta");
                janela.setMessage("Deseja mesmo calcular volume?");
                janela.setPositiveButton("Ok", mOuvinte1);
                janela.setNegativeButton("Cancelar", null);
                janela.show();
                break;
            case 2:
                /*janela = new AlertDialog.Builder(this);
                janela.setTitle("Alerta");
                janela.setMessage("Tela Inexistente");
                janela.setNeutralButton("Ok", null);
                janela.show();*/
                janela = new AlertDialog.Builder(this);
                janela.setTitle("Alerta");
                janela.setMessage("Deseja mesmo converter a velocidade?");
                janela.setPositiveButton("Ok", mOuvinte2);
                janela.setNegativeButton("Cancelar", null);
                janela.show();
                break;
        }
    }
    DialogInterface.OnClickListener mOuvinte = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            intent = new Intent(ConversorUniversal2.this, ConversorUniversal3.class);
            startActivity(intent);
        }
    };

    DialogInterface.OnClickListener mOuvinte1 = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            intent = new Intent(ConversorUniversal2.this, ConversorUniversal4.class);
            startActivity(intent);
        }
    };

    DialogInterface.OnClickListener mOuvinte2 = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            intent = new Intent(ConversorUniversal2.this, ConversorUniversal5.class);
            startActivity(intent);
        }
    };
}