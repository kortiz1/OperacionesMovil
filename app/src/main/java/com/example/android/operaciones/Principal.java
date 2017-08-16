package com.example.android.operaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    private TxtView res;
    private EditText n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
         res = (TextView)findViewById(R.id.lblResultado);
         n1 = (TextView)findViewById(R.id.txtNumeroUno);
         n2 = (TextView)findViewById(R.id.txtNumeroDos);

    }

    public void calcular(View v){
        int num1, num2, res;
        num1 = Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
        res = num1+num2;

        res.setText(""+resultado);
    }
}
