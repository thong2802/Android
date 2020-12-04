package com.example.appfood;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class AppFoodDetails extends AppCompatActivity {
 // now we will get data from intent and set data to UI
    String name;
    String imageUrl1;
    String price;
    String rating;
    ImageView imageView12;
    TextView itemName, itemPrice, itemRating;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_food_details);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        imageUrl1 = intent.getStringExtra("image");
        price = intent.getStringExtra("Price");
        rating = intent.getStringExtra("Rating");

        itemName = findViewById(R.id.name_name);
        imageView12 = findViewById(R.id.image_view5);
        itemPrice = findViewById(R.id.price);
        itemRating = findViewById(R.id.rating);
        ratingBar = findViewById(R.id.ratingBar);

        itemName.setText(name);
        itemPrice.setText(price);
        itemRating.setText(rating);
        ratingBar.setRating(Float.parseFloat(String.valueOf(rating)));
        Glide.with(getApplicationContext()).load(imageUrl1).into(imageView12);


    }
}