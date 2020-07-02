package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MakeBowlFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_five);

        ImageView backBtn = (ImageView) findViewById(R.id.imageView32);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlFive.this, MakeBowlFour.class));
            }
        });

        TextView nextBtn = (TextView) findViewById(R.id.textView52);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlFive.this, MakeBowlSix.class));
            }
        });
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
