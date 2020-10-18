package com.example.apptonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RestaurantAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Restaurant> resList;

    public RestaurantAdapter(Context context, int layout, List<Restaurant> singerList) {
        this.context = context;
        this.layout = layout;
        this.resList = singerList;
    }

    @Override
    public int getCount() {
        return resList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView txtTen = (TextView)view.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView)view.findViewById(R.id.textviewMoTa);
        ImageView imgHinh = (ImageView)view.findViewById(R.id.imageviewHinh);
        Restaurant singer = resList.get(position);
        txtTen.setText(singer.getTen());
        txtMoTa.setText(singer.getMoTa());
        imgHinh.setImageResource(singer.getHinh());

        return view;
    }
}