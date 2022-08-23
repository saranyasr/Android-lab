package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4;
    EditText t1, t2;
    TextView n3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        t1 = findViewById(R.id.n1);
        t2 = findViewById(R.id.n2);
        n3 = (TextView) findViewById(R.id.n3);



        }



    public void DIF(View view) {
        double num1=Double.parseDouble(t1.getText().toString());
        double num2=Double.parseDouble(t2.getText().toString());
        double Result=num1-num2;
        n3.setText(Double.toString(Result));
    }

    public void MUL(View view) {
        double num1=Double.parseDouble(t1.getText().toString());
        double num2=Double.parseDouble(t2.getText().toString());
        double Result=num1*num2;
        n3.setText(Double.toString(Result));
    }

    public void DIV(View view) {
        double num1=Double.parseDouble(t1.getText().toString());
        double num2=Double.parseDouble(t2.getText().toString());
        if(num2==0)
        {
            n3.setText("");
            Toast.makeText(this, "division by zero is not possible", Toast.LENGTH_LONG).show();
        }
        else{
            double Result=num1/num2;
            n3.setText(Double.toString(Result));
        }

}

    public void SUM(View view) {
        double num1=Double.parseDouble(t1.getText().toString());
        double num2=Double.parseDouble(t2.getText().toString());
        double Result=num1+num2;
        n3.setText(Double.toString(Result));
    }
}