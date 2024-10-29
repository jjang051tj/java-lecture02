package extend;

public class ItemTest {
    public static void main(String[] args) {
        Book book = new Book("JAVA",10000,"han","12345");
        book.print();
        Album album = new Album("앨범1", 15000,"seo");
        album.print();
        Movie movie = new Movie("베테랑", 15000,"류승완", "황정민");
        movie.print();

        int sum = book.getPrice()+album.getPrice()+movie.getPrice();


        System.out.println("총합 : "+sum);
    }
}
