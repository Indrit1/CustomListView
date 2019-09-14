package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.customlistview.adapters.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Player> playerArrayList;
    ListView listView;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.customListView);
        addDataToArrayList();
        customAdapter = new CustomAdapter(this, playerArrayList);
        listView.setAdapter(customAdapter);
    }

    private void addDataToArrayList() {
        playerArrayList = new ArrayList<>();
        playerArrayList.add(new Player("Kaka", R.drawable.kaka));
        playerArrayList.add(new Player("Messi", R.drawable.messi));
        playerArrayList.add(new Player("Sheva", R.drawable.sheva));
    }
}
