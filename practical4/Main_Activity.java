package com.sam.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle sam) {
        super.onCreate(sam);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onDestroy");
    }

}