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

    public void alterarTexto(View view) {

        TextView texto = findViewById(R.id.textResultado);

        Random random = new Random();

        int resultado = random.ints(0, 10).findAny().getAsInt();

        texto.setText(getString(R.string.label_resultado) + " " + resultado );

    }

}