package org.joshuavanderpoll.pokebowl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Start", "onCreate: started");

        try {
            int deler = 10/1;
        } catch (NumberFormatException e) {
            Log.e("Start", "onCreate: gekke deler is gecatched omdat hij niet werkt");
        }
    }
}
