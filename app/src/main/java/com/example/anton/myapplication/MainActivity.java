package com.example.anton.myapplication;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,suma,restar,multiplicar,dividir,porcentaje,negapos,igual,borrar,punto,sen,factorial,cos,e,tan,raiz,elCuadrado,rad;
    EditText contenedor;

    double p1 = 0;
    double p2 = 0;
    double resultado = 0;
    int operador =0;
    String resulfinal = "";
    String pasneg = "";
    Double calcfactorial = 1.0;
    boolean comprobacion = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    public void instancias(){

        cero = findViewById(R.id.cero);
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
       dividir = findViewById(R.id.divir);
       negapos = findViewById(R.id.posnega);
       porcentaje = findViewById(R.id.porcentaje);
       sen = findViewById(R.id.sen);
       factorial = findViewById(R.id.factorial);


       cos = findViewById(R.id.cos);
       e  = findViewById(R.id.e);
       tan = findViewById(R.id.tan);
       raiz = findViewById(R.id.sqr);
       elCuadrado = findViewById(R.id.x2);
       rad = findViewById(R.id.rad);


    }
    public void acciones(){
        //NUMEROS
        cero.setOnClickListener(this);
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
        porcentaje.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        negapos.setOnClickListener(this);
        punto.setOnClickListener(this);
        borrar.setOnClickListener(this);
        suma.setOnClickListener(this);
        restar.setOnClickListener(this);
        igual.setOnClickListener(this);
        //OPERACIONES LANDSCAPE
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            sen.setOnClickListener(this);
            factorial.setOnClickListener(this);

            cos.setOnClickListener(this);
            e.setOnClickListener(this);
            tan.setOnClickListener(this);
            raiz.setOnClickListener(this);
            elCuadrado.setOnClickListener(this);
            rad.setOnClickListener(this);

        }
    }
    @Override
    public void onClick(View v) {
        int idPulsado = v.getId();

        switch (idPulsado){
            case R.id.cero:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("0");
                break;
            case R.id.uno:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
               contenedor.append("1");
                break;
            case R.id.dos:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("2");
                break;
            case R.id.tres:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("3");
                break;
            case R.id.cuatro:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("4");
                break;
            case R.id.cinco:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("5");
                break;
            case R.id.seis:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("6");
                break;
            case R.id.siete:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("7");
                break;
            case R.id.ocho:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("8");
                break;
            case R.id.nueve:
                if (resultado > 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }else if(resultado < 0.0){
                    resultado = 0.0;
                    contenedor.setText("");
                }
                contenedor.append("9");
                break;
            case R.id.posnega:

                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else {

                    if (comprobacion == false) {
                        p1 = Double.parseDouble(contenedor.getText().toString());
                        contenedor.setText("");
                        p1 = p1 * -1;
                        pasneg = Double.toString(p1);
                        contenedor.setText(pasneg);
                        pasneg = "";
                    } else if (comprobacion) {
                        p2 = Double.parseDouble(contenedor.getText().toString());
                        contenedor.setText("");
                        p2 = p2 * -1;
                        pasneg = Double.toString(p2);
                        contenedor.setText(pasneg);
                        pasneg = "";
                    }
                }
            break;
            case R.id.punto:
                if (contenedor.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Introduzca un operador primero", Toast.LENGTH_SHORT).show();
                }else if(contenedor.getText().toString().contains(".")){
                    Toast.makeText(getApplicationContext(), "Ya contiene un punto", Toast.LENGTH_SHORT).show();
                }else{
                    contenedor.append(".");
                }
                break;

            case R.id.suma:
               if (contenedor.getText().toString().isEmpty()) {
                   comprobacion = false;
                   Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

               }else{
                   comprobacion = true;

                   p1 = Double.parseDouble(contenedor.getText().toString());

                   contenedor.setText("");
                   operador = 1;

               }


                break;
            case R.id.restar:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());

                    contenedor.setText("");
                    operador = 2;

                }
                break;
            case R.id.multiplicar:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    contenedor.setText("");
                    operador = 3;

                }
                break;
            case R.id.divir:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    contenedor.setText("");
                    operador = 4;

                }
                break;
            case R.id.porcentaje:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    contenedor.setText("");
                    operador = 5;

                }
                break;
            case R.id.sen:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    operador = 6;

                }

                break;
            case R.id.factorial:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    operador = 7;
                    break;

                }
            case R.id.e:
                operador = 9;
                break;
            case R.id.cos:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    operador = 8;

                }
                break;
            case R.id.tan:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    operador = 10;

                }
                    break;
            case R.id.sqr:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    operador = 11;

                }
                break;
            case R.id.x2:
                if (contenedor.getText().toString().isEmpty()) {
                    comprobacion = false;
                    Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{
                    comprobacion = true;
                    p1 = Double.parseDouble(contenedor.getText().toString());
                    contenedor.setText("");
                    operador = 12;

                }
                break;
            case R.id.igual:
                if (contenedor.getText().toString().isEmpty() && operador !=9) {
                    comprobacion = false;
                        Toast.makeText(getApplicationContext(),"Introduzca un operador primero",Toast.LENGTH_SHORT).show();

                }else{

                    if (operador == 1){
                        p2 = Double.parseDouble(contenedor.getText().toString());
                        contenedor.setText("");
                        resultado = p1+p2;
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else if (operador == 2) {
                        p2 = Double.parseDouble(contenedor.getText().toString());
                        contenedor.setText("");
                        resultado = p1 - p2;
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else if(operador == 3) {
                        p2 = Double.parseDouble(contenedor.getText().toString());
                        contenedor.setText("");
                        resultado = p1 * p2;
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    } else if (operador==4) {
                        p2 = Double.parseDouble(contenedor.getText().toString());
                        contenedor.setText("");
                        if (p2 == 0){
                            Toast.makeText(getApplicationContext(),"No se puede dividir entre 0",Toast.LENGTH_SHORT).show();
                        }else{
                            resultado = p1 / p2;
                            resulfinal = Double.toString(resultado);
                            contenedor.setText(resulfinal);
                        }
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else if (operador == 5) {
                        p2 = Double.parseDouble(contenedor.getText().toString());
                        contenedor.setText("");
                        resultado = p1 % p2;
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else if (operador == 6) {
                        contenedor.setText("");
                        resultado = Math.sin(p1);
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    } else if(operador == 7){
                        int aux = (int) p1;

                        for (int i = aux; i > 0; i--) {
                            calcfactorial = calcfactorial * i;
                        }
                        contenedor.setText("");
                        resulfinal = Double.toString(calcfactorial);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        calcfactorial = 1.0;
                        comprobacion = false;

                    }else if (operador == 8) {
                        contenedor.setText("");
                        resultado = Math.cos(p1);
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else if (operador == 9) {
                        contenedor.setText("");
                        resultado = Math.E;
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else if (operador == 10) {
                        contenedor.setText("");
                        resultado = Math.tan(p1);
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else if (operador == 11) {
                        contenedor.setText("");
                        resultado = Math.sqrt(p1);
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else if (operador == 12) {
                        p2 = Double.parseDouble(contenedor.getText().toString());
                        contenedor.setText("");
                        resultado = Math.pow(p1,p2);
                        resulfinal = Double.toString(resultado);
                        contenedor.setText(resulfinal);
                        p1 = 0;
                        p2 = 0;
                        operador = 0;
                        comprobacion = false;

                    }else{
                        Toast.makeText(getApplicationContext(),"ERROR",Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.borrar:
                p1 = 0;
                p2 = 0;
                operador = 0;
                comprobacion = false;
                contenedor.setText("");
                break;
        }
    }
}
