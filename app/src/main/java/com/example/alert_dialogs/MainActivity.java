package com.example.alert_dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayDialog(View view) {
      new FireFragment().show(getSupportFragmentManager(),"missileDialog");
    }

    public void displayList(View view) {
        new MyDialog().show(getSupportFragmentManager(),"missile");
    }

    public void pickGrocery(View view) {
        new MyGroceryList().show(getSupportFragmentManager(),"grocerylist");
    }

    public void radio_Color(View view) {
        new MyRadioButton().show(getSupportFragmentManager(),"radioButoon");
    }

    public void click_login(View view) {
        new MyLoginPage().show(getSupportFragmentManager(),"LoginPage");
    }
}