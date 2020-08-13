package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button btnAdd, btnSub, btnMul, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText1 = (EditText)findViewById(R.id.input1);
        editText2 = (EditText)findViewById(R.id.input2);
        btnAdd = (Button)findViewById(R.id.btn_Add);
        btnSub = (Button)findViewById(R.id.btn_Sub);
        btnMul = (Button)findViewById(R.id.btn_Mul);
        btnDiv = (Button)findViewById(R.id.btn_Div);

        Intent intent = getIntent();
        String input1 = intent.getStringExtra(FirstActivity.INPUT_1);
        String input2 = intent.getStringExtra(FirstActivity.INPUT_2);

        editText1.setText(input1);
        editText2.setText(input2);
    }
}