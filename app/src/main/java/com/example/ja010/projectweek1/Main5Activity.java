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
        setTitle("계산기");
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
                int num1 = 0;
                int num2 = 0;
                String st_num1 = e1.getText().toString();
                String st_num2 = e2.getText().toString();
                boolean a = false;
                boolean b = false;
                if (st_num1.getBytes().length == 0) {
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();

                } else if (st_num2.getBytes().length == 0) {
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Integer.parseInt(st_num1);
                    num2 = Integer.parseInt(st_num2);
                    a = true;
                    b = true;
                }
                int result = num1 +num2;
                if(a == true && b == true ){
                    Toast.makeText(getApplicationContext(),"더하기 계산 결과는 "+result+"입니다.",Toast.LENGTH_SHORT).show();

                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0;
                int num2 = 0;
                boolean a = false;
                boolean b = false;
                String st_num1 = e1.getText().toString();
                String st_num2 = e2.getText().toString();
                if (st_num1.getBytes().length == 0) {
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();

                } else if (st_num2.getBytes().length == 0) {
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Integer.parseInt(st_num1);
                    num2 = Integer.parseInt(st_num2);
                    a = true ;
                    b = true;
                }
                int result = num1 - num2;
                if(a == true && b == true ){
                Toast.makeText(getApplicationContext(),"빼기 계산 결과는 "+result+"입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=0;
                int num2=0;
                boolean a = false;
                boolean b = false;
                String st_num1 = e1.getText().toString();
                String st_num2 = e2.getText().toString();
                if(st_num1.getBytes().length ==0){
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else if(st_num2.getBytes().length ==0){
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }
                else{
                    num1 = Integer.parseInt(st_num1);
                    num2 = Integer.parseInt(st_num2);
                    a = true;
                    b = true;
                }
                int result = num1*num2;

                if(a == true && b == true ){
                    Toast.makeText(getApplicationContext(),"빼기 계산 결과는 "+result+"입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = 0;
                int num2 = 0;
                boolean a= false;
                boolean b = false;
                String st_num1 = e1.getText().toString();
                String st_num2 = e2.getText().toString();
                if (st_num2.equals("0")){
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else if (st_num1.getBytes().length == 0) {
                    e1.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if (st_num2.getBytes().length == 0) {
                    e2.requestFocus();
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                }

                else {
                    num1 = Integer.parseInt(st_num1);
                    num2 = Integer.parseInt(st_num2);
                    a = true;
                    b = true;
                }
                float result = (num1 /num2);
                if (Float.isInfinite(result)){
                    result =0;
                }
                else if(Float.isNaN(result)){
                    result = 0;
                }

                Toast.makeText(getApplicationContext(),"나누기 계산 결과는 "+(int)result+"입니다.",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
