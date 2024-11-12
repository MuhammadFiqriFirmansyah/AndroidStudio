package com.kii.BakeryApp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kii.BakeryApp.R;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CakeAdapter adapter;
    private List<Cake> cakeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        cakeList = new ArrayList<>();
        initializeCakes();

        adapter = new CakeAdapter(cakeList);
        recyclerView.setAdapter(adapter);
    }

    private void initializeCakes() {
        cakeList.add(new Cake("Red Velvet", "Kue dengan cream cheese frosting yang lembut", "Rp 45.000", R.drawable.red_velvet));
        cakeList.add(new Cake("Chocolate Cake", "Kue coklat dengan lapisan ganache yang kaya", "Rp 40.000", R.drawable.chocolate));
        cakeList.add(new Cake("Strawberry Shortcake", "Kue vanilla dengan potongan strawberry segar", "Rp 50.000", R.drawable.strawberry));
        cakeList.add(new Cake("Tiramisu", "Kue kopi Italia klasik dengan mascarpone", "Rp 55.000", R.drawable.tiramisu));
        cakeList.add(new Cake("Cheesecake", "New York style cheesecake yang creamy", "Rp 60.000", R.drawable.cheesecake));
        cakeList.add(new Cake("Black Forest", "Kue coklat dengan cherry dan whipped cream", "Rp 48.000", R.drawable.black_forest));
        cakeList.add(new Cake("Matcha Cake", "Kue green tea Jepang dengan white chocolate", "Rp 52.000", R.drawable.matcha));
        cakeList.add(new Cake("Carrot Cake", "Kue wortel dengan cream cheese frosting", "Rp 42.000", R.drawable.carrot));
    }
}