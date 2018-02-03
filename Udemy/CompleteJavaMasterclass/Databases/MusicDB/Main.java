package Udemy.CompleteJavaMasterclass.MusicDB;

import Udemy.CompleteJavaMasterclass.MusicDB.model.Artist;
import Udemy.CompleteJavaMasterclass.MusicDB.model.DataSource;

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
        List<String> albumsForArtists = dataSource.queryAlbumsForArtist("Pink Floyd", DataSource.ORDER_BY_ASC);
        for(String album : albumsForArtists){
            System.out.println(album);
        }
        dataSource.close();
    }
}
