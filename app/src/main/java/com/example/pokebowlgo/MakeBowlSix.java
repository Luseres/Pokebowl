package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MakeBowlSix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_six);


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.pineapple:
                if (checked)
                    // Pineapple
                    break;
            case R.id.tamago:
                if (checked)
                    // Tamago
                    break;
            case R.id.corn:
                if (checked)
                    // Tamago
                    break;
            case R.id.sesameseed:
                if (checked)
                    // Tamago
                    break;
        }
    }
}
