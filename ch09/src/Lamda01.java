@FunctionalInterface
interface LamdaInterface {
    void print(String name);
}
public class Lamda01 {
    public static void main(String[] args) {
        LamdaInterface commonInterface = new LamdaInterface() {
            @Override
            public void print(String name) {
                System.out.println(name+"아 안녕!!!");
            }
        };
        commonInterface.print("장성호");

        LamdaInterface lamdaInterface = name -> {
            System.out.println("lamda->"+name+"아 안녕");
        };
        lamdaInterface.print("장동건");
    }
}
