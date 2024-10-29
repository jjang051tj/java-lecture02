package problem;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

class City {
    private String name;
    private int longitude;
    private int latitude;

    public City(String name, int longitude, int latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, City> hashMap = new HashMap<>();
        /*
        while (true) {
            String str = scanner.nextLine();
            if(str.equals("그만")) break; //서울   ,  100,   100
            StringTokenizer stringTokenizer = new StringTokenizer(str,",");
            String name =  stringTokenizer.nextToken().trim();
            int longitude =  Integer.parseInt(stringTokenizer.nextToken().trim());
            int latitude =  Integer.parseInt(stringTokenizer.nextToken().trim());
            hashMap.put(name,new City(name,longitude,latitude));
        }
         */

        hashMap.put("서울", new City("서울",100,100));
        hashMap.put("도쿄", new City("도쿄",200,200));
        hashMap.put("뉴욕", new City("뉴욕",300,300));
        hashMap.put("베이징", new City("베이징",100,100));
        while (true) {
            String str = scanner.nextLine();
            if(str.equals("그만")) break;
            City city = hashMap.get(str);
            System.out.println(city);
        }
    }
}
