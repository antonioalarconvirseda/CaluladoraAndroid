package com.example.anton.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,suma,restar,multiplicar,igual,borrar,punto;
    EditText contenedor;

    double p1 = 0;
    double p2 = 0;
    double resultado = 0;
    int operador =0;
    String resulfinal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    public void instancias(){
       uno = findViewById(R.id.uno);
       dos = findViewById(R.id.dos);
       tres = findViewById(R.id.tres);
       cuatro = findViewById(R.id.cuatro);
       cinco = findViewById(R.id.cinco);
       seis = findViewById(R.id.seis);
       siete = findViewById(R.id.siete);
       ocho = findViewById(R.id.ocho);
       nueve = findViewById(R.id.nueve);
       borrar = findViewById(R.id.borrar);
       suma = findViewById(R.id.suma);
       restar = findViewById(R.id.restar);
       igual = findViewById(R.id.igual);
       punto = findViewById(R.id.punto);
       contenedor = findViewById(R.id.contenedor);
       multiplicar = findViewById(R.id.multiplicar);
    }
    public void acciones(){
        //NUMEROS
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        //OPERACIONES
        multiplicar.setOnClickListener(this);
        punto.setOnClickListener(this);
        borrar.setOnClickListener(this);
        suma.setOnClickListener(this);
        restar.setOnClickListener(this);
        igual.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        boolean flag = false;
        int idPulsado = v.getId();

        switch (idPulsado){
            case R.id.uno:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
               contenedor.append("1");
                break;
            case R.id.dos:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("2");
                break;
            case R.id.tres:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("3");
                break;
            case R.id.cuatro:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("4");
                break;
            case R.id.cinco:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("5");
                break;
            case R.id.seis:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("6");
                break;
            case R.id.siete:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("7");
                break;
            case R.id.ocho:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("8");
                break;
            case R.id.nueve:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("9");
                break;
            case R.id.punto:
                contenedor.append(".");
                break;
            case R.id.suma:
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    contenedor.setText("");
                   operador = 1;
                break;
            case R.id.restar:
                p1 = Double.parseDouble(contenedor.getText().toString());
                contenedor.setText("");
                operador = 2;
                break;
            case R.id.multiplicar:
                p1 = Double.parseDouble(contenedor.getText().toString());
                contenedor.setText("");
                operador = 3;
                break;
            case R.id.igual:

                p2 = Double.parseDouble(contenedor.getText().toString());
                contenedor.setText("");
                if (operador == 1){
                    resultado = p1+p2;
                    resulfinal = Double.toString(resultado);
                    contenedor.setText(resulfinal);

                    p1 = 0;
                    p2 = 0;
                    operador = 0;

                }else if (operador == 2) {
                    resultado = p1 - p2;
                    resulfinal = Double.toString(resultado);
                    contenedor.setText(resulfinal);
                    p1 = 0;
                    p2 = 0;
                    operador = 0;
                }else if(operador == 3){
                    resultado = p1 * p2;
                    resulfinal = Double.toString(resultado);
                    contenedor.setText(resulfinal);
                    p1 = 0;
                    p2 = 0;
                    operador = 0;
                }else{
                    Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.borrar:
                p1 = 0;
                p2 = 0;
                operador = 0;
                contenedor.setText("");
                break;
        }
    }
}
