package vn.edu.usth.groupproject;

public class SongData {
    private String songName;
    private String artist;
    private int imageResource;

    public SongData(String songName, String artist, int imageResource) {
        this.songName = songName;
        this.artist = artist;
        this.imageResource = imageResource;
    }

    public String getSongName() {
        return songName;
    }
    public String getArtist() {
        return artist;
    }
    public int getImageResource() {
        return imageResource;
    }
}
