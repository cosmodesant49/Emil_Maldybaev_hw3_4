package com.geeks.emil_maldybaev_hw4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.emil_maldybaev_hw4.databinding.ItemContinentBinding;
import com.geeks.emil_maldybaev_hw4.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryHolder> {
    private ArrayList <Country> listCountry;

    public CountryAdapter(ArrayList<Country> listCountry) {
        this.listCountry = listCountry;
    }

    @NonNull
    @Override
    public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryHolder holder, int position) {
        holder.bind(listCountry.get(position));
    }

    @Override
    public int getItemCount() {
        return listCountry.size();
    }

    public  class CountryHolder extends RecyclerView.ViewHolder {
        private ItemCountryBinding binding;
        public CountryHolder(ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Country country){
            Glide.with(binding.ivCountry).load(country.getImg()).into(binding.ivCountry);
            binding.tvCountry.setText(country.getName());
        }
    }
}
