package com.example.mycalculatorapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button addButton, subButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        addButton = findViewById(R.id.addButton);
        subButton = findViewById(R.id.subButton);
        resultTextView = findViewById(R.id.resultTextView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = add(num1, num2);
                resultTextView.setText("Result: " + result);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(editText1.getText().toString());
                double num2 = Double.parseDouble(editText2.getText().toString());
                double result = subtract(num1, num2);
                resultTextView.setText("Result: " + result);
            }
        });
    }

    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double subtract(double num1, double num2) {
        return num1 - num2;
    }
}
