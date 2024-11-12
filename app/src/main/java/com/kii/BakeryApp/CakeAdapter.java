package com.kii.BakeryApp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.CakeViewHolder> {
    private final List<Cake> cakeList;
    private Context context;

    public CakeAdapter(List<Cake> cakeList) {
        this.cakeList = cakeList;
    }

    @NonNull
    @Override
    public CakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_cake, parent, false);
        return new CakeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CakeViewHolder holder, int position) {
        Cake cake = cakeList.get(position);
        holder.nameText.setText(cake.getName());
        holder.descriptionText.setText(cake.getDescription());
        holder.priceText.setText(cake.getPrice());
        holder.imageView.setImageResource(cake.getImageResource());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("cake_name", cake.getName());
            intent.putExtra("cake_description", cake.getDescription());
            intent.putExtra("cake_price", cake.getPrice());
            intent.putExtra("cake_image", cake.getImageResource());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return cakeList.size();
    }

    public static class CakeViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameText, descriptionText, priceText;

        public CakeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cakeImage);
            nameText = itemView.findViewById(R.id.cakeName);
            descriptionText = itemView.findViewById(R.id.cakeDescription);
            priceText = itemView.findViewById(R.id.cakePrice);
        }
    }
}