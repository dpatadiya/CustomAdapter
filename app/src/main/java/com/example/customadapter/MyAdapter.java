package com.example.customadapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class MyAdapter extends ArrayAdapter<Item> {

    private final Context context;
    private final ArrayList<Item> list;

    private final int[] images ={
            R.drawable.number_0,
            R.drawable.number_2,
            R.drawable.number_0,

    };

    @NonNull
    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        // 1.Create inflater
        LayoutInflater inflater=(LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2.Get rowview from inflater
        View rowView= inflater.inflate(R.layout.listitem, parent,false);

        // 3. Get the two text view from the rowview
        TextView labaleView=(TextView) rowView.findViewById(R.id.lable1);
        TextView valueView=(TextView) rowView.findViewById(R.id.value);
        ImageView imageView=(ImageView) rowView.findViewById(R.id.imageView);

        // 4. Set the text for textview
        labaleView.setText(list.get(position).getTitle());
        valueView.setText(list.get(position).getDescription());
        imageView.setBackgroundResource(images[position]);

        // 5. Return rowview
        return rowView;
    }

    MyAdapter(Context context, ArrayList<Item> list) {
        super(context, R.layout.listitem,list);
        this.context = context;
        this.list=list;
    }


}


