package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import java.nio.channels.ScatteringByteChannel;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView resultado;
    Button btnSoma;
    Button btnMulti;
    Button btnSub;
    Button btnDiv;

    double n1, n2, soma, sub, div, multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        resultado = (TextView) findViewById(R.id.resultado);
        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnMulti = (Button) findViewById(R.id.btnMulti);
    }

    public void somar(View view)
    {
        try
        {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            if (n1 > 0 && n2 > 0) {
                soma = n1 + n2;
            }
            resultado.setText(Double.toString(soma));
        }
        catch (NumberFormatException e)
        {
          resultado.setText ("Insira somente algarismos");
        }
    }

    public void subtrair(View view)
    {
        try
        {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            if (n1 > 0 && n2 > 0)
            {
                sub = n1 - n2;
            }
            resultado.setText(Double.toString(sub));
        }
        catch(NumberFormatException e)
        {
            resultado.setText ("Insira somente algarismos");
        }
    }

    public void multiplicar(View view)
    {
        try
        {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            multi = n1 * n2;
            resultado.setText(Double.toString(multi));
        }
        catch(NumberFormatException e)
        {
                resultado.setText ("Insira somente algarismos");
        }
    }

    public void dividir(View view)
    {
        try
        {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());

            try
            {
                div = n1 / n2;
                resultado.setText(Double.toString(div));
            }
            catch (ArithmeticException e)
            {
                resultado.setText("Impossível efetuar divisão por 0");
            }
        }
        catch(NumberFormatException e)
        {
            resultado.setText ("Insira somente algarismos");
        }

    }
}


