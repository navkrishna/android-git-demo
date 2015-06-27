package com.intelligrape.androidgitdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonScreen4 = (Button) findViewById(R.id.button_screen4);
        buttonScreen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Screen4.class));
            }
        });

    }
}
