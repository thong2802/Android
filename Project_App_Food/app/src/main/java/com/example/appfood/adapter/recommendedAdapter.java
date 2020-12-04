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
import com.example.appfood.model.Recommended;

import java.util.List;

public class recommendedAdapter extends RecyclerView.Adapter<recommendedAdapter.RecommendedHolder>{
    private Context context;
    private List<Recommended> recommendedList;

    public recommendedAdapter(Context context, List<Recommended> recommendedList) {
        this.context = context;
        this.recommendedList = recommendedList;
    }

    @NonNull
    @Override
    public RecommendedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recommended_recycler_items, parent, false);
        return new RecommendedHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedHolder holder, int position) {
        Glide.with(context).load(recommendedList.get(position).getImageUrl()).into(holder.recommendedImage);
        holder.recommmendedName.setText(recommendedList.get(position).getName());
        holder.recommendedrating.setText(recommendedList.get(position).getRating());
        holder.recommendeddelivery.setText(recommendedList.get(position).getDeliveryTime());
        holder.recommendedCharges.setText(recommendedList.get(position).getDeliveryCharges());
        holder.recommendedprice.setText(recommendedList.get(position).getPrice() + " $");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, AppFoodDetails.class);
                i.putExtra("Name", recommendedList.get(position).getName());
                i.putExtra("Price", recommendedList.get(position).getPrice());
                i.putExtra("Rating", recommendedList.get(position).getRating());
                i.putExtra("Image", recommendedList.get(position).getImageUrl());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return recommendedList.size();
    }

    public static class RecommendedHolder extends RecyclerView.ViewHolder{
        ImageView recommendedImage;
        TextView recommmendedName, recommendedrating, recommendeddelivery, recommendedprice, recommendedCharges ;
        public RecommendedHolder(@NonNull View itemView) {
            super(itemView);

            recommendedImage = itemView.findViewById(R.id.recommended_image);
            recommmendedName = itemView.findViewById(R.id.reccommended_name);
            recommendedrating = itemView.findViewById(R.id.recommended_rating);
            recommendeddelivery = itemView.findViewById(R.id.recommended_deliverytime);
            recommendedprice = itemView.findViewById(R.id.recommended_price);
            recommendedCharges = itemView.findViewById(R.id.delivery_type);
        }
    }
}


