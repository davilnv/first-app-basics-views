package br.com.texsistemas.primeiroapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {

        TextView texto = findViewById(R.id.textResultado);

        int resultado = new Random().nextInt(11);

        texto.setText(String.format("%s %d", getString(R.string.label_resultado), resultado));

    }

}