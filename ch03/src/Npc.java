public class Npc {
    String name;
    int hp;
    // 속성 (properties)
    // 필드
    Npc() {
      //생성자 함수
        System.out.println("나는 생성될때 즉 new를 통해서 불려질때 처음 호출되는 함수입니다.");
        //hp=300;
    }
    void say() {
        System.out.println("안녕");
    }
    //Circle class를 정의해 보세요,  name, radius
    //getArea()라는 메서드를 가진다 getArea()는 실수를 리턴값으로 가진다.
}
