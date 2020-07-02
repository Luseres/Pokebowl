package com.example.pokebowlgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MakeBowlFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_bowl_four);

        ImageView backBtn = (ImageView) findViewById(R.id.imageView25);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlFour.this, MakeBowlThree.class));
            }
        });

        TextView nextBtn = (TextView) findViewById(R.id.textView45);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MakeBowlFour.this, MakeBowlFive.class));
            }
        });
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
