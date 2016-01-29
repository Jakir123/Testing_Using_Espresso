package com.rfsoftlab.jakir.testing_using_espresso;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etInputField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInputField= (EditText) findViewById(R.id.etInputField);

    }
    public void onClick(View view){

        switch (view.getId()){
            case R.id.btnChangeText:
                etInputField.setText(etInputField.getText().toString());
                break;
            case R.id.btnSwitchActivity:
                Intent gotoSecondActivity=new Intent(MainActivity.this,SecondActivity.class);
                gotoSecondActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                gotoSecondActivity.putExtra("input",etInputField.getText().toString());
                startActivity(gotoSecondActivity);
                break;
        }
    }

}
