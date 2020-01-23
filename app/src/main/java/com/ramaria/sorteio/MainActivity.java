package com.ramaria.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {
        TextView txtNsorteado = findViewById(R.id.txtSorteio);
        int x = new Random().nextInt(11); //next int define o máximo de números sorteados


        txtNsorteado.setText("Número sorteado: " + x);

    }
}
