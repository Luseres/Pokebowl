package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MakeBowlThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_three);

        ImageView backBtn = (ImageView) findViewById(R.id.imageView20);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlThree.this, MakeBowlTwo.class));
            }
        });

        TextView nextBtn = (TextView) findViewById(R.id.textView38);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlThree.this, MakeBowlFour.class));
            }
        });
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
