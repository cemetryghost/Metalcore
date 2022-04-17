package com.example.metalllcore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class SecondActivity extends AppCompatActivity {
    Map<String, Integer> dictionaryOfTracks = new HashMap<>();
    Map<String, Integer> dictionaryOfCovers = new HashMap<>();
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle arguments = getIntent().getExtras();
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setHorizontallyScrolling(true);
        ImageView imageView = findViewById(R.id.imageView);

        dictionaryOfTracks.put("Wildways — Breathless", R.string.Wildways_Breathless);
        dictionaryOfTracks.put("Wildways — Lost", R.string.Wildways_Lost);
        dictionaryOfTracks.put("Architects — Animals", R.string.Architects_Animals);
        dictionaryOfTracks.put("Architects — Giving Blood", R.string.Architects_Giving_Blood);
        dictionaryOfTracks.put("Architects — Black Lungs", R.string.Architects_Black_Lungs);
        dictionaryOfTracks.put("ТАйМСКВЕР — Время первых", R.string.ТАйМСКВЕР_Время_первых);
        dictionaryOfTracks.put("Bad Omens — Like A Villain", R.string.Bad_Omens_Like_A_Villain);
        dictionaryOfTracks.put("Bad Omens — THE DEATH OF PEACE OF MIND", R.string.Bad_Omens_THE_DEATH_OF_PEACE_OF_MIND);
        dictionaryOfTracks.put("Bring Me The Horizon — The House of Wolves", R.string.Bring_Me_The_Horizon_Th_House_of_Wolves);
        dictionaryOfTracks.put("Bring Me The Horizon — Shadow Moses", R.string.Bring_Me_The_Horizon_Shadow_Moses);

        dictionaryOfCovers.put("Wildways — Breathless", R.drawable.day_x);
        dictionaryOfCovers.put("Wildways — Lost", R.drawable.day_x);
        dictionaryOfCovers.put("Architects — Animals", R.drawable.for_those_that_wish_to_exist);
        dictionaryOfCovers.put("Architects — Giving Blood", R.drawable.for_those_that_wish_to_exist);
        dictionaryOfCovers.put("Architects — Black Lungs", R.drawable.for_those_that_wish_to_exist);
        dictionaryOfCovers.put("ТАйМСКВЕР — Время первых", R.drawable.time_of_the_first);
        dictionaryOfCovers.put("Bad Omens — Like A Villain", R.drawable.the_death_of_peace_of_mind);
        dictionaryOfCovers.put("Bad Omens — THE DEATH OF PEACE OF MIND", R.drawable.the_death_of_peace_of_mind);
        dictionaryOfCovers.put("Bring Me The Horizon — The House of Wolves", R.drawable.sepmeternal);
        dictionaryOfCovers.put("Bring Me The Horizon — Shadow Moses", R.drawable.sepmeternal);

        imageView.setImageResource(dictionaryOfCovers.get(arguments.getString("track")));

        String trackArray[] = (arguments.getString("track")).split(" ");
        String track = "";
        for (String part: trackArray) {
            if(part.equals("—")){
                track +="\n";
            }
            else {
                track += part + " ";
            }

        }

        textView2.setText(track);
        textView.setText(dictionaryOfTracks.get(arguments.getString("track")));

    }
}