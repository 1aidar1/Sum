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
        EditText t3 = (EditText) findViewById(R.id.editText3);
        int a,b,c;
        try{
            a=Integer.parseInt(t.getText().toString());
            b=Integer.parseInt(t2.getText().toString());
            c=a+b;
            t3.setText(Integer.toString(c));

        }
        catch (Exception e){
            t3.setText("Ошибка");
        }
    }
}
