package com.sematech.android.basic.farvardin98;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toast.makeText(this, "asjasjkna", Toast.LENGTH_SHORT).show();
    }
}
