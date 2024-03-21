package com.example.myapplication.ui.goods;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentGoodsBinding;

public class GoodsFragment extends Fragment {

    private FragmentGoodsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GoodsViewModel slideshowViewModel =
                new ViewModelProvider(this).get(GoodsViewModel.class);

        binding = FragmentGoodsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGoods;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}