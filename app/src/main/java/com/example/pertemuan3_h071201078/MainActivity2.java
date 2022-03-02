package com.example.pertemuan3_h071201078;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(this, MainActivity3.class );
        startActivity(intent);
    }

    public void sendMessage4(View view) {
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }
}