package com.example.metalllcore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, SecondActivity.class);
        ListView list = findViewById(R.id.list);
        list.setAdapter(new ArrayAdapter<>(this, R.layout.list_item, getResources().getStringArray(R.array.artistTrack)));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                intent.putExtra("key", ((TextView)itemClicked).getText() + " .html");
                startActivity(intent);
            }
        });
    }
}
