package com.example.landmarkbookwithlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList <String> landMarkNames = new ArrayList<>();
        landMarkNames.add("Pisa");
        landMarkNames.add("Eiffel");
        landMarkNames.add("London Bridge");


        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.add("Italy");
        countryNames.add("Paris");
        countryNames.add("United Kingdom");

        Bitmap pisa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pisa);
        Bitmap eiffel = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.eiffel);
        Bitmap bridge = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.londonbridge);

        ArrayList<Bitmap> landMarkImage = new ArrayList<>();
        landMarkImage.add(pisa);
        landMarkImage.add(eiffel);
        landMarkImage.add(bridge);




        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,landMarkNames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("name",landMarkNames.get(position));
                intent.putExtra("country",countryNames.get(position));

                Singleton singleton = Singleton.getInstance();
                singleton.setSelectedImage(landMarkImage.get(position));

                startActivity(intent);
            }
        });















    }
}