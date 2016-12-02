package sampleandroid.reservation;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    int day, year, month;
    int hour,min;

    TextView tv1, tv2;
    Chronometer chmeter;
    Button b_start, b_stop;
    RadioGroup rg;
    RadioButton r_cal, r_time;
    CalendarView calView;
    TimePicker tP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1.findViewById(R.id.textView);
        tv2.findViewById(R.id.textView2);
        chmeter.findViewById(R.id.chronometer1);
        b_start.findViewById(R.id.b_start);
        b_stop.findViewById(R.id.b_stop);
        rg.findViewById(R.id.Radiogroup);
        r_cal.findViewById(R.id.r_calender);
        r_time.findViewById(R.id.r_time);
        calView.findViewById(R.id.calendarView2);
        tP.findViewById(R.id.timePicker2);

        b_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextColor(Color.RED);
                chmeter.start();
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(r_cal.isChecked()){
                    calView.setVisibility(View.VISIBLE);
                    tP.setVisibility(View.INVISIBLE);
                }
                if(r_time.isChecked()){
                    calView.setVisibility(View.INVISIBLE);
                    tP.setVisibility(View.VISIBLE);
                }
            }
        });

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year1, int month1, int day1) {
                year = year1;
                month = month1;
                day = day1;
            }
        });

        tP.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hour = hourOfDay;
                min = minute;

            }
        });


        b_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setTextColor(Color.BLACK);
                chmeter.stop();
                String str = year+"년"+month+"월"+day+"일"+hour+"시"+min+"분 예약됨.";
                tv2.setText(str);
            }
        });
    }
}
