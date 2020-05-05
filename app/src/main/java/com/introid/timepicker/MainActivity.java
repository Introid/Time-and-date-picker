package com.introid.timepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener , DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Button button= findViewById(R.id.Btn_time);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment timePicker= new TimePickerFragment();
                timePicker.show( getSupportFragmentManager(),"time Picker" );
            }
        } );

        Button btn_date= findViewById(R.id.Btn_date);
        btn_date.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker= new DatePickerFragment();
                datePicker.show( getSupportFragmentManager(),"date Picker" );
            }
        } );


    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int min) {
        TextView textView= findViewById( R.id.tv_time );
        textView.setText( "Hour: "+ hour + "minutes: "+ min );

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        TextView tv_date = findViewById( R.id.tv_date );
        tv_date.setText( "Year: "+ year + "Month:" + month + "Day: "+ day);

    }
}
