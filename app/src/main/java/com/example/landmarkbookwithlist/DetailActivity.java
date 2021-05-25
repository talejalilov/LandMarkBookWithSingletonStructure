package com.example.landmarkbookwithlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView landMarkName,countryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageView);
        landMarkName = findViewById(R.id.landMarkName);
        countryName = findViewById(R.id.countryName);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String country = intent.getStringExtra("country");

        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getSelectedImage());

        countryName.setText(name);
        landMarkName.setText(country);



    }
}