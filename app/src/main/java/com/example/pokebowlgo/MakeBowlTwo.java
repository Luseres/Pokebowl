package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MakeBowlTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_two);

        ImageView backBtn = (ImageView) findViewById(R.id.imageView10);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlTwo.this, MakeBowlOne.class));
            }
        });

        TextView nextBtn = (TextView) findViewById(R.id.textView30);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlTwo.this, MakeBowlThree.class));
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.seaweed:
                if (checked)
                    // Seaweed
                    break;
            case R.id.avocado:
                if (checked)
                    // Avocado
                    break;
            case R.id.crab:
                if (checked)
                    // Crab
                    break;
            case R.id.edamame:
                if (checked)
                    // Edamame
                    break;
        }
    }
}
