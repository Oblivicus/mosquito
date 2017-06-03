package com.cuger.demon.demon;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    protected SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,
                WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        preferences=getSharedPreferences("phone", Context.MODE_PRIVATE);
        Log.d(TAG, "onCreate: first");


    }
}
