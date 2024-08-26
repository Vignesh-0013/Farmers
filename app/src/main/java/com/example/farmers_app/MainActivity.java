package com.example.farmers_app;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView1 = findViewById(R.id.cardView1); // Assuming you have a CardView with id cardView1
        cardView1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,buyactivity.class);
            startActivity(intent);
        });

        CardView cardView2 = findViewById(R.id.cardView2); // Assuming you have a CardView with id cardView2
        cardView1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,buyactivity.class);
            startActivity(intent);
        });
        // Repeat the above code for other card views if needed
    }
}
