package com.example.infs3634assignment1v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("World Clock");

        Intent intent1 = getIntent();
        boolean city1 = intent1.getBooleanExtra("city1", true);
        boolean city2 = intent1.getBooleanExtra("city2", true);
        boolean city3 = intent1.getBooleanExtra("city3", true);
        boolean city4 = intent1.getBooleanExtra("city4", true);
        boolean city5 = intent1.getBooleanExtra("city5", true);


        if(city1 == false){
            ConstraintLayout city_time1 = findViewById(R.id.city_time1);
            city_time1.setVisibility(View.GONE);
        }
        if(city2 == false){
            ConstraintLayout city_time2 = findViewById(R.id.city_time2);
            city_time2.setVisibility(View.GONE);
        }
        if(city3 == false){
            ConstraintLayout city_time3 = findViewById(R.id.city_time3);
            city_time3.setVisibility(View.GONE);
        }
        if(city4 == false){
            ConstraintLayout city_time4 = findViewById(R.id.city_time4);
            city_time4.setVisibility(View.GONE);
        }
        if(city5 == false){
            ConstraintLayout city_time5 = findViewById(R.id.city_time5);
            city_time5.setVisibility(View.GONE);
        }


        ConstraintLayout city_time1 = findViewById(R.id.city_time1);
        TextView city_time1_name = city_time1.findViewById(R.id.textView);
        city_time1_name.setText("Sydney");
        TextClock city_time1_time = city_time1.findViewById(R.id.textClock);
        city_time1_time.setFormat12Hour("hh:mma         dd/MM");
        ImageView city_time1_image = city_time1.findViewById(R.id.imageView);
        city_time1_image.setImageResource(R.drawable.sydney_opera);

        ConstraintLayout city_time2 = findViewById(R.id.city_time2);
        TextView city_time2_name = city_time2.findViewById(R.id.textView);
        city_time2_name.setText("New York City");
        TextClock city_time2_time = city_time2.findViewById(R.id.textClock);
        city_time2_time.setTimeZone("GMT-04:00");
        city_time2_time.setFormat12Hour("hh:mma         dd/MM");
        ImageView city_time2_image = city_time2.findViewById(R.id.imageView);
        city_time2_image.setImageResource(R.drawable.nyc_liberty);

        ConstraintLayout city_time3 = findViewById(R.id.city_time3);
        TextView city_time3_name = city_time3.findViewById(R.id.textView);
        city_time3_name.setText("Beijing");
        TextClock city_time3_time = city_time3.findViewById(R.id.textClock);
        city_time3_time.setTimeZone("GMT+08:00");
        city_time3_time.setFormat12Hour("hh:mma         dd/MM");
        ImageView city_time3_image = city_time3.findViewById(R.id.imageView);
        city_time3_image.setImageResource(R.drawable.beijing_forbidden);

        ConstraintLayout city_time4 = findViewById(R.id.city_time4);
        TextView city_time4_name = city_time4.findViewById(R.id.textView);
        city_time4_name.setText("Paris");
        TextClock city_time4_time = city_time4.findViewById(R.id.textClock);
        city_time4_time.setTimeZone("GMT+02:00");
        city_time4_time.setFormat12Hour("hh:mma         dd/MM");
        ImageView city_time4_image = city_time4.findViewById(R.id.imageView);
        city_time4_image.setImageResource(R.drawable.paris_eiffel);

        ConstraintLayout city_time5 = findViewById(R.id.city_time5);
        TextView city_time5_name = city_time5.findViewById(R.id.textView);
        city_time5_name.setText("San Francisco");
        TextClock city_time5_time = city_time5.findViewById(R.id.textClock);
        city_time5_time.setTimeZone("GMT-07:00");
        city_time5_time.setFormat12Hour("hh:mma         dd/MM");
        ImageView city_time5_image = city_time5.findViewById(R.id.imageView);
        city_time5_image.setImageResource(R.drawable.san_francisco_golden);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.action_bar, menu);
        MenuItem settings = menu.findItem(R.id.flex);
        settings.setIcon(R.drawable.settings);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem button) {
        int id = button.getItemId();

        if (id == R.id.clock12_hours) {
            ConstraintLayout city_time_1 = findViewById(R.id.city_time1);
            TextClock city_time_1_time = city_time_1.findViewById(R.id.textClock);
            city_time_1_time.setFormat24Hour(null);
            city_time_1_time.setFormat12Hour("hh:mma         dd/MM");

            ConstraintLayout city_time_2 = findViewById(R.id.city_time2);
            TextClock city_time_2_time = city_time_2.findViewById(R.id.textClock);
            city_time_2_time.setFormat24Hour(null);
            city_time_2_time.setFormat12Hour("hh:mma         dd/MM");

            ConstraintLayout city_time_3 = findViewById(R.id.city_time3);
            TextClock city_time_3_time = city_time_3.findViewById(R.id.textClock);
            city_time_3_time.setFormat24Hour(null);
            city_time_3_time.setFormat12Hour("hh:mma         dd/MM");

            ConstraintLayout city_time_4 = findViewById(R.id.city_time4);
            TextClock city_time_4_time = city_time_4.findViewById(R.id.textClock);
            city_time_4_time.setFormat24Hour(null);
            city_time_4_time.setFormat12Hour("hh:mma         dd/MM");

            ConstraintLayout city_time_5 = findViewById(R.id.city_time5);
            TextClock city_time_5_time = city_time_5.findViewById(R.id.textClock);
            city_time_5_time.setFormat24Hour(null);
            city_time_5_time.setFormat12Hour("hh:mma         dd/MM");
        } else if (id == R.id.clock24_hours) {
            ConstraintLayout city_time1 = findViewById(R.id.city_time1);
            TextClock city_time1_time = city_time1.findViewById(R.id.textClock);
            city_time1_time.setFormat12Hour(null);
            city_time1_time.setFormat24Hour("HH:mm               dd/MM");

            ConstraintLayout city_time_2 = findViewById(R.id.city_time2);
            TextClock city_time_2_time = city_time_2.findViewById(R.id.textClock);
            city_time_2_time.setFormat12Hour(null);
            city_time_2_time.setFormat24Hour("HH:mm               dd/MM");

            ConstraintLayout city_time_3 = findViewById(R.id.city_time3);
            TextClock city_time_3_time = city_time_3.findViewById(R.id.textClock);
            city_time_3_time.setFormat12Hour(null);
            city_time_3_time.setFormat24Hour("HH:mm               dd/MM");

            ConstraintLayout city_time_4 = findViewById(R.id.city_time4);
            TextClock city_time_4_time = city_time_4.findViewById(R.id.textClock);
            city_time_4_time.setFormat12Hour(null);
            city_time_4_time.setFormat24Hour("HH:mm               dd/MM");

            ConstraintLayout city_time_5 = findViewById(R.id.city_time5);
            TextClock city_time_5_time = city_time_5.findViewById(R.id.textClock);
            city_time_5_time.setFormat12Hour(null);
            city_time_5_time.setFormat24Hour("HH:mm               dd/MM");
        } else if(id == R.id.flex){
            Intent intent1 = new Intent(getApplicationContext(),pageSettings.class);
            ConstraintLayout city_time1 = findViewById(R.id.city_time1);
            ConstraintLayout city_time2 = findViewById(R.id.city_time2);
            ConstraintLayout city_time3 = findViewById(R.id.city_time3);
            ConstraintLayout city_time4 = findViewById(R.id.city_time4);
            ConstraintLayout city_time5 = findViewById(R.id.city_time5);

            if(city_time1.getVisibility() != View.VISIBLE){
                intent1.putExtra("city1", false);
            }
            if(city_time2.getVisibility() != View.VISIBLE){
                intent1.putExtra("city2", false);
            }
            if(city_time3.getVisibility() != View.VISIBLE){
                intent1.putExtra("city3", false);
            }
            if(city_time4.getVisibility() != View.VISIBLE){
                intent1.putExtra("city4", false);
            }
            if(city_time5.getVisibility() != View.VISIBLE){
                intent1.putExtra("city5", false);
            }
            startActivity(intent1);
        }
        return super.onOptionsItemSelected(button);
    }
}
