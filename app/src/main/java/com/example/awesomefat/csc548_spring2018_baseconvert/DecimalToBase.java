package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalToBase extends AppCompatActivity
{

    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_to_base);

        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.answerTV = (TextView)this.findViewById(R.id.answerTV);
    }

    public void base2ButtonPressed(View v)
    {
        String sValue = this.inputET.getText().toString();
        int iValue = Integer.parseInt(sValue);
        String result = "";
        while(iValue>0)
        {
            int modValue = 0;
            modValue = iValue%2;
            iValue = iValue/2;
            result = modValue + result;
        }
        this.answerTV.setText("Base 2: " + result);
    }

    public void base8ButtonPressed(View v)
    {
        String sValue = this.inputET.getText().toString();
        int iValue = Integer.parseInt(sValue);
        String result = "";
        while(iValue>0)
        {
            int modValue = 0;
            modValue = iValue%8;
            iValue = iValue/8;
            result = modValue + result;
        }
        this.answerTV.setText("Base 8: " + result);
    }

    public void base10ButtonPressed(View v)
    {
        String sValue = this.inputET.getText().toString();
        int iValue = Integer.parseInt(sValue);
        String result = "";
        while(iValue>0)
        {
            int modValue = 0;
            modValue = iValue%10;
            iValue = iValue/10;
            result = modValue + result;
        }
        this.answerTV.setText("Base 10: " + result);
    }

    public void base16ButtonPressed(View v)
    {
        String sValue = this.inputET.getText().toString();
        int iValue = Integer.parseInt(sValue);
        String result = "";
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};
        while(iValue>0)
        {
            int modValue = 0;
            modValue = iValue%16;
            iValue = iValue/16;
            if(modValue>9){
                result = charArray[modValue - 10] + result;
            } else {
                result = modValue + result;
            }
        }
        this.answerTV.setText("Base 16: " + result);
    }
}
