package com.brianvp.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num1, num2, result;

    EditText n1,n2;
    TextView res;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);

        res = (TextView) findViewById(R.id.resultado);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
    }

    public void sumar(View view){
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
        result = num1+ num2;
        res.setText("El resultado de la suma es: " + result);

    }
    public void restar(View view){
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
        result = num1 - num2;
        res.setText("El resultado de la resta es: " + result);

    }
    public void multiplicar(View view){
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
        result = num1 * num2;
        res.setText("El resultado de la multiplicacion: " + result);

    }
    public void dividir(View view){
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
        if(num2 >=0){
            result = num1 / num2;
            res.setText("El resultado de la division es: " + result);
        }
        else{
            res.setText("Division no valida");
        }


    }
}
