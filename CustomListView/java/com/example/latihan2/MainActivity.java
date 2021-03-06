package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    List<Hero> heroList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        heroList.add(new Hero(R.drawable.spiderman, "Spiderman", "Avenger"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.ironman, "Iron Man", "Avenger"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avenger"));
        heroList.add(new Hero(R.drawable.captainamerica, "Captain Americe", "Avenger"));
        heroList.add(new Hero(R.drawable.batman, "Batman", "Justice League"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);

        listView.setAdapter(adapter);
    }
}