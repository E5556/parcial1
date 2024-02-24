package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.function.BiFunction;

public class MainActivity2 extends AppCompatActivity {
    private EditText Ingreso1;
    private EditText Ingreso2;
    private TextView Resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Ingreso1 = findViewById(R.id.Ing1);
        Ingreso2 = findViewById(R.id.Ing2);
        Resultados = findViewById(R.id.rest);
    }

    private void realizarOperacion(View view, BiFunction<Integer, Integer, Integer> operacion) {
        int num1 = Integer.parseInt(Ingreso1.getText().toString());
        int num2 = Integer.parseInt(Ingreso2.getText().toString());
        int resultado = operacion.apply(num1, num2);
        Resultados.setText(String.valueOf(resultado));
    }

    public void sumar(View view) {
        realizarOperacion(view, (num1, num2) -> num1 + num2);
    }

    public void resta(View view) {
        realizarOperacion(view, (num1, num2) -> num1 - num2);
    }

    public void multiplicacion(View view) {
        realizarOperacion(view, (num1, num2) -> (num1*500)+(num2*1000);
    }

    public void division(View view) {
        int num1 = Integer.parseInt(Ingreso1.getText().toString());
        int num2 = Integer.parseInt(Ingreso2.getText().toString());

        if (num2 != 0) {
            realizarOperacion(view, (n1, n2) -> n1 / n2);
        } else {
            Resultados.setText("Error: división por cero");
        }
}
}