package com.home.onedemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.home.onedemo.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        showToast("44444");
    }

    private void showToast(String str) {
        Toast.makeText(this, str + "", Toast.LENGTH_SHORT).show();
    }

}
