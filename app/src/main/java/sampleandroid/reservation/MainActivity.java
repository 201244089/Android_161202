package sampleandroid.reservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView tv2;
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

        tv2.findViewById(R.id.textView2);
        chmeter.findViewById(R.id.chronometer1);
        b_start.findViewById(R.id.b_start);
        b_stop.findViewById(R.id.b_stop);
        rg.findViewById(R.id.Radiogroup);
        r_cal.findViewById(R.id.r_calender);
        r_time.findViewById(R.id.r_time);
        calView.findViewById(R.id.calendarView2);
        tP.findViewById(R.id.timePicker2);


    }
}
