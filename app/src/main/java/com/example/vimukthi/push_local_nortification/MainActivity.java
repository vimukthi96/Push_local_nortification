package com.example.vimukthi.push_local_nortification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Interpolator;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlarmManager alarmManager =(AlarmManager)getSystemService(ALARM_SERVICE);
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.SECOND,5);
        Intent intent=new Intent("");


        PendingIntent broadscast=PendingIntent.getBroadcast(this,100,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        alarmManager.setExact(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),broadscast);
    }
}
