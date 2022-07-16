package com.knoxhunter03.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button showButton; // Fetch the button first
    private TextView myName; // Fetch the text View also
    private EditText showMyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.button); // Locate the button from R.id.
        myName = findViewById(R.id.textView); // Locate the text View from R.id
        showMyName = findViewById(R.id.editTextName);

        showButton.setOnClickListener(new View.OnClickListener() {

           @Override
            public void onClick(View view) {

                String name = showMyName.getText().toString(); // Store the entered text into a string variable &
                // Make sure it's converted to String so that everything is in string
               if(name.isEmpty()){
                   myName.setText("Hello Boss!");
               }
               else {
                   myName.setText("Hello " + name);
               }

            }
        });



    }
}