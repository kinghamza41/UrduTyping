package com.example.UrduTyping;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.tview1);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"Jameel.ttf");
        textView.setTypeface(typeface);
    }
}
