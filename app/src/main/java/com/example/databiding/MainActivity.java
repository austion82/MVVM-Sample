package com.example.databiding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;

import com.example.databiding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // 액티비티의 라이프사이클을 참조하면서 데이터가 변경될 경우 Refresh 시키겠다.
        binding.setLifecycleOwner(this);

        // 첫번째 호출할 때, ViewModel
        // 두번째 호출할 때, 기존 ViewModel 반환
        CounterViewModel viewmodel = ViewModelProviders.of(this).get(CounterViewModel.class);
        binding.setViewModel(viewmodel);


        /*binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewmodel.plus();
            }
        });

        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewmodel.minus();
            }
        });

        viewmodel.counter.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.counterText.setText(integer + "");
            }
        });
        */

    }
}