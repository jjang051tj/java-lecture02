package problem;

public class Song {
    String artist;
    String country;
    String title;
    int year;

    public Song() {
    }

    public Song(String artist, String country, String title, int year) {
        this.artist = artist;
        this.country = country;
        this.title = title;
        this.year = year;
    }
    void show() {
        //1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
        System.out.printf("%d년 %s국적의 %s가 부른 %s",year,country,artist,title);
    }
}
