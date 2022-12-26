package com.example.v_2_martynenko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(search.this, middle.class);
                search.this.startActivity(back);
            }
        });

        ImageView searchfilm = findViewById(R.id.searchfilms);
        searchfilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchfilms = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ivi.ru/series"));
                search.this.startActivity(searchfilms);
            }
        });
    }
}