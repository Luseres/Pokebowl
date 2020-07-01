package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MakeBowlFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_five);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.sesamedressing:
                if (checked)
                    // Sesame Dressing
                    break;
            case R.id.sweetchili:
                if (checked)
                    // Sweet Chili
                    break;
            case R.id.spicymayo:
                if (checked)
                    // Spicy Mayo
                    break;
            case R.id.wasabiaioli:
                if (checked)
                    // Wasabi Aioli
                    break;
        }
    }
}
