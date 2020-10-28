package com.project.bookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View view){
        EditText editText= findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        Button button = findViewById(R.id.button);
        String username= editText.getText().toString();
        String password= editText2.getText().toString();
        if(!(username.equals(password))){
            Toast.makeText(getApplicationContext(),"Credentials DO NOT Match",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Login successful!",Toast.LENGTH_SHORT).show();
        }


    }
}
