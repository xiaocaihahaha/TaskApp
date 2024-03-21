package com.example.myapplication.ui.property;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentPropertyBinding;

public class PropertyFragment extends Fragment {

    private FragmentPropertyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PropertyViewModel homeViewModel =
                new ViewModelProvider(this).get(PropertyViewModel.class);

        binding = FragmentPropertyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textProperty;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}