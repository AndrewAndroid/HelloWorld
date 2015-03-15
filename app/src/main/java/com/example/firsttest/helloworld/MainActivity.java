package com.example.firsttest.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnActTwo;

    private TextView mHelloTextView;
    private EditText mNameEditText;
    private ImageButton imageButton;
    private Button buttonHello;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHello = (Button) findViewById(R.id.buttonHello);
        mHelloTextView = (TextView) findViewById(R.id.textView);
        mNameEditText = (EditText) findViewById(R.id.editText);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);


        btnActTwo.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        buttonHello.setOnClickListener(this);

      }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, DisplayActivity.class);
                startActivity(intent);
                break;

            case R.id.imageButton:

                 break;
            case R.id.buttonHello:

                if (mNameEditText.getText().length() == 0) {
                    mHelloTextView.setText("Hello Kitty!");
                } else {
                    mHelloTextView.setText("Привет, " + mNameEditText.getText());

                }

                break;

            default:
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






