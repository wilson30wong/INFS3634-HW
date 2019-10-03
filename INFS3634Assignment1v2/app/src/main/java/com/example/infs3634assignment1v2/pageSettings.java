package com.example.infs3634assignment1v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class pageSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);

        getSupportActionBar().setTitle("World Clock");

        Intent intent1 = getIntent();
        boolean city1 = intent1.getBooleanExtra("city1", true);
        boolean city2 = intent1.getBooleanExtra("city2", true);
        boolean city3 = intent1.getBooleanExtra("city3", true);
        boolean city4 = intent1.getBooleanExtra("city4", true);
        boolean city5 = intent1.getBooleanExtra("city5", true);

        ConstraintLayout city_settings1 = findViewById(R.id.city_settings1);
        TextView city_settings1_name = city_settings1.findViewById(R.id.textView);
        city_settings1_name.setText("Sydney");
        Switch city_settings1_switch = city_settings1.findViewById(R.id.switch1);
        city_settings1_switch.setChecked(city1);

        ConstraintLayout city_settings2 = findViewById(R.id.city_settings2);
        TextView city_settings2_name = city_settings2.findViewById(R.id.textView);
        city_settings2_name.setText("New York City");
        Switch city_settings2_switch = city_settings2.findViewById(R.id.switch1);
        city_settings2_switch.setChecked(city2);

        ConstraintLayout city_settings3 = findViewById(R.id.city_settings3);
        TextView city_settings3_name = city_settings3.findViewById(R.id.textView);
        city_settings3_name.setText("Beijing");
        Switch city_settings3_switch = city_settings3.findViewById(R.id.switch1);
        city_settings3_switch.setChecked(city3);

        ConstraintLayout city_settings4 = findViewById(R.id.city_settings4);
        TextView city_settings4_name = city_settings4.findViewById(R.id.textView);
        city_settings4_name.setText("Paris");
        Switch city_settings4_switch = city_settings4.findViewById(R.id.switch1);
        city_settings4_switch.setChecked(city4);

        ConstraintLayout city_settings5 = findViewById(R.id.city_settings5);
        TextView city_settings5_name = city_settings5.findViewById(R.id.textView);
        city_settings5_name.setText("San Francisco");
        Switch city_settings5_switch = city_settings5.findViewById(R.id.switch1);
        city_settings5_switch.setChecked(city5);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.action_bar, menu);
        MenuItem home = menu.findItem(R.id.flex);
        home.setIcon(R.drawable.home);
        MenuItem clock12_hours = menu.findItem(R.id.clock12_hours);
        clock12_hours.setVisible(false);
        MenuItem clock24_hours = menu.findItem(R.id.clock24_hours);
        clock24_hours.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem button) {
        int id = button.getItemId();

        if(id == R.id.flex){
            ConstraintLayout city_settings1 = findViewById(R.id.city_settings1);
            Switch city_settings1_switch = city_settings1.findViewById(R.id.switch1);
            ConstraintLayout city_settings2 = findViewById(R.id.city_settings2);
            Switch city_settings2_switch = city_settings2.findViewById(R.id.switch1);
            ConstraintLayout city_settings3 = findViewById(R.id.city_settings3);
            Switch city_settings3_switch = city_settings3.findViewById(R.id.switch1);
            ConstraintLayout city_settings4 = findViewById(R.id.city_settings4);
            Switch city_settings4_switch = city_settings4.findViewById(R.id.switch1);
            ConstraintLayout city_settings5 = findViewById(R.id.city_settings5);
            Switch city_settings5_switch = city_settings5.findViewById(R.id.switch1);

            Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
            intent1.putExtra("city1", city_settings1_switch.isChecked());
            intent1.putExtra("city2", city_settings2_switch.isChecked());
            intent1.putExtra("city3", city_settings3_switch.isChecked());
            intent1.putExtra("city4", city_settings4_switch.isChecked());
            intent1.putExtra("city5", city_settings5_switch.isChecked());
            startActivity(intent1);
        }
        return super.onOptionsItemSelected(button);
    }
}
