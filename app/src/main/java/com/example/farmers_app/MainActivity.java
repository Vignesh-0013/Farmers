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

        // Find the CardView by ID
        CardView cardView1 = findViewById(R.id.cardView1); // Assuming you have a CardView with id cardView1

        // Set OnClickListener for the CardView
        cardView1.setOnClickListener(v -> {
            // Create an Intent to navigate to HelloWorldActivity
            Intent intent = new Intent(MainActivity.this,buyactivity.class);
            startActivity(intent);
        });

        // Repeat the above code for other card views if needed
    }
}
