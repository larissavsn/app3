package com.example.app3.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.app3.R;
import com.example.app3.RecyclerItemClickListener;
import com.example.app3.adapter.AdapterApp3;
import com.example.app3.model.App3;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewApp3;
    private List<App3> listApp3 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewApp3 = findViewById(R.id.recyclerViewApp3);

        this.createTeam();
        AdapterApp3 adapter = new AdapterApp3(listApp3);

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerViewApp3.setLayoutManager(layoutManager);
        recyclerViewApp3.setHasFixedSize(true);

        recyclerViewApp3.addItemDecoration(
                new DividerItemDecoration(this, LinearLayout.VERTICAL));

        recyclerViewApp3.setAdapter(adapter);

        recyclerViewApp3.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerViewApp3,
                        new RecyclerItemClickListener.OnItemClickListener(){

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onItemClick(View view, int position) {
                                App3 obj = listApp3.get(position);
                                Intent it = new Intent (getApplicationContext(), DetailActivity.class);
                                it.putExtra("nome", obj.getName());
                                it.putExtra("hist", obj.getHistory());
                                it.putExtra("city", obj.getCityState());
                                it.putExtra("img", obj.getImg());
                                startActivity(it);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }
                        }
                )
        );
    }

        public void createTeam() {
            App3 obj = new App3(R.drawable.gremio, "Grêmio", "Porto Alegre/RS", "8 Títulos:\n\n2 Campeonatos Brasileiros\n\n5 Copas do Brasil \n\n1 Supercopa do Brasil ");
            listApp3.add(obj);
            obj = new App3(R.drawable.saopaulo, "São Paulo", "São Paulo/SP","6 Títulos:\n\n6 Campeonatos Brasileiros ");
            listApp3.add(obj);
            obj = new App3(R.drawable.corithians, "Corinthians","São Paulo/SP","11 Títulos: \n\n 7 Campeonatos Brasileiros\n\n3 Copas do Brasil \n\n1 Supercopa do Brasil");
            listApp3.add(obj);
            obj = new App3(R.drawable.flamengo, "Flamengo","Rio de Janeiro/RJ","11 Títulos:\n\n6 Campeonatos Brasileiros\n\n3 Copas do Brasil\n\n 1 Supercopa do Brasil\n\n 1 Copa dos Campeões ");
            listApp3.add(obj);
            obj = new App3(R.drawable.palmeiras, "Palmeiras", "São Paulo/SP","14 Títulos: \n\n10 Campeonatos Brasileiros\n\n3 Copas do Brasil\n\n1 Copa dos Campeões");
            listApp3.add(obj);
        }
    }
   // }