package com.abnerfonseca.aulafrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = { "Frase 1", "Frase 2", "Frase 3", "Frase 4", "Frase 5" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase (View view){

        TextView fraseRandomica = findViewById(R.id.textResultado);
        int nunmeroRandomico = new Random().nextInt(4);

        fraseRandomica.setText(frases[nunmeroRandomico]);

    }

    public void exibirFrases (View view){

        TextView texto = findViewById(R.id.textResultado);

        String  textResult = "";
        for (String frase : frases){
            System.out.println(frase);
            textResult = textResult + frase + "\n" ;
            System.out.println(textResult);
        }
        texto.setText(textResult);
    }

}