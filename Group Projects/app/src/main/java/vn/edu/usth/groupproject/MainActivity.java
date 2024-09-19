package vn.edu.usth.groupproject;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<SongData> songList = new ArrayList<>();
    private SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ListView and ArrayAdapter
        ListView songListView = findViewById(R.id.song_list);
        songAdapter = new SongAdapter(this, songList);
        songListView.setAdapter(songAdapter);

        // Add functionality to add songs dynamically
//        findViewById(R.id.addSongButton).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String newSongName = ((EditText) findViewById(R.id.addSongEditText)).getText().toString();
//                String newArtist = ((EditText) findViewById(R.id.addArtistEditText)).getText().toString();
//
//                int resourceId = getResources().getIdentifier("song_" + songList.size(), "drawable", getPackageName());
//                if (resourceId != 0) {
//                    songList.add(new SongData(newSongName, newArtist, resourceId));
//                    songAdapter.notifyDataSetChanged();
//                    ((EditText) findViewById(R.id.addSongEditText)).setText("");
//                    ((EditText) findViewById(R.id.addArtistEditText)).setText("");
//                } else {
//                    Toast.makeText(MainActivity.this, "No image found for this song", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        // Add song to the list
        songList.add(new SongData("Back In Black", "AC/DC", R.drawable.song1));
        songList.add(new SongData("You Give Love A Bad Name", "Bon Jovi", R.drawable.song2));
        songList.add(new SongData("Dangerously", "Charle Puth", R.drawable.song3));
    }

    // Method to handle song selection
    private void selectSong(int position) {
        SongData selectedSong = songList.get(position);
        // Implement your logic here to handle the selected song
        System.out.println("Selected song: " + selectedSong.getSongName() + ", Artist: " + selectedSong.getArtist());
    }
}