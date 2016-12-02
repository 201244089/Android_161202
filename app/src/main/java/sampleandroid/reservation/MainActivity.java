package sampleandroid.reservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView tv_1, tv_2;
    Chronometer chmeter;
    Button b_start, b_stop;
    RadioGroup rg;
    RadioButton r_cal, r_time;
    CalendarView calView;
    TimePicker Tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
