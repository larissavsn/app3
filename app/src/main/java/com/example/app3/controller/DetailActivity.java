package com.example.app3.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app3.R;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private TextView name, historico, cityState;
    private ImageView img;
    private Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        extras = getIntent().getExtras();
        name = findViewById(R.id.textViewNameTeam);
        historico = findViewById(R.id.textViewHistorico);
        cityState = findViewById(R.id.textViewCity);
        img = findViewById(R.id.imageViewLogo);

        if (extras != null) {
            name.setText(extras.getString("nome"));
            historico.setText(extras.getString("hist"));
            cityState.setText(extras.getString("city"));
            img.setImageResource(extras.getInt("img"));
        }
    }
}