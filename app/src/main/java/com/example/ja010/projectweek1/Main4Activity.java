package com.example.ja010.projectweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button b1;
    EditText e1,e2,e3;
    TextView t1,t2;
    CheckBox c1;
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
        c1 = (CheckBox)findViewById(R.id.checkBox);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int piz_co;
                int sp_co;
                int sl_co;
                if(e1 != null){
                    String piz = e1.getText().toString();
                   piz_co = Integer.parseInt(piz);
                }
                else{
                    piz_co =0;
                }
                if(e2 != null){
                    String sp = e2.getText().toString();
                    sp_co = Integer.parseInt(sp);
                }
                else{
                     sp_co =0;
                }
                if(e3 != null){
                    String sl = e3.getText().toString();
                    sl_co =Integer.parseInt(sl);
                }
                else{
                    sl_co =0;
                }


                int result1 = piz_co+sp_co+sl_co;

                double result2;
                if(c1.isChecked()){
                   result2 = (piz_co*15000+sp_co*13000+sl_co*9000)*0.9;
                }
                else{

                    result2 = (piz_co*15000+sp_co*13000+sl_co*9000);
                }


                //Toast.makeText(getApplicationContext(),""+v,Toast.LENGTH_LONG).show();

                t1.setText(result1+"개");
                t2.setText(result2+"원");


            }
        });

    }

}
