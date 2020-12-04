package com.example.appfood;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appfood.adapter.PopularAdapter;
import com.example.appfood.adapter.allMenuAdapter;
import com.example.appfood.adapter.recommendedAdapter;
import com.example.appfood.model.Allmenu;
import com.example.appfood.model.FoodData;
import com.example.appfood.model.Popular;
import com.example.appfood.model.Recommended;
import com.example.appfood.retrofit.APIinterfface;
import com.example.appfood.retrofit.Retrofitclient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    APIinterfface apIinterfface;
    RecyclerView popularRecycleView;
    PopularAdapter popularAdapter;
    recommendedAdapter recommendedAdapter;
    RecyclerView recommendedRecyclerView;
    allMenuAdapter allMenuAdapter;
    RecyclerView allMenuRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apIinterfface = Retrofitclient.getClientInstance().create(APIinterfface.class);
        Call<List<FoodData>> call = apIinterfface.getAllData();
        call.enqueue(new Callback<List<FoodData>>() {
            @Override
            public void onResponse(Call<List<FoodData>> call, Response<List<FoodData>> response) {
                List<FoodData> foodDataList = response.body();

                getPopularData(foodDataList.get(0).getPopular());
                getRecommededrData(foodDataList.get(0).getRecommended());
                getAllmenuData(foodDataList.get(0).getAllmenu());

                // lets run it
                // We have data  from server
                // now we show show data in app recycler view
                // lets make  recycler view adapter
                // We have setup and bind popular section
                // in a same way add recommended and all menu items
                // we add two adapter class for allmenu and recommended items
                // so lets do it fast

            }
            @Override
            public void onFailure(Call<List<FoodData>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Servert not responding.", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void getPopularData(List<Popular> popularList){
          popularRecycleView = findViewById(R.id.popular_recycler);
          popularAdapter = new PopularAdapter(this, popularList);
          RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, true);
          popularRecycleView.setLayoutManager(layoutManager);
          popularRecycleView.setAdapter(popularAdapter);
    }
    private void getRecommededrData(List<Recommended> recommendedList){
        recommendedRecyclerView = findViewById(R.id.recommended_recycler);
        recommendedAdapter = new recommendedAdapter(this, recommendedList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, true);
        recommendedRecyclerView.setLayoutManager(layoutManager);
        recommendedRecyclerView.setAdapter(recommendedAdapter);
    }
    private void getAllmenuData(List<Allmenu> allmenuList){
        allMenuRecyclerView = findViewById(R.id.Allmenu_recycler);
        allMenuAdapter = new allMenuAdapter(this, allmenuList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, true);
        allMenuRecyclerView.setLayoutManager(layoutManager);
        allMenuRecyclerView.setAdapter(allMenuAdapter);
    }

}


    // To day we are going to make a Food App
    //  we have three category data
    // -> popular item, recommended items and all menu
    // let have a look on json data  : https://androidappsforyoutube.s3.ap-south-1.amazonaws.com/foodapp/fooddata.json
    // so lets start coding....
    // lets retrofit dependency in gradle file for network call
    // Retrofit trong Android – Luôn là một chủ đề mà các Android Developer luôn thắc mắc.
    // Vậy Retrofit là gì? Ngắn gọn, Retrofit là một công nghệ được phát triển bởi Square,
    // nó được xây dựng dựa trên rất nhiều công nghệ mạnh mẽ cho phép giải quyết tốt các yêu cầu từ phía client và server một cách nhanh và hiệu quả nhất.
    // Tóm lại, Retrofit là một REST Client dành Android và cả Java. Retrofit được phát triển giúp cho quá trình kết nối client
    // – server trở nên dễ dàng, nhanh chóng. Đối với Retrofit bạn có thể GET, POST, PUT, DELETE …
    // we have setup model class  and adapter class
    // now we are going setup data in recyclerview


