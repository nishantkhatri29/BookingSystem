package com.project.bookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Elective extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            EditText editText= findViewById(R.id.editText);
            EditText editText2= findViewById(R.id.editText3);
            final String detail1=editText.getText().toString();
            final String detail2=editText2.getText().toString();
            final String username="17CSU129";
            final String password="17CSU129";
            Toast.makeText(getApplicationContext(),"Debugging",Toast.LENGTH_LONG).show();
            Button button= findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if((detail1.equals(detail2))){
                        Toast.makeText(getApplicationContext(),"Working",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Not Working",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
    }
