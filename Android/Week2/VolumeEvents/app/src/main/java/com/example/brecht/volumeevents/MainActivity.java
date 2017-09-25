package com.example.brecht.volumeevents;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar beltoon = (SeekBar) findViewById(R.id.beltoonBar);
        final SeekBar alarm  = (SeekBar) findViewById(R.id.alarmBar);
        final SeekBar media = (SeekBar) findViewById(R.id.mediaBar);
        final SeekBar meldingen = (SeekBar) findViewById(R.id.meldingBar);
        Button okButton = (Button) findViewById(R.id.okButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.mCheckBox);


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton checkBox, boolean ischecked) {
                if (ischecked){
                    meldingen.setProgress(beltoon.getProgress());
                }
                else {
                    meldingen.setProgress(0);
                }
            }
        });


        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                String text = String.format("Beltoon: %d\nAlarm: %d\nMedia: %d\nMeldingen: %d", beltoon.getProgress(),media.getProgress(),alarm.getProgress(),meldingen.getProgress());
                Toast.makeText(context, text  ,
                        Toast.LENGTH_LONG).show();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beltoon.setProgress(0);
                meldingen.setProgress(0);
                alarm.setProgress(0);
                media.setProgress(0);
                checkBox.setChecked(false);
            }
        });
    }
}
