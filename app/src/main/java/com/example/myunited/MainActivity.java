package com.example.myunited;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

//    Adapter View
    ListView listView;

//    Data Source
    ArrayList<Squad> squadArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_item);

        squadArrayList = new ArrayList<>();

        SquadAdapter squadAdapter;

        Squad player1 = new Squad("Andre Onana","24", R.drawable.onana);
        Squad player2 = new Squad("Diogo Dalot","20", R.drawable.dalot);
        Squad player3 = new Squad("Noussair Mazraoui","3", R.drawable.mazraoui);
        Squad player4 = new Squad("Matthijjs De Ligt","4", R.drawable.deligt);
        Squad player5 = new Squad("Harry Maguire","5", R.drawable.maguire);
        Squad player6 = new Squad("Victor Lindelof","2", R.drawable.lindelof);
        Squad player7 = new Squad("Toby Collyer","43", R.drawable.collyer);
        Squad player8 = new Squad("Lisandro Martinez","6", R.drawable.martinez);
        Squad player9 = new Squad("Kobbie Mainoo","37", R.drawable.mainoo);
        Squad player10 = new Squad("Mason Mount","18", R.drawable.mount);
        Squad player11 = new Squad("Bruno Fernandes","8", R.drawable.bruno);
        Squad player12 = new Squad("Manuel Ugarte","25", R.drawable.ugarte);
        Squad player13 = new Squad("Casemiro","18", R.drawable.casemiro);
        Squad player14 = new Squad("Rasmus Hojlund","9", R.drawable.hojlund);
        Squad player15 = new Squad("Marcus Rashford","10", R.drawable.rashford);
        Squad player16 = new Squad("Alejandro Garnacho","17", R.drawable.garnacho);
        Squad player17 = new Squad("Joshua Zirkzee","11", R.drawable.zirkzee);
        Squad player18 = new Squad("John Evans","35", R.drawable.evans);
        Squad player19 = new Squad("Christian Eriksen","14", R.drawable.eriksen);
        Squad player20 = new Squad("Antony","21", R.drawable.antony);
        Squad player21 = new Squad("Harry Amass","14", R.drawable.amas);
        Squad player22 = new Squad("Amad","19", R.drawable.amad);

        squadArrayList.add(player1);
        squadArrayList.add(player2);
        squadArrayList.add(player3);
        squadArrayList.add(player4);
        squadArrayList.add(player5);
        squadArrayList.add(player6);
        squadArrayList.add(player7);
        squadArrayList.add(player8);
        squadArrayList.add(player9);
        squadArrayList.add(player10);
        squadArrayList.add(player11);
        squadArrayList.add(player12);
        squadArrayList.add(player13);
        squadArrayList.add(player14);
        squadArrayList.add(player15);
        squadArrayList.add(player16);
        squadArrayList.add(player17);
        squadArrayList.add(player18);
        squadArrayList.add(player19);
        squadArrayList.add(player20);
        squadArrayList.add(player21);
        squadArrayList.add(player22);

        squadAdapter = new SquadAdapter(this,squadArrayList);
        listView.setAdapter(squadAdapter);

//        Handling click events
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Hi,It's " +squadAdapter.getItem(position).getPlayerName(), Toast.LENGTH_SHORT).show();

            }
        });

//        listView.setOnItemClickListener((parent, view, position, id) -> {
//
//        });


    }
}