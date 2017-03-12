package com.example.ja010.projectweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        calculator();
    }
    void calculator(){
        b1 = (Button)findViewById(R.id.button6);
        b2 = (Button)findViewById(R.id.button7);
        b3 = (Button)findViewById(R.id.button8);
        b4 = (Button)findViewById(R.id.button9);
        e1 = (EditText)findViewById(R.id.editText8);
        e2 = (EditText)findViewById(R.id.editText9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=0;
                int num2=0;
                String st_num1 = e1.getText().toString();
                String st_num2 = e2.getText().toString();
                if(st_num1.getBytes().length ==0){
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else if(st_num1.getBytes().length !=0){
                    e2.requestFocus();
                    num1 = Integer.parseInt(st_num1);
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else if(st_num2.getBytes().length ==0){
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else{
                    num2 = Integer.parseInt(st_num2);
                }
                int result = num1+num2;
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0;
                int num2 = 0;
                String st_num1 = e1.getText().toString();
                String st_num2 = e2.getText().toString();
                if (st_num1.getBytes().length == 0) {
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if (st_num1.getBytes().length != 0) {
                    e2.requestFocus();
                    num1 = Integer.parseInt(st_num1);
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if (st_num2.getBytes().length == 0) {
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    num2 = Integer.parseInt(st_num2);
                }
                int result = num1 - num2;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=0;
                int num2=0;
                String st_num1 = e1.getText().toString();
                String st_num2 = e2.getText().toString();
                if(st_num1.getBytes().length ==0){
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else if(st_num1.getBytes().length !=0){
                    e2.requestFocus();
                    num1 = Integer.parseInt(st_num1);
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else if(st_num2.getBytes().length ==0){
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else{
                    num2 = Integer.parseInt(st_num2);
                }
                int result = num1+num2;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0;
                int num2 = 0;
                String st_num1 = e1.getText().toString();
                String st_num2 = e2.getText().toString();
                if (st_num1.getBytes().length == 0) {
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if (st_num1.getBytes().length != 0) {
                    e2.requestFocus();
                    num1 = Integer.parseInt(st_num1);
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if (st_num2.getBytes().length == 0) {
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    num2 = Integer.parseInt(st_num2);
                }
                int result = num1 + num2;
            }
        });
    }
}
