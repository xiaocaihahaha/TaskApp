package com.example.myapplication.ui.wish;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentWishBinding;

public class WishFragment extends Fragment {

    private FragmentWishBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        WishViewModel homeViewModel =
                new ViewModelProvider(this).get(WishViewModel.class);

        binding = FragmentWishBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textWish;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}