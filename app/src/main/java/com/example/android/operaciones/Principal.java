package com.example.android.operaciones;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.res.Resources;


public class Principal extends AppCompatActivity {

    private TextView res;
    private EditText n1, n2;
    private Spinner operaciones;
    private String op [];
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        res = (TextView)findViewById(R.id.lblResultado);
        n1 = (EditText)findViewById(R.id.txtNumeroUno);
        n2 = (EditText)findViewById(R.id.txtNumeroDos);
        operaciones =(Spinner)findViewById(R.id.cmbOperaciones);
        resources = this.getResources();
        op = resources.getStringArray(R.array.operaciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, op);
        operaciones.setAdapter(adapter);

    }




    public boolean validar(){
        if(n1.getText().toString().isEmpty()){
            n1.setError("DIGITE NUMERO 1");
            return false;
        }
        if(n2.getText().toString().isEmpty()){
            n2.setError("DIGITE NUMERO 2");
            return false;
        }
        return true;
    }


    public void calcular(View v){
        int  opcion;
        double num1, num2, resultado=0;

        if(validar()) {

            opcion = operaciones.getSelectedItemPosition();
            num1 = Double.parseDouble(n1.getText().toString());
            num2 = Double.parseDouble(n2.getText().toString());

            switch (opcion){

                case 0:
                  resultado = num1+num2;
                    break;
                case 1:
                    resultado = num1-num2;
                    break;

                case 2:
                    resultado = num1*num2;
                    break;

                case 3:
                    resultado = num1/num2;
                    break;
            }


            res.setText("" +resultado);
        }
    }


    public void Borrar (View v) {
        res.setText("");
        n1.setText("");
        n2.setText("");
        n1.requestFocus();
    }

}