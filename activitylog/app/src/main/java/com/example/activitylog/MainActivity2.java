package com.example.activitylog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("TAh", "GotoA:1 ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAh", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAh", "onResume");
    }

    public void GotoA(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        Log.d("TAh", "GotoA:4 ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAh", "onPause ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAh", "onStop ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAh", "onDestroy ");
    }
}