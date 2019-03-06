package com.example.ahmed_amr.musicalstructureapp;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

  public SongAdapter(Context context, ArrayList<Song> songs)
  {

      super(context,0,songs);

  }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


      View ListItemView = convertView;
      if(ListItemView == null)
      {
          ListItemView = LayoutInflater.from(getContext()).inflate(
                  R.layout.listitem_activity, parent, false);
      }


      Song CurrentSong = getItem(position);

        TextView song_num =  ListItemView.findViewById(R.id.song_num_id);
        song_num.setText(CurrentSong.getSong());


        TextView size =  ListItemView.findViewById(R.id.size);
        size.setText(CurrentSong.getSongSize());
        return ListItemView;
    }

}
