package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView value, txtV1, txtV2;
    String input1, input2;
    int num1, num2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        value = (TextView)findViewById(R.id.result);
        txtV1 = (TextView)findViewById(R.id.input1);
        txtV2 = (TextView)findViewById(R.id.input2);
        btnAdd = (Button)findViewById(R.id.btn_Add);
        btnSub = (Button)findViewById(R.id.btn_Sub);
        btnMul = (Button)findViewById(R.id.btn_Mul);
        btnDiv = (Button)findViewById(R.id.btn_Div);

        Intent intent = getIntent();
        txtV1.setText(intent.getStringExtra(FirstActivity.INPUT_1));
        txtV2.setText(intent.getStringExtra(FirstActivity.INPUT_2));

        //convert to integer
        //num1 = Integer.parseInt(txtV1.getText().toString());
        //num2 = Integer.parseInt(txtV2.getText().toString());
        //num2 = Integer.parseInt(input2.toString());
    }

    @Override
    public void onResume() {
        super.onResume();

        input1 = txtV1.getText().toString();
        input2 = txtV2.getText().toString();

        //Addition
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Float.parseFloat(input1) + Float.parseFloat(input2);
                String ans = input1 + " + " + input2 + " = " + result;
                value.setText(ans);
            }
        });

        //Subtraction
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Float.parseFloat(input1) - Float.parseFloat(input2);
                String ans = input1 + " - " + input2 + " = " + result;
                value.setText(ans);
            }
        });

        //Multiplication
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Float.parseFloat(input1) * Float.parseFloat(input2);
                String ans = input1 + " x " + input2 + " = " + result;
                value.setText(ans);
            }
        });

        //Division
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Float.parseFloat(input1) / Float.parseFloat(input2);
                String ans = input1 + " / " + input2 + " = " + result;
                value.setText(ans);
            }
        });
    }

}