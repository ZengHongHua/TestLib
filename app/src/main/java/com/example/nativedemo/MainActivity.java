package com.example.nativedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private NumNative numNative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numNative = new NumNative();

        TextView sum = findViewById(R.id.mainSum);

        int sumFromC = numNative.getSumFromC(33, 180);
        sum.setText("获取的结果："+sumFromC);
    }

}