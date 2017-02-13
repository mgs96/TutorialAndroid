package com.example.mauricio.tutorialandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "Los Mensajes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickElBoton(View view) {
        Toast.makeText(this,"Click en el boton ElBoton", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "El boton");
    }
}
