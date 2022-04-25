package com.induk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add, sub, mul, div;
    EditText numOne, numTwo;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOne = findViewById(R.id.numOne);
        numTwo = findViewById(R.id.numTwo);

        textResult = findViewById(R.id.result);

        add = (Button) findViewById(R.id.addBtn);
        sub = (Button) findViewById(R.id.subBtn);
        mul = (Button) findViewById(R.id.mulBtn);
        div = (Button) findViewById(R.id.divBtn);

        add.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = numOne.getText().toString();
                num2 = numTwo.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+ result.toString());
                return  false;
            }
        });

        sub.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = numOne.getText().toString();
                num2 = numTwo.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+ result.toString());
                return  false;
            }
        });

        mul.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = numOne.getText().toString();
                num2 = numTwo.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+ result.toString());
                return  false;
            }
        });

        div.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = numOne.getText().toString();
                num2 = numTwo.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+ result.toString());
                return  false;
            }
        });
    }
}