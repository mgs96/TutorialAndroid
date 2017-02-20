package com.example.mauricio.tutorialandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "Los Mensajes";

    EditText etEntrada;
    TextView tvSalida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEntrada = (EditText) findViewById(R.id.etEntrada);
        tvSalida = (TextView) findViewById(R.id.tvSalida);
    }

    public void onClickElBoton(View view) {
        String entrada = etEntrada.getText().toString();
        tvSalida.setText(entrada);
    }

    public void onClickIra2(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        String entrada = etEntrada.getText().toString();
        i.putExtra("P1", entrada);
        i.putExtra("P2", new Data(2,4));
        startActivity(i);
    }
}
