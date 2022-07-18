package com.knoxhunter03.sumofdigits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numberValue;
    private Button addNumber;
    private TextView sumValue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberValue = findViewById(R.id.enterNumber);
        sumValue = findViewById(R.id.sumValue);
        addNumber = findViewById(R.id.buttonAdd);

        addNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // ***Do type casting and all inside the click method!****
                long number = Long.parseLong(numberValue.getText().toString());
                long sum = 0, rem;
                while(number > 0){
                    rem = number % 10;
                    sum = sum + rem;
                    number = number / 10;
                }

                // Log.d("Num", "onClick: " + number);
                sumValue.setText("Sum : " + sum);
            }
        });

    }


}