package Udemy.CompleteJavaMasterclass.MusicDB;

import Udemy.CompleteJavaMasterclass.MusicDB.model.Artist;
import Udemy.CompleteJavaMasterclass.MusicDB.model.DataSource;
import Udemy.CompleteJavaMasterclass.MusicDB.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.open()){
            System.out.println("Cant open datasource");
            return;
        }
        List<Artist> artists = dataSource.queryArtists(DataSource.ORDER_BY_ASC);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }
        for (Artist artist : artists){
            System.out.println("ID= " + artist.getId() + ", Name = " + artist.getName());
        }
        List<String> albumsForArtists = dataSource.queryAlbumsForArtist("Carole King", DataSource.ORDER_BY_ASC);
        for(String album : albumsForArtists){
            System.out.println(album);
        }

        List<SongArtist> songArtists = dataSource.queryArtistForSong("Go Your Own Way", DataSource.ORDER_BY_ASC);
        if (songArtists == null){
            System.out.println("Could not return query");
            return;
        }
        for (SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getAlbumName() + " Track = " + artist.getTrack());
        }
        dataSource.querySongsMetadata();
        int count = dataSource.getCount(DataSource.TABLE_SONGS);

        System.out.println("Number of songs is: " + count);
        dataSource.createViewForSongArtists();
        dataSource.close();
    }
}
