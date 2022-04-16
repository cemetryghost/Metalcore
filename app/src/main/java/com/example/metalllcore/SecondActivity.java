package com.example.metalllcore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class SecondActivity extends AppCompatActivity {
    Map<String, Integer> dictionary = new HashMap<>();
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

        dictionary.put("Wildways — Breathless", R.string.Wildways_Breathless);
        dictionary.put("Wildways — Lost", R.string.Wildways_Lost);
        dictionary.put("Architects — Animals", R.string.Architects_Animals);
        dictionary.put("Architects — Giving Blood", R.string.Architects_Giving_Blood);
        dictionary.put("Architects — Black Lungs", R.string.Architects_Giving_Blood);
        dictionary.put("ТАйМСКВЕР — Время первых", R.string.ТАйМСКВЕР_Время_первых);
        dictionary.put("Bad Omens — Like A Villain", R.string.Bad_Omens_Like_A_Villain);
        dictionary.put("Bad Omens — THE DEATH OF PEACE OF MIND", R.string.Bad_Omens_THE_DEATH_OF_PEACE_OF_MIND);
        dictionary.put("Bring Me The Horizon — The House of Wolves", R.string.Bring_Me_The_Horizon_Th_House_of_Wolves);
        dictionary.put("Bring Me The Horizon — Shadow Moses", R.string.Bring_Me_The_Horizon_Shadow_Moses);

        textView2.setText(arguments.getString("track"));
        textView.setText(dictionary.get(arguments.getString("track")));

    }
}