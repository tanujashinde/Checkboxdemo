package com.example.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView t1;
CheckBox c1,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView);
        c1=findViewById(R.id.androidCheckBox);
        c2=findViewById(R.id.javacheckBox);
        c3=findViewById(R.id.phpcheckBox);
        c4=findViewById(R.id.pythoncheckBox);
        c5=findViewById(R.id.unitycheckBox);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c5.setOnClickListener(this);
        c4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.androidCheckBox:
                if(c1.isChecked())

                    Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
                break;
            case R.id.javacheckBox:
                if(c2.isChecked())

                    Toast.makeText(this, "java", Toast.LENGTH_SHORT).show();
                break;
            case R.id.phpcheckBox:
                if(c3.isChecked())

                    Toast.makeText(this, "PHP", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pythoncheckBox:
                if(c4.isChecked())

                    Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show();
                break;
            case R.id.unitycheckBox:
                if(c5.isChecked())

                    Toast.makeText(this, "unity", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
