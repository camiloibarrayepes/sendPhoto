package com.example.camiloandresibarrayepes.pruebafoto3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void denuncias(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class)/*.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)*/;
        startActivity(intent);
    }

    public void button_info(View view) {

        Intent intent = new Intent(getApplicationContext(), info_adda.class)/*.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)*/;
        startActivity(intent);
    }

    public void se_parte(View view) {

        Intent intent = new Intent(getApplicationContext(), se_parte.class)/*.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)*/;
        startActivity(intent);
    }

    public void llamadas(View view) {

        Intent intent = new Intent(getApplicationContext(), llamadas.class)/*.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)*/;
        startActivity(intent);
    }

    public void usar_adda(View view) {

        Intent intent = new Intent(getApplicationContext(), Mas_info.class)/*.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)*/;
        startActivity(intent);
    }


}
