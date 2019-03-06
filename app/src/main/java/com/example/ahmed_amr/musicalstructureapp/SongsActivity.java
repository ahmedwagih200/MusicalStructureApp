package com.example.ahmed_amr.musicalstructureapp;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_activity);

        ArrayList<Song> songList = new ArrayList<Song>();
        for(int i = 1 ; i<=10; i++)
        {
            songList.add(new Song("Song-"+i,"Size-2"+i+"Mb"));
        }

        SongAdapter songAdapter = new SongAdapter(this,songList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        Button play_button = findViewById(R.id.playy);
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Music Played";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });

        Button stop_button = findViewById(R.id.stopp);
        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Music Stopped";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });


        Button details_button = findViewById(R.id.detailss);
        details_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song_details = new Intent(SongsActivity.this,Details.class);
                startActivity(song_details);
            }
        });

        Button back_button = findViewById(R.id.back);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SongsActivity.this,MainActivity.class);
                startActivity(back);
            }
        });

     }

}
