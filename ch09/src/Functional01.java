@FunctionalInterface
interface  MyFunction {
    void run();
}

public class Functional01 {
    static void execute(MyFunction f) {
        f.run();
    }
    static MyFunction getMyFunction01() {
        MyFunction myFunction = new MyFunction() {
            @Override
            public void run() {
                System.out.println("getMyFunction01 run");
            }
        };
        return myFunction;
    }


    static MyFunction getMyFunction02() {
        MyFunction myFunction = () ->  System.out.println("getMyFunction02 run");
        return myFunction;
    }

    public static void main(String[] args) {

        execute(() -> System.out.println("run()"));
        execute(new MyFunction() {
            @Override
            public void run() {
                System.out.println("run()");
            }
        });

        MyFunction myFunction01 = getMyFunction01();
        MyFunction myFunction02 = getMyFunction02();
        myFunction01.run();
        myFunction02.run();
    }
}
