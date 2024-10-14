package vn.edu.usth.groupproject;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        String title = getIntent().getStringExtra("TITLE");
        String artist = getIntent().getStringExtra("ARTIST");
        int image = getIntent().getIntExtra("IMAGE", 0);

        TextView tvTitle = findViewById(R.id.song_title_fragment);
        TextView tvArtist = findViewById(R.id.song_artist_fragment);
        ImageView imageView = findViewById(R.id.song_image_fragment);

        tvTitle.setText(title);
        tvArtist.setText(artist);
        imageView.setImageResource(image);
    }
}