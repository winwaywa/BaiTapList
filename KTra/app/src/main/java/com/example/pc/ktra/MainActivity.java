package com.example.pc.ktra;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doOpenChildActivity(View View)
    {
        Intent myIntent=new Intent(this, ChildActivity.class);
        startActivity(myIntent);
    }
}
