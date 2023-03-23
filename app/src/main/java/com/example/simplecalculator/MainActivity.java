package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button plus, minus, times, divide;

    TextView result;
    double resultNumber;
    double zero;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.button);
        minus = findViewById(R.id.button2);
        times = findViewById(R.id.button3);
        divide = findViewById(R.id.button4);

        num1 = findViewById(R.id.editTextTextPersonName);
        num2 = findViewById(R.id.editTextTextPersonName2);

        result = findViewById(R.id.textView);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1.getText().toString().equals("") || num2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter Values for Operation", Toast.LENGTH_LONG).show();
                } else {

                    double a1 = Double.valueOf(num1.getText().toString());
                    double a2 = Double.valueOf(num2.getText().toString());
                    resultNumber = a1 + a2;
                    zero = 0;
                    result.setText(String.valueOf(a1 + " + " + a2 + " = " + resultNumber));
                    num1.setText(String.valueOf(resultNumber));
                    num2.setText(String.valueOf(zero));
                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1.getText().toString().equals("") || num2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter Values for Operation", Toast.LENGTH_LONG).show();
                } else {

                    double a1 = Double.valueOf(num1.getText().toString());
                    double a2 = Double.valueOf(num2.getText().toString());
                    resultNumber = a1 - a2;
                    zero = 0;
                    result.setText(String.valueOf(a1 + " - " + a2 + " = " + resultNumber));
                    num1.setText(String.valueOf(resultNumber));
                    num2.setText(String.valueOf(zero));
                }
            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1.getText().toString().equals("") || num2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter Values for Operation", Toast.LENGTH_LONG).show();
                } else {

                    double a1 = Double.valueOf(num1.getText().toString());
                    double a2 = Double.valueOf(num2.getText().toString());
                    resultNumber = a1 * a2;
                    zero = 0;
                    result.setText(String.valueOf(a1 + " * " + a2 + " = " + resultNumber));
                    num1.setText(String.valueOf(resultNumber));
                    num2.setText(String.valueOf(zero));
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1.getText().toString().equals("") || num2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Enter Values for Operation", Toast.LENGTH_LONG).show();
                } else {

                    double a1 = Double.valueOf(num1.getText().toString());
                    double a2 = Double.valueOf(num2.getText().toString());
                    resultNumber = a1 / a2;
                    zero = 0;
                    result.setText(String.valueOf(a1 + " / " + a2 + " = " + resultNumber));
                    num1.setText(String.valueOf(resultNumber));
                    num2.setText(String.valueOf(zero));
                }
            }
        });




    }
}