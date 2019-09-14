package com.example.customlistview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.customlistview.Player;
import com.example.customlistview.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    ArrayList<Player> arrayList;
    Context context;

    public CustomAdapter(Context context, ArrayList<Player> playerArrayList) {
        this.arrayList = playerArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        TextView txtName = itemView.findViewById(R.id.txtName);
        ImageView imageView = itemView.findViewById(R.id.image);
        txtName.setText(arrayList.get(position).getName());
        imageView.setImageResource(arrayList.get(position).getImgDrawableId());
        return itemView;
    }
}
