package com.intelligrape.androidgitdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * <p/>
 * Project: <b>android-git-demo</b><br/>
 * Created by: Akhilesh Dhar Dubey on 27/6/15.<br/>
 * Email id: 2akhileshdubey@gmail.com<br/>
 * Skype id: akhileshdubey91
 * <p/>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button_screen5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Screen5_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.screen1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen1.class));
            }
        });

        findViewById(R.id.button_screen2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Screen2.class));
            }
        });

        findViewById(R.id.button_screen3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Screen3Activity.class));
            }
        });

        Button buttonScreen4 = (Button) findViewById(R.id.button_screen4);
        buttonScreen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen4.class));
            }
        });

    }
}
