package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;

import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

public class MainActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Toast.makeText(this, R.string.app_name, Toast.LENGTH_SHORT).show();

    MainCoroutineDispatcher dispatcher = Dispatchers.getMain();
    Log.d("SOME_DISPATCHERS", dispatcher.toString());
  }
}