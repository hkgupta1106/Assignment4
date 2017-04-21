package com.example.himanshu.assignment4;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.RecyclerViewAdapter;
import model.BaseModel;

/**
 * home screen activity
 */
public class HomeScreenActivity extends AppCompatActivity {

    private ArrayList<BaseModel> baseModelList = new ArrayList<>();
    private BaseModel baseModel;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(baseModelList, this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_display);
        baseModel = new BaseModel("hitesh");
        baseModelList.add(baseModel);
        baseModel = new BaseModel("sumit");
        baseModelList.add(baseModel);
        baseModel = new BaseModel("rahul");
        baseModelList.add(baseModel);
        baseModel = new BaseModel("gitesh");
        baseModelList.add(baseModel);
        baseModel = new BaseModel("amit");
        baseModelList.add(baseModel);
        baseModel = new BaseModel("bhadwa");
        baseModelList.add(baseModel);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);


    }
}
