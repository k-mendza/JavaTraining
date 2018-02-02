package Udemy.CompleteJavaMasterclass.MusicDB;

import Udemy.CompleteJavaMasterclass.MusicDB.model.DataSource;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.open()){
            System.out.println("Cant open datasource");
            return;
        }
        dataSource.close();
    }
}
