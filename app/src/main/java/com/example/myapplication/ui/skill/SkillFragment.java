package com.example.myapplication.ui.skill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentSkillBinding;


public class SkillFragment extends Fragment {

    private FragmentSkillBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SkillViewModel homeViewModel =
                new ViewModelProvider(this).get(SkillViewModel.class);

        binding = FragmentSkillBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSkill;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}