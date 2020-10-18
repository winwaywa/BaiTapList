package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvRes;
    ArrayList<Restaurant> arrayRes;
    RestaurantAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        adapter = new RestaurantAdapter(this,R.layout.item_res,arrayRes);
        lvRes.setAdapter(adapter);
    }
    private void AnhXa(){
        lvRes =(ListView) findViewById(R.id.listview);
        arrayRes = new ArrayList<>();
        arrayRes.add(new Restaurant("Nhà hàng đường tàu 1","mô tả 1",R.drawable.res1));
        arrayRes.add(new Restaurant("Nhà hàng Song Hỷ","Mô tả 2",R.drawable.res2));
        arrayRes.add(new Restaurant("Nhà hàng Vạn Phước","Mô tả 3",R.drawable.res3));
        arrayRes.add(new Restaurant("Nhà hàng tiệc cưới Gia Hân","mô tả 4",R.drawable.res4));
    }
    public void doOpenChildActivity(View View)
    {
        Intent myIntent=new Intent(this, ProfileActivity.class);
        startActivity(myIntent);
    }
}