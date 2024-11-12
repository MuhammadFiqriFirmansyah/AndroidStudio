package com.kii.BakeryApp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get data from intent
        String name = getIntent().getStringExtra("cake_name");
        String description = getIntent().getStringExtra("cake_description");
        String price = getIntent().getStringExtra("cake_price");
        int imageResource = getIntent().getIntExtra("cake_image", 0);

        // Initialize views
        ImageView imageView = findViewById(R.id.detailImage);
        TextView nameText = findViewById(R.id.detailName);
        TextView descriptionText = findViewById(R.id.detailDescription);
        TextView priceText = findViewById(R.id.detailPrice);

        // Set data to views
        imageView.setImageResource(imageResource);
        nameText.setText(name);
        descriptionText.setText(description);
        priceText.setText(price);
    }
}