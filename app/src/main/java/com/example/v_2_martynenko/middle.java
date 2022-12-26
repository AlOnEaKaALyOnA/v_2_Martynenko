package com.example.v_2_martynenko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class middle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_middle);
        ImageView logout = findViewById(R.id.logout);
        ImageView search = findViewById(R.id.search);
        Button buy = findViewById(R.id.buy_button);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(middle.this, authentaction.class);
                middle.this.startActivity(logout);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tosearch = new Intent(middle.this, com.example.v_2_martynenko.search.class);
                middle.this.startActivity(tosearch);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buy = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kinopoisk.ru/"));
                middle.this.startActivity(buy);
            }
        });
    }
}