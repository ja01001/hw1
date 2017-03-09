package com.example.ja010.projectweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("레스토랑 메뉴 주문");
        totalsum();
    }
    void totalsum(){
        b1 = (Button)findViewById(R.id.button5);
        e1 = (EditText)findViewById(R.id.editText5);
        e2 = (EditText)findViewById(R.id.editText6);
        e3 = (EditText)findViewById(R.id.editText7);
        t1 = (TextView)findViewById(R.id.text3);
        t2 = (TextView)findViewById(R.id.text4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String piz = e1.getText().toString();
                String sp = e2.getText().toString();
                String sl = e3.getText().toString();
                int result = Integer.parseInt(piz)+Integer.parseInt(sp)+Integer.parseInt(sl);

            }
        });
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }
    }

}
