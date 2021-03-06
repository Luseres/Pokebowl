package com.example.pokebowlgo;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

public class SelectedIngredients extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_ingredients);

        ImageView backBtn = (ImageView) findViewById(R.id.imageView12);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectedIngredients.this, MakeBowlSix.class));
            }
        });

        Button nextBtn = (Button) findViewById(R.id.button5);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectedIngredients.this, AddressForm.class));
            }
        });
    }
}