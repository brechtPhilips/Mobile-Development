package com.example.brecht.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView mToyListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToyListTextView = (TextView)findViewById(R.id.tv_toys_names);

        String [] toyNames = ToyBox.getToyNames();
         for(String toyName : toyNames){
             mToyListTextView.append(toyName + "\n\n\n");
         }
    }
}
