package com.example.activitylog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "GotoB:H ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG", "onStartJ ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResumek ");
    }

    public void GotoB(View view) {

    Intent intent = new Intent(this, MainActivity2.class);
    startActivity(intent);
     Log.d("TAG", "GotoB:l ");

   }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "onPauseo ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "onStopi ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroyu ");
    }
}