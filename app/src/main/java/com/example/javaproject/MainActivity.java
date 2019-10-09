package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String m;
    int mCountPenguin = 0;
    int mCountParrot = 0;
    TextView myTextPenguin;
    TextView myTextParrot;
    Button myButtonPenguin;
    Button myButtonParrot;
    Button myButtonTransition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButtonPenguin = findViewById(R.id.buttonPenguin);
        myButtonParrot = findViewById(R.id.buttonParrot);
        myTextPenguin = findViewById(R.id.mytextPenguin);
        myTextParrot  = findViewById(R.id.mytextParrot);
        myButtonTransition = findViewById(R.id.ButtonTransition);

        myButtonPenguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextPenguin.setText("Я насчитал " + ++mCountPenguin + " пингвинов");
            }
        });
        myButtonParrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextParrot.setText("Я насчитал " + ++mCountParrot + " пингвинов");
            }
        });


        myButtonTransition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Birds birds = new Birds();
                birds.setBirdsOne(mCountPenguin);
                birds.setBirdsTwo(mCountParrot);
                Intent intent = new Intent(MainActivity.this, Birds.class);
                startActivity(intent);
            }
        });
    }
}
