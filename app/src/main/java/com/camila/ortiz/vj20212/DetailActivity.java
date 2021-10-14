package com.camila.ortiz.vj20212;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.camila.ortiz.vj20212.adapters.NameAdapter;

import java.util.Arrays;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.i("MAIN_APP", "Iniciando segunda actividad");

        /*Intent intent = getIntent();
        String value = intent.getStringExtra("value");

        TextView tv = findViewById(R.id.tvMessage);
        tv.setText(value);*/

        RecyclerView rv = findViewById(R.id.rvNames);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        List<String> datos = Arrays.asList("dato1","dato2","dato3");
        NameAdapter adapter = new NameAdapter(datos);

        rv.setAdapter(adapter);

    }
}