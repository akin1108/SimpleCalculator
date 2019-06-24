package com.akin.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalci extends AppCompatActivity {
TextView RESULT;
EditText Num1,Num2;
Button add,subtract,multiply,divide;
float result_num;
int number1,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calci);
        RESULT=(TextView)findViewById(R.id.RESULT);
        Num1=(EditText)findViewById(R.id.Num1);
        Num2=(EditText)findViewById(R.id.Num2);
        add=(Button)findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.subtract);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
            number1=Integer.parseInt(Num1.getText().toString());
            number2=Integer.parseInt(Num2.getText().toString());
            result_num=number1+number2;
            RESULT.setText(String.valueOf(result_num));}}
        );

            subtract.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){
                number1 = Integer.parseInt(Num1.getText().toString());
                number2 = Integer.parseInt(Num2.getText().toString());
                result_num = number1 - number2;
                RESULT.setText(String.valueOf(result_num));}
            });


                multiply.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v){

                                                number1=Integer.parseInt(Num1.getText().

                                                toString());
                                                number2=Integer.parseInt(Num2.getText().

                                                toString());
                                                result_num=number1*number2;
                    RESULT.setText(String.valueOf(result_num));}
                                            });

                    divide.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                        number1=Integer.parseInt(Num1.getText().toString());
                        number2=Integer.parseInt(Num2.getText().toString());
                        result_num=number1/number2;
                        RESULT.setText(String.valueOf(result_num));}});


        }
    }

