package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button ADD, SUB, MUL, DIV;
    TextView result, history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.editText1);
        num2 = findViewById(R.id.editText2);
        ADD = findViewById(R.id.btnAdd);
        SUB = findViewById(R.id.btnSub);
        MUL = findViewById(R.id.btnMul);
        DIV = findViewById(R.id.btnDiv);
        result = findViewById(R.id.textView2);



        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op= "+";
                Float Num1 = Float.parseFloat(num1.getText().toString());
                Float Num2 = Float.parseFloat(num2.getText().toString());

                Float num3 = Num1 + Num2;
                result.setText( Num1 + " " + op + "" + Num2 + "" + " =" +num3.toString());


            }
        });

        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op= "-";
                Float Num1 = Float.parseFloat(num1.getText().toString());
                Float Num2 = Float.parseFloat(num2.getText().toString());

                Float num3 = Num1 - Num2;
                result.setText( Num1 + " " + op + "" + Num2 + "" + " =" +num3.toString());

            }
        });

        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op= "*";
                Float Num1 = Float.parseFloat(num1.getText().toString());
                Float Num2 = Float.parseFloat(num2.getText().toString());

                Float num3 = Num1 * Num2;
                result.setText( Num1 + " " + op + "" + Num2 + "" + " =" +num3.toString());
            }
        });

        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String op= "/";
                Float Num1 = Float.parseFloat(num1.getText().toString());
                Float Num2 = Float.parseFloat(num2.getText().toString());
                if (Num2 != 0) {
                    Float num3 = Num1 / Num2;
                    result.setText( Num1 + " " + op + "" + Num2 + "" + " =" +num3.toString());
                }
                else
                    result.setText("UNDEFINED");

            }
        });



    }



}