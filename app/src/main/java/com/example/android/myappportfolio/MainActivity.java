package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    // Button events
    public void spotifyM(View view){
        String message = "This button will show my Spotify app!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void readerM(View view){
        String message = "This button will show my XYZ Reader app!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void scoresM(View view){
        String message = "This button will show my Scores app!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void libraryM(View view){
        String message = "This button will show my Library app!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void biggerM(View view){
        String message = "This button will show my Built It Bigger app!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void capstoneM(View view){
        String message = "This button will show my Capstone app!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
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
