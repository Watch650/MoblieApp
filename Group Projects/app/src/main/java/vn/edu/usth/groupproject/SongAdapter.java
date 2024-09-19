package vn.edu.usth.groupproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongData> {

    private Context mContext;

    public SongAdapter(Context context, ArrayList<SongData> songs) {
        super(context, 0, songs);
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SongData song = getItem(position);

        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.fragment_songs, parent, false);
            holder = new ViewHolder();
            holder.image = convertView.findViewById(R.id.song_image);
            holder.name = convertView.findViewById(R.id.song_title);
            holder.artist = convertView.findViewById(R.id.song_artist);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.image.setImageResource(song.getImageResource());
        holder.name.setText(song.getSongName());
        holder.artist.setText(song.getArtist());

        return convertView;
    }

    static class ViewHolder {
        ImageView image;
        TextView name;
        TextView artist;
    }
}