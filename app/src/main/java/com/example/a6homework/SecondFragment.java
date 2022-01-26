package com.example.a6homework;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a6homework.databinding.FragmentFirstBinding;
import com.example.a6homework.databinding.FragmentSecondBinding;

import java.util.ArrayList;
import java.util.BitSet;


public class SecondFragment extends Fragment implements OnClick {
    private FragmentSecondBinding binding;
    private Adapter adapter;
    ArrayList<Model> musicList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new Adapter(musicList, this);
        binding.recycler.setAdapter(adapter);
    }

    private void loadData() {
        musicList = new ArrayList<>();
        musicList.add(new Model("Кружит Вайб", "ULUKMANAPO","5:32","777"));
        musicList.add(new Model("Кружит Вайб", "ULUKMANAPO","5:32","777"));
        musicList.add(new Model("Кружит Вайб", "ULUKMANAPO","5:32","777"));
        musicList.add(new Model("Кружит Вайб", "ULUKMANAPO","5:32","777"));
        musicList.add(new Model("Кружит Вайб", "ULUKMANAPO","5:32","777"));
    }


    @Override
    public void onclick(Model model) {
        Bundle bundle =  new Bundle();
        bundle.putString("KEY", model.getMusic());
        Fragment fragment = new FragmentNameMusic();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().add(R.id.container4, fragment).commit();
    }
}