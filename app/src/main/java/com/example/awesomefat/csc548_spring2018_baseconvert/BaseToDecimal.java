package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BaseToDecimal extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_to_decimal);

        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.answerTV = (TextView)this.findViewById(R.id.answerTV);
    }

    public void base2ButtonPressed(View v)
    {
        int tempResult = 0;
        String sValue = this.inputET.getText().toString();
        for(int i=sValue.length()-1, j=0; i >= 0; i--,j++){
            int temp = 0;
            temp = (int)Math.pow(2,j) * (sValue.charAt(i) - 48);
            tempResult += temp;
        }
        this.answerTV.setText("Base 2:  " + tempResult);
    }

    public void base8ButtonPressed(View v)
    {
        String sValue = this.inputET.getText().toString();
        int result = 0;
        for(int i=sValue.length()-1,j=0; i>=0; i--,j++)
        {
            int temp = 0;
            temp = (int)Math.pow(8, j) * (sValue.charAt(i) - 48);
            result += temp;
        }
        this.answerTV.setText("Base 8: " + result);
    }

    public void base10ButtonPressed(View v)
    {
        String sValue = this.inputET.getText().toString();
        int result = 0;
        for(int i=sValue.length()-1,j=0; i>=0; i--,j++)
        {
            int temp = 0;
            temp = (int)Math.pow(10, j) * (sValue.charAt(i) - 48);
            result += temp;
        }
        this.answerTV.setText("Base 10: " + result);
    }

    public void base16ButtonPressed(View v)
    {
        String sValue = this.inputET.getText().toString();
        int result = 0;
        for(int i=sValue.length()-1,j=0; i>=0; i--,j++)
        {
            int temp = 0;
            temp = (int)Math.pow(16, j) * (sValue.charAt(i) - 48);
            result += temp;
        }
        this.answerTV.setText("Base 16: " + result);
    }
}
