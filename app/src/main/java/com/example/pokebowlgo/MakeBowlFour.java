package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MakeBowlFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_four);

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.cilantro:
                if (checked)
                    // Cilantro
                    break;
            case R.id.cucumber:
                if (checked)
                    // Cucumber
                    break;
            case R.id.jalapeno:
                if (checked)
                    // Jalapeno
                    break;
            case R.id.onion:
                if (checked)
                    // Onion
                    break;
        }
    }
}
