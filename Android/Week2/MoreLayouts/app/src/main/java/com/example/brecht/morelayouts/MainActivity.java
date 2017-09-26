package com.example.brecht.morelayouts;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirstFragment firstFragment = new FirstFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.topLayout,firstFragment,firstFragment.getTag()).commit();

        SecondFragment secondFragment = new SecondFragment();
        manager.beginTransaction().replace(R.id.bottomLayout,secondFragment,secondFragment.getTag()).commit();
    }
}
