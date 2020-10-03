package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ChildAcivity extends AppCompatActivity{

    ListView lvSinger;
    ArrayList<Singer> arraySinger;
    SingerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_child);
        AnhXa();
        adapter = new SingerAdapter(this,R.layout.line_singer,arraySinger);
        lvSinger.setAdapter(adapter);

    }
    private void AnhXa(){
        lvSinger =(ListView) findViewById(R.id.listview);
        arraySinger = new ArrayList<>();
        arraySinger.add(new Singer("Có chắc yêu là đây","mô tả 1",R.drawable.st1));
        arraySinger.add(new Singer("Âm thầm bên em","Mô tả 2",R.drawable.st2));
        arraySinger.add(new Singer("Nơi này có anh","Mô tả 3",R.drawable.st3));
        arraySinger.add(new Singer("Chạy ngay đi","mô tả 4",R.drawable.st4));
    }
    //Turn off layout
    public void returnMain(View v){
        finish();
    }
}
