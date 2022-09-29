package com.example.coffeeshops;

import static androidx.recyclerview.widget.RecyclerView.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter {
    ArrayList<CoffeeShops> myList = new ArrayList<>();
    Context context;

    public ItemAdapter(ArrayList<CoffeeShops> myList, Context context) {
        this.myList = myList;
        this.context = context;
    }

    @NonNull
    @Override



    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        ((ViewHolder)holder).img.setImageResource(myList.get(position).getImg());
        ((ViewHolder)holder).textname.setText(myList.get(position).getName());
        ((ViewHolder)holder).textLoc.setText(myList.get(position).getLocation());
        ((ViewHolder)holder).textDrink.setText(myList.get(position).getSignatureDrink());

        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("coffeeshops",myList.get(position));
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return myList.size() ;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView textname,textLoc,textDrink;
        View v;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageViewPic);
            textname = v.findViewById(R.id.textViewName);
            textLoc = v.findViewById(R.id.textViewLoc);
            textDrink = v.findViewById(R.id.textViewDrink);

        }
    }
}