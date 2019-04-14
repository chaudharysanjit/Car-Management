package com.example.carmanager;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>
{
    private ArrayList<Car> list;

    public RecyclerAdapter(ArrayList<Car> list)
    {
        this.list=list;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i)
    {
        Car c = list.get(i);
        itemViewHolder.id.setText("Car ID: "+c.getId());
        itemViewHolder.manu.setText("Manufacturer: "+c.getManufacture());
        itemViewHolder.color.setText("Color: "+c.getColor());
        itemViewHolder.engine.setText("Engine: "+c.getEngine());
        itemViewHolder.price.setText("Price: "+c.getPrice());

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder
    {
        public TextView id, manu, color, engine, price;

        public ItemViewHolder(@NonNull View itemView)
        {
            super(itemView);

            this.id = itemView.findViewById(R.id.cid);
            this.manu = itemView.findViewById(R.id.manu);
            this.color = itemView.findViewById(R.id.color);
            this.engine = itemView.findViewById(R.id.engine);
            this.price = itemView.findViewById(R.id.price);
        }
    }
}
