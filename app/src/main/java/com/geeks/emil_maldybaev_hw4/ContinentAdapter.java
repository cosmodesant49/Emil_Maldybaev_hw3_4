package com.geeks.emil_maldybaev_hw4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.emil_maldybaev_hw4.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {
    private ArrayList<Continent> continentList;
    private OnClick onItemClick;

    public ContinentAdapter(ArrayList<Continent> continentList, OnClick onItemClick) {
        this.continentList = continentList;
        this.onItemClick = onItemClick;

    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentList.get(position));
        holder.itemView.setOnClickListener(view ->
                onItemClick.onClick(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }

    public class ContinentViewHolder extends RecyclerView.ViewHolder {

        private ItemContinentBinding binding;

        public ContinentViewHolder(ItemContinentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Continent continent) {
            Glide.with(binding.ivContinent1).load(continent.getImg()).into(binding.ivContinent1);
            binding.tvContinent.setText(continent.getName());
        }

    }

}
