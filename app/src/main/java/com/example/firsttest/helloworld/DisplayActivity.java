package com.example.firsttest.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnActThr;

    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView1);

        btnActThr = (Button) findViewById(R.id.btnActThr);
        btnActThr.setOnClickListener(this);
        Button redButton = (Button) findViewById(R.id.buttonRed);
        redButton.setOnClickListener(this);
        Button yellowButton = (Button) findViewById(R.id.buttonYellow);
        yellowButton.setOnClickListener(this);
        Button greenButton = (Button) findViewById(R.id.buttonGreen);
        greenButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActThr:
                Intent intent = new Intent(this, ActivityThree.class);
                startActivity(intent);
                break;


            case R.id.buttonGreen:
                mInfoTextView.setText(R.string.green);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
                break;


            case R.id.buttonRed:
                mInfoTextView.setText(R.string.red);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
                break;


            case R.id.buttonYellow:
                mInfoTextView.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
                break;


        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}




