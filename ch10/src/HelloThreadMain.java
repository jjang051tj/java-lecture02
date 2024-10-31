public class HelloThreadMain {
    public static void main(String[] args) {
        //스레드 두개 만들어 짐 main thread
        System.out.println(Thread.currentThread().getName()+ " : main() start()"); //
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName()+ " : start() 호출 전");
        helloThread.start(); //스레드 호출
        System.out.println(Thread.currentThread().getName()+ " : start() 호출후");
        System.out.println(Thread.currentThread().getName()+ " : main() end()");
        //
        // 하나의 프로그램에서 여러개의 스레드를 만들어 쓸 수 있다.
        // 이때 context switching이 이루어 지면서 여러개의 일을 동시에 하는 것 처럼 보이게 한다. 실질적으로 일을 하는 건 하나이다.
    }
}
