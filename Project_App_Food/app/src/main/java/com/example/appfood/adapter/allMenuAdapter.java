package com.example.appfood.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.appfood.AppFoodDetails;
import com.example.appfood.R;
import com.example.appfood.model.Allmenu;

import java.util.List;

public class allMenuAdapter extends RecyclerView.Adapter<allMenuAdapter.allViewHolder> {
    private   Context context;
    private List<Allmenu> allmenuList;

    public allMenuAdapter(Context context, List<Allmenu> allmenuList) {
        this.context = context;
        this.allmenuList = allmenuList;
    }

    @NonNull
    @Override
    public allViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.allmenu_recycler_items, parent, false);
        return new allViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull allViewHolder holder, int position) {
         Glide.with(context).load(allmenuList.get(position).getImageUrl()).into(holder.allmenuimage);
         holder.allmenuname.setText(allmenuList.get(position).getName());
         holder.allmenunote.setText(allmenuList.get(position).getNote());
         holder.allmenurating.setText(allmenuList.get(position).getRating());
         holder.allmenudeliverytime.setText(allmenuList.get(position).getDeliveryTime());
         holder.allmenuChages.setText(allmenuList.get(position).getDeliveryCharges());
         holder.allmenuprice.setText(allmenuList.get(position).getPrice() + " $");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, AppFoodDetails.class);
                i.putExtra("Name", allmenuList.get(position).getName());
                i.putExtra("Price", allmenuList.get(position).getPrice());
                i.putExtra("Rating", allmenuList.get(position).getRating());
                i.putExtra("Image", allmenuList.get(position).getImageUrl());

                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return allmenuList.size();
    }

    public static class allViewHolder extends RecyclerView.ViewHolder{
        ImageView allmenuimage;
        TextView allmenuname, allmenunote, allmenurating, allmenudeliverytime,allmenuChages, allmenuprice;
        public allViewHolder(@NonNull View itemView) {
            super(itemView);

            allmenuimage = itemView.findViewById(R.id.popular2_image);
            allmenuname = itemView.findViewById(R.id.popular2_name);
            allmenunote = itemView.findViewById(R.id.popular2_note);
            allmenurating = itemView.findViewById(R.id.popular2_rating);
            allmenudeliverytime = itemView.findViewById(R.id.popular2_deliverytime);
            allmenuChages = itemView.findViewById(R.id.popular2_type_delivery);
            allmenuprice = itemView.findViewById(R.id.popular2_price);
        }
    }
}
