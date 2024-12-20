package com.example.student_housing;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Res3Activity extends AppCompatActivity {
    private ImageView Home, Chartbox;
    private  ImageView Tour;
    private Button btn_Apply;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_res3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_Apply=findViewById(R.id.btn_Apply);
        btn_Apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Res3Activity.this, ApplyActivity.class);
                intent.putExtra("residencyName", "Boombox residence");
                intent.putExtra("residencyLocation", "Durban 275 Dr Yusuf Dadoo Street");
                intent.putExtra("Year_of_Study", "2024");
                startActivity(intent);

            }
        });
        Home=findViewById(R.id.Home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Res3Activity.this, HomeActivity.class));

            }
        });
        Chartbox=findViewById(R.id.Chartbox);
        Chartbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Res3Activity.this, ChatBotActivity.class));


            }
        });
        Tour=findViewById(R.id.Tour);
        Tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Res3Activity.this, VideoView2Activity.class));
            }
        });
    }
}