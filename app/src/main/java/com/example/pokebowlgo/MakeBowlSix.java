package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MakeBowlSix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_six);

        ImageView backBtn = (ImageView) findViewById(R.id.imageView38);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlSix.this, MakeBowlFive.class));
            }
        });

        TextView nextBtn = (TextView) findViewById(R.id.textView59);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlSix.this, SelectedIngredients.class));
            }
        });
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
