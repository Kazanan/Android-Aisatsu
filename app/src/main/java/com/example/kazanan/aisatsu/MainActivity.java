package com.example.kazanan.aisatsu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configurePertemuanButton();
        configurePerpisahanButton();
        configureKabarButton();
        configureMaafButton();
        configureTerimaKasihButton();
        configureSelamatButton();
    }

    private void configurePertemuanButton() {
        ImageButton pertemuanButton = findViewById(R.id.imageButton3);
        pertemuanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PertemuanActivity.class));
            }
        });
    }

    private void configurePerpisahanButton() {
        ImageButton perpisahanButton = findViewById(R.id.imageButton);
        perpisahanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PerpisahanActivity.class));
            }
        });
    }

    private void configureKabarButton() {
        ImageButton kabarButton = findViewById(R.id.imageButton4);
        kabarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TanyaKabarActivity.class));
            }
        });
    }

    private void configureMaafButton() {
        ImageButton maafButton = findViewById(R.id.imageButdp);
        maafButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MaafActivity.class));
            }
        });
    }

    private void configureTerimaKasihButton() {
        ImageButton makasihButton = findViewById(R.id.imageButton2);
        makasihButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TerimaKasihActivity.class));
            }
        });
    }

    private void configureSelamatButton() {
        ImageButton selamatButton = findViewById(R.id.imageButton5);
        selamatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SelamatActivity.class));
            }
        });
    }
}
