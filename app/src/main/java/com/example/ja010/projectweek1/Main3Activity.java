package com.example.ja010.projectweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("온도 변환기");
        Weacal();
    }
    void Weacal(){
        b1 = (Button)findViewById(R.id.button3);
        b2 = (Button)findViewById(R.id.button4);
        e1 = (EditText)findViewById(R.id.editText3);
        e2 = (EditText)findViewById(R.id.editText4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Cdegree = e1.getText().toString();
                Double FCdegree = Double.parseDouble(Cdegree)*1.8+32;

                Toast.makeText(getApplicationContext(),String.format("화씨온도는 %.1f도 입니다.",FCdegree),Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Fdegree = e2.getText().toString();
                Double CFdegree = (Double.parseDouble(Fdegree)-32)/1.8;
                Toast.makeText(getApplicationContext(),String.format("섭씨온도는 %.1f도 입니다.",CFdegree),Toast.LENGTH_SHORT).show();
            }
        });
    }


}
