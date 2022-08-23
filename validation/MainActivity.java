package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2, p1;
    RadioGroup t1;
    RadioButton r1, r2;
    CheckBox c1;
    Button b1;
    Switch s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        p1 = findViewById(R.id.p1);
        t1 = findViewById(R.id.rg1);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        c1 = findViewById(R.id.c1);
        b1 = findViewById(R.id.b1);
        s1 = findViewById(R.id.s1);
    }

    public void submit(View view) {




        String firstname,lastname;
        firstname=n1.getText().toString();
        lastname=n2.getText().toString();
        if(firstname.equals("")){
            Toast.makeText(this, "FIRST NAME IS EMPTY", Toast.LENGTH_SHORT).show();
        }
        else if (lastname.equals("")){
            Toast.makeText(this, "LASTNAME IS EMPTY", Toast.LENGTH_SHORT).show();
        }
        else if(!r1.isChecked() && !r2.isChecked()){
            Toast.makeText(this, "PLEASE CHOOSE THE GENDER", Toast.LENGTH_SHORT).show();
        }
        else if(p1.length()<3){
            Toast.makeText(this, "PASSWORD SHOULD CONTAIN ATLEAST 3 CHARECTERS", Toast.LENGTH_SHORT).show();
        }
        else if(!s1.isChecked()){
            Toast.makeText(this, "SWITCH ON TO NEW BAR !", Toast.LENGTH_SHORT).show();
        }
        else if(!c1.isChecked()){
            Toast.makeText(this, "AGREE THE TERMS AND CONDITIONS", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "REGISTRATION SUCCESS", Toast.LENGTH_SHORT).show();
        }

    }
}