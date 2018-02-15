package com.example.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText t = (EditText) findViewById(R.id.editText);
        EditText t2 = (EditText) findViewById(R.id.editText2);
        EditText result = (EditText) findViewById(R.id.editText3);
        EditText t3 = (EditText) findViewById(R.id.editText4);
        EditText t4 = (EditText) findViewById(R.id.editText5);
        int a,b,c,d,average;
        try{
            a=Integer.parseInt(t.getText().toString());
            b=Integer.parseInt(t2.getText().toString());
            c=Integer.parseInt(t3.getText().toString());
            d = Integer.parseInt(t4.getText().toString());
            average = (a+b+c+d)/4;
            result.setText(Integer.toString(average));

        }
        catch (Exception e){
            result.setText("Ошибка");
        }
    }
}
