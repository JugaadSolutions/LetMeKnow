package com.ideonics.letmeknow;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    TextView mainTextView1;
    TextView mainTextView2;
    Button mainButton1;
    Button mainButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Access the TextView defined in layout XML
        // and then set its text
        mainTextView1 = (TextView) findViewById(R.id.main_textview1);
                mainTextView1.setText("select one of these to set a reminder");

        // 2. Access the Button defined in layout XML
        // and listen for it here
        mainButton1 = (Button) findViewById(R.id.main_button1);
        mainButton1.setOnClickListener(this);

        // 3. Access the Button defined in layout XML
        // and listen for it here
        mainButton2 = (Button) findViewById(R.id.main_button2);
        mainButton2.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public void onClick(View v) {
        // Test the Button
        mainTextView2 = (TextView) findViewById(R.id.main_textview2);
        mainTextView2.setText("Button pressed!");
    }
}
