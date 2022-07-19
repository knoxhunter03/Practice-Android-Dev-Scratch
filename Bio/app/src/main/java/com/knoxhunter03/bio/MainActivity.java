package com.knoxhunter03.bio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.knoxhunter03.bio.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private EditText enterHobbies;
    private TextView hobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        enterHobbies = findViewById(R.id.enter_hobbies);
//        hobbies = findViewById(R.id.hobbies_text);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addHobbies(view);
            }
        });

    }

    public void addHobbies(View view) {

        binding.hobbiesText.setText(String.format("Hobbies : %s", binding.enterHobbies.getText().toString().trim()));
        binding.invalidateAll(); 
        binding.hobbiesText.setVisibility(View.VISIBLE);

//        hobbies.setText(String.format("Hobbies : %s", enterHobbies.getText().toString().trim()));
//        hobbies.setVisibility(View.VISIBLE);

        // Hide keyboard

        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }

}