package com.intelligrape.androidgitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * MainActivity of the class
 */
public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        final GifMovieView gif = (GifMovieView) findViewById(R.id.gif);
        final TextView textViewHeading = (TextView) findViewById(R.id.text_view_heading);
        final Button buttonGif = (Button) findViewById(R.id.button_gif);
        buttonGif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewHeading.setVisibility(View.GONE);
                buttonGif.setVisibility(View.GONE);
                gif.setMovieResource(R.raw.android);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //Himanshu
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
