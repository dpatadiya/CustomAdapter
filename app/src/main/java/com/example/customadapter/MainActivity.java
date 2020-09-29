package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ListView lstData;
        String data[]={"Xyz","Abc","Pqr","QWE"};

        ArrayList<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData =findViewById(R.id.lstData);
        list = generateData();
        MyAdapter adapter =new MyAdapter(this,list);
        lstData.setAdapter(adapter);


        // Simple Adapter Mate....
        /*adapter=new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                data
        );
        lstData.setAdapter(adapter);*/

    }

    private ArrayList<Item> generateData(){
        ArrayList<Item> items=new ArrayList<Item>();
        items.add(new Item("Item 1","First Item on List",R.drawable.number_0));
        items.add(new Item("Item 2","Second Item on List",R.drawable.number_3));
        items.add(new Item("Item 3","Third Item on List",R.drawable.number_2));
        return items;
    }


}