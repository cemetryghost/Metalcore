package com.example.metalllcore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] artistTrack = { "Wildways — Breathless", "Wildways — Lost", "Architects — Giving Blood", "Architects — Animals", "Architects — Black Lungs", "ТАйМСКВЕР — Время первых", "Bad Omens — Like A Villain", "Bad Omens — THE DEATH OF PEACE OF MIND", "Bring Me The Horizon — The House of Wolves", "Bring Me The Horizon — Shadow Moses"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView artistTrackList = findViewById(R.id.artistTrackList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, artistTrack);

        artistTrackList.setAdapter(adapter);

        artistTrackList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                String selectedItem = artistTrack[position];
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("track", selectedItem);
                startActivity(intent);
            }
        });
    }
}