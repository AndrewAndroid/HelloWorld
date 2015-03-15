package com.example.firsttest.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static android.view.View.OnClickListener;

public class ActivityThree extends ActionBarActivity implements OnClickListener {

    private int mCount = 0;

    private Button mCrowsCounterButton;
    private TextView mInfoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.three);

             mInfoTextView = (TextView) findViewById (R.id.textView2);
             mCrowsCounterButton = (Button) findViewById(R.id.buttonСrowsCounter);
             mInfoTextView.setText (R.string.button2);
             mCrowsCounterButton.setOnClickListener(this);

    }

    @Override
    public void onClick (View view){
            switch (view.getId()) {
                case R.id.buttonСrowsCounter:
                          mCrowsCounterButton.setText("Я насчитал" + ++mCount + "ворон");
                    break;




            }


        }

}

