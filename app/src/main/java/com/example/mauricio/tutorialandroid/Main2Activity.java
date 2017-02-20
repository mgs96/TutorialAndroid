package com.example.mauricio.tutorialandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    String TAG = "Los mensajes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String msg = i.getStringExtra("P1");
        Data data = (Data) i.getSerializableExtra("P2");
        Log.d(TAG, "El mensaje es " + msg);
        Log.d(TAG, "El mensaje es " + msg);
    }

    public void onClickGoBack(View view) {
        EditText et = (EditText) findViewById(R.id.etEntrada);
        int value = Integer.valueOf(et.getText().toString());

        Intent returnIntent = new Intent();
        returnIntent.putExtra("Valor", new Data(value, value));
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}
