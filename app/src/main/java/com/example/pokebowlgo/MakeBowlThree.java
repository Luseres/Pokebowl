package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MakeBowlThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_three);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.chicken:
                if (checked)
                    // Chicken
                    break;
            case R.id.salmon:
                if (checked)
                    // Salmon
                    break;
            case R.id.tuna:
                if (checked)
                    // Tuna
                    break;
            case R.id.shrimp:
                if (checked)
                    // Shrimp
                    break;
        }
    }
}
