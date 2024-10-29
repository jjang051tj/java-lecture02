import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
class Point {
    private int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        // 갯수 제한 없음....

        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.get(2));
        System.out.println(vector.get(3));

        for(int i=0;i<vector.size();i++) {
            System.out.println(vector.get(i));
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("기아 타이거즈");
        arrayList.add("삼성 라이언즈");
        arrayList.add("엘지 트윈스");
        arrayList.add("KT 위저드");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(0);
        System.out.println("===========");
        System.out.println(arrayList.get(0));  //앞에꺼 지우면 연산이 많이 발생한다. 주의하자...
        ArrayList<String> arrayList02 = new ArrayList<>();
        arrayList02.add("삼성 라이언즈");
        arrayList02.add("엘지 트윈스");
        arrayList.removeAll(arrayList02); //리스트에서 특정 리스트 지우기... 잘 안씀
        arrayList.clear();
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
        List<Point> pointArrayList = new ArrayList<>(); //뒤에꺼 쓰지 않으면 알아서 추론한다.List
        pointArrayList.add(new Point(10,10));
        pointArrayList.add(new Point(20,20));
        pointArrayList.add(new Point(30,30));
        System.out.println(pointArrayList.get(0).getX());
        //배열도 그렇고 arraylist  iterable  순회가능한
        Iterator<Point> it = pointArrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }


    }
}
