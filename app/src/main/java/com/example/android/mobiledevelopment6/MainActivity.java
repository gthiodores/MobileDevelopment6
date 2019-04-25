package com.example.android.mobiledevelopment6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Menu1(View view) {
        Intent intent = new Intent(MainActivity.this, Menu2.class);
        startActivity(intent);
    }
}
