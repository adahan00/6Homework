package com.example.a6homework;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a6homework.databinding.ItemMusicBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    ArrayList<Model> musicList;
    private ItemMusicBinding binding;
    private final OnClick onClick;

    public Adapter(ArrayList<Model> musicList, OnClick onClick) {
        this.musicList = musicList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemMusicBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false);
        return new ViewHolder(binding) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(musicList.get(position));
        holder.itemView.setOnClickListener(view -> {
            onClick.onclick(musicList.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull ItemMusicBinding itemView) {
            super(itemView.getRoot());
        }

        public void bind(Model model) {
            binding.numberMusic.setText(model.getNumber());
            binding.musica.setText(model.getMusic());
            binding.nameMusic.setText(model.getName());
            binding.times.setText(model.getTime());
        }

    }
}
