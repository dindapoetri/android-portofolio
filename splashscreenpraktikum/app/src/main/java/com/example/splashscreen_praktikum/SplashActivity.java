package com.example.splashscreen_praktikum;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logoImage = findViewById(R.id.logoImage);

        // Pilih logo sesuai mahasiswa
        logoImage.setImageResource(R.drawable.hourglass);

        // Tunggu 10 detik lalu pindah ke MainActivity
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 10000); // 10 detik
    }
}
