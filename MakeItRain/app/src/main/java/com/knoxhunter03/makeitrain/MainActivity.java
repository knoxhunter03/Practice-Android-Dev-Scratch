package com.knoxhunter03.makeitrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button makeItRain;
    private Button showInfo;
    private TextView moneyValue;
    private TextView congratsText;

    int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_layout);

        makeItRain = findViewById(R.id.buttonMakeItRain);
        showInfo = findViewById(R.id.buttonShowInfo);
        moneyValue = findViewById(R.id.moneyValue);
        congratsText = findViewById(R.id.textView3);
        // makeItRain.setOnClickListener(view -> Log.d("Main_Activity", "onClick: Make It Rain!"));


    }

    public void showMoney(View view) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        switch (moneyCounter){

            case 20000:
            moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this,
                    R.color.white));
            break;
            // congratsText.setText("Congratulations!");

            case 30000:
            moneyValue.setTextColor(Color.GREEN);
            break;

            case 40000:
                moneyValue.setTextColor(Color.LTGRAY);
                break;


        }
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));


            // Log.d("Main_Activity", "onCreate: Make It Rain! " + moneyCounter);
    }

    public void showInfo(View view){
        // Toast.makeText(MainActivity.this, R.string.app_info, Toast.LENGTH_SHORT).show();

        Snackbar.make(moneyValue, R.string.app_info, Snackbar.LENGTH_LONG)
                .setAction("More", view1 -> {
                    Log.d("Snack", "showInfo: SnackBar");
                })
                .show();
    }
}