package com.example.ja010.projectweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

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

    }
}
