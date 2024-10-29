public class Book {
    String title;
    String author;
    int year;

    //이름이 똑같은 생성자 함수를 여러개 만들 수 있다.  생성자 overload
    Book() {
        this("작자미상","제목없음");
    }
    Book(String title) {
        this("작자미상",title);
    }
    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    Book(int year) {
        this.year = year;
    }
    //생성자 함수를 내가 직접 만들어 보기...


    void print() {
        System.out.println("나는 북 객체입니다.");
        //return new Book();
    }

    //class 정의하면 만든 사람이 따로 생성자함수를 만들지 않으면 기본 생성자 함수를 디폴트로 하나
    //만든다.
}
