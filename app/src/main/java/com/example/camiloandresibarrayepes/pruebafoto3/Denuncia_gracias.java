package com.example.camiloandresibarrayepes.pruebafoto3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Denuncia_gracias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denuncia_gracias);

    }

    public void volver(View view) {

        Intent intent = new Intent(getApplicationContext(), Main2Activity.class)/*.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP)*/;
        startActivity(intent);
    }

}
