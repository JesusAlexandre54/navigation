package com.example.navigation.ui.blank;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigation.databinding.FragmentBlankBinding;


public class BlankFragment extends Fragment {
    private FragmentBlankBinding binding;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      binding = FragmentBlankBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}