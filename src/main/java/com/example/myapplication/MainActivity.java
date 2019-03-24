package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    public static final String TAG="lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"oncreate");
    }
        @Override
        protected void onStart(){
            super.onStart();
            Log.d(TAG,"onstart");
        }
        @Override
        protected void onResume(){
            super.onResume();
            Log.d(TAG,"onresume");
        }
        @Override
        protected void onPause(){
            super.onPause();
            Log.d(TAG,"onpause");
        }
        @Override
        protected  void onStop(){
            super.onStop();
            Log.d(TAG,"onstop");
        }
        @Override
        protected void onDestroy(){
            super.onDestroy();
            Log.d(TAG,"onDestroy");
        }
        @Override
        protected void onRestart(){
            super.onRestart();
            Log.d(TAG,"onrestart");
        }
}
