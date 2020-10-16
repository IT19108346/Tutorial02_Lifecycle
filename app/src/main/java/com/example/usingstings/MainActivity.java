package com.example.usingstings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";//logt + tab

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 =  findViewById(R.id.TvMsg2);
        txtMsg2.setText(R.string.Msg2);
        Log.i(TAG, "onCreate: ");
        //Log.i("Lifecycle","OnCrete called...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");//Logi +tab
        //Log.i("Lifecycle","OnStart called ...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
        //Log.i("Lifecycle", "OnResume called...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
        //Log.i("Lifecycle", "onPause called...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
       // Log.i("Lifecycle", "onStop called..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
        //Log.i("lifecycle", "onDestroy called... ");
    }
}