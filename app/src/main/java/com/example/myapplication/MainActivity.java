package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText Entrada1;

    private EditText Entrada2;

    private TextView Resultado;







    public void sumar(View view){
        int sumatoria = Integer.parseInt(Entrada1.getText().toString())+Integer.parseInt(Entrada2.getText().toString());
        Resultado.setText(String.valueOf(sumatoria));
    }

    public void Extendida(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


}