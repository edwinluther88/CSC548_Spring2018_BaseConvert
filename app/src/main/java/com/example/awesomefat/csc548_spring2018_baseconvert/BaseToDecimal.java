package com.example.awesomefat.csc548_spring2018_baseconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        if (!isValidNumber(2, sValue))
        {
            answerTV.setText("");
            Toast.makeText(BaseToDecimal.this, "Invalid input",
                    Toast.LENGTH_SHORT).show();
            return;
        }
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
        if (!isValidNumber(8, sValue))
        {
            answerTV.setText("");
            Toast.makeText(BaseToDecimal.this, "Invalid input",
                    Toast.LENGTH_SHORT).show();
            return;
        }
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
        if (!isValidNumber(10, sValue))
        {

            Toast.makeText(BaseToDecimal.this, "Invalid input",
                    Toast.LENGTH_SHORT).show();
            return;
        }
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
        if (!isValidNumber(16, sValue))
        {
            answerTV.setText("");
            Toast.makeText(BaseToDecimal.this, "Invalid input",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        for(int i=sValue.length()-1,j=0; i>=0; i--,j++)
        {
            int temp = 0;
            char ch  = sValue.charAt(i);

            if (ch >= '0' && ch <= '9')
            temp = (int)Math.pow(16, j) * (sValue.charAt(i) - 48);
            else if (ch >= 'A' && ch <= 'Z')
                temp = (int)Math.pow(16, j) * (sValue.charAt(i) - 'A' + 10);
            else if (ch >= 'a' && ch <= 'z')
                temp = (int)Math.pow(16, j) * (sValue.charAt(i) - 'a' + 10);

            result += temp;
        }
        this.answerTV.setText("Base 16: " + result);
    }

    private boolean isValidNumber(int base, String numStr)
    {
        int len = numStr.length();
        String digits1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits2 = "0123456789abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < len; i++)
        {
            char ch = numStr.charAt(i);

            if (!(ch >= '0' && ch <= '9') &&
                    !(ch >= 'A' && ch <= 'Z') &&
                    !(ch >= 'a' && ch <= 'z'))
            {
                return false;
            }
            if (digits1.indexOf(ch) != -1) {
                if (digits1.indexOf(ch) >= base)
                    return false;
            }
            else if (digits2.indexOf(ch) != -1)
            {
                if (digits2.indexOf(ch) >= base)
                    return false;
            }
        }
        return true;
    }
}
