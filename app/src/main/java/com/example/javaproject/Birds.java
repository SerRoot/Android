package com.example.javaproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class Birds extends AppCompatActivity{
    private int birdsOne, birdsTwo;

    public Birds(){}

    public Birds(int birdsOne, int birdsTwo) {
        this.birdsOne = birdsOne;
        this.birdsTwo = birdsTwo;
    }

    public int getBirdsOne() {
        return birdsOne;
    }

    public void setBirdsOne(int birdsOne) {
        this.birdsOne = birdsOne;
    }

    public int getBirdsTwo() {
        return birdsTwo;
    }

    public void setBirdsTwo(int birdsTwo) {
        this.birdsTwo = birdsTwo;
    }

    Button mybuttonParrotSpeak, mybuttonParrotFly, mybuttonParrotNotFly, mybuttonPenguinSpeak;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birds_about);

        mybuttonParrotSpeak = findViewById(R.id.buttonParrotSpeak);
        mybuttonParrotFly = findViewById(R.id.buttonParrotFly);
        mybuttonParrotNotFly = findViewById(R.id.buttonParrotNotFly);
        mybuttonPenguinSpeak = findViewById(R.id.buttonPenguinSpeak);


    }
    public void onClick(View v) {
/*        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("hello").toString();*/
        Toast toast = Toast.makeText(this,birdsOne,Toast.LENGTH_LONG);
        toast.show();
    }
    public void Crol(View view) {
        Toast toast = Toast.makeText(this,birdsTwo,Toast.LENGTH_LONG);
        toast.show();
    }

}