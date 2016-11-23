package com.bit2016.widget02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId) {
                    case R.id.radio_male: {
                        TextView textView = (TextView) findViewById(R.id.radioChecker);
                        textView.setText("남자");
                        break;
                    }
                    case R.id.radio_female: {
                        TextView textView = (TextView) findViewById(R.id.radioChecker);
                        textView.setText("여자");
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        });

        findViewById(R.id.checkbox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((CheckBox)view).isChecked();
                TextView textView = (TextView)findViewById(R.id.checkboxChecker);
                textView.setText(checked ? "checked" : "unchecked");
            }
        });

        findViewById(R.id.toggleButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checked = ((ToggleButton)view).isChecked();
                TextView textView = (TextView)findViewById(R.id.toggleButtonChecker);
                textView.setText(checked ? "On" : "Off");
            }
        });
    }
}
