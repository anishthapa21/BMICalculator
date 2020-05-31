package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText et1,et2;
private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= findViewById(R.id.et_weight);
        et2= findViewById(R.id.et_height);
        tv_result= findViewById(R.id.tv_result);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmi();
            }
        });

    }

    @SuppressLint("SetTextI18n")
    private void bmi (){
        float a,b,c;
        a=Float.parseFloat(et2.getText().toString())/100;
        b=Float.parseFloat(et1.getText().toString());
        c=b/(a*a);
        tv_result.setText(""+c);

        if (c<=18.5){
            Toast.makeText(getApplicationContext(),"You are UnderWeight",Toast.LENGTH_SHORT).show();
        }
        if ((c>=18.5) && (c<24.9)){
            Toast.makeText(getApplicationContext(),"You are Normal",Toast.LENGTH_SHORT).show();
        }
        if ((c>25)||(c>29.9)){
            Toast.makeText(getApplicationContext(),"You are OverWeight",Toast.LENGTH_SHORT).show();
        }

    }


}
