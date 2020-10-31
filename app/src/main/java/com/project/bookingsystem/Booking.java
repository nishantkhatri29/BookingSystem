package com.project.bookingsystem;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Booking extends AppCompatActivity {
    final Calendar mycalendar = Calendar.getInstance();
    int hour = mycalendar.get(Calendar.HOUR_OF_DAY);
    int minute = mycalendar.get(Calendar.MINUTE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
    }
    public void getDate(View view){
        new DatePickerDialog(this,date,mycalendar.get(Calendar.YEAR),mycalendar.get(Calendar.MONTH),mycalendar.get(Calendar.DAY_OF_MONTH)).show();
//        TimePickerDialog timePickerDialog = new TimePickerDialog(Booking.this, new TimePickerDialog.OnTimeSetListener() {
//            @Override
//            public void onTimeSet(TimePicker timePicker, int hour, int minute) {
////                EditText editText5= findViewById(R.id.editText5);
////                editText5.setText(hour+":"+minute);
//            }
//        }, hour, minute, false);
//        timePickerDialog.show();
    }
    public void getLocation(View view){
        Spinner spinner= findViewById(R.id.spinner);
        String string= String.valueOf(spinner.getSelectedItem());
    }

    public void getTime(View view){
        new TimePickerDialog(this,time,mycalendar.get(Calendar.HOUR_OF_DAY),mycalendar.get(Calendar.MINUTE), false).show();

    }
    TimePickerDialog.OnTimeSetListener time= new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int hour, int minute) {
            EditText editText5= findViewById(R.id.editText5);
//            String timeFormat ="HH:MM";
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timeFormat,Locale.ENGLISH);
            editText5.setText(hour+":"+minute);


        }
    };
    DatePickerDialog.OnDateSetListener date= new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int dateofMonth) {
            EditText editText= findViewById(R.id.editText3);
            mycalendar.set(year, month, dateofMonth);
            String dateFormat= "dd/MM/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat,Locale.ENGLISH);
            editText.setText(simpleDateFormat.format(mycalendar.getTime()));
        }
    };




}
