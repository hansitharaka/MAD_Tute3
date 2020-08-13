package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    public static final String INPUT_1 = "com.example.intentsproj.INPUT1";
    public static final String INPUT_2 = "com.example.intentsproj.INPUT2";
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editText1 = (EditText)findViewById(R.id.num1_in);
        editText2 = (EditText)findViewById(R.id.num2_in);

        final Button btnOk = findViewById(R.id.btn_Ok);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input1 = editText1.getText().toString();
                String input2 = editText2.getText().toString();

                //send multiple data using a bundle
                /*Bundle bundle = new Bundle();
                bundle.putString("in1", input1);
                bundle.putString("in2", input2);*/

                Intent myIntent = new Intent(FirstActivity.this, SecondActivity.class);
                //myIntent.putExtras(bundle);    //use this if you do it with a bundle
                myIntent.putExtra(INPUT_1, input1);
                myIntent.putExtra(INPUT_2, input2);
                startActivity(myIntent);

                //Toast
                Context context = getApplicationContext();
                CharSequence message = "Sending message...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

            }
        });

    }

   /* public void sendOkMessage(View view) {

    }*/

}