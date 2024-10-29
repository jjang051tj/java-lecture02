package problem;

import java.util.Scanner;

//인터페이스
//interface IPlay {
//
//}
interface Playable {
    String getName();
    int turn();
}
class Player02 implements Playable {
    Scanner scanner = new Scanner(System.in);
    private String name;

    public Player02(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int turn() {
        System.out.println(name+"[가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
        return scanner.nextInt();
    }
}
class Computer02 implements Playable {

    private String name;

    public Computer02(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int turn() {
        return (int)(Math.random()*3)+1;
    }
}
class Computer03 extends Computer02{


    public Computer03(String name) {
        super(name);
    }

    @Override
    public int turn() {
        return 1;
    }
}
public class Problem0902 {

    public static void main(String[] args) {
        String stringList[] = {"가위","바위","보"};
        Playable me = new Player02("철수");
        Playable computer = new Computer03("바보컴퓨터");
        while(true) {
            int myChoice = me.turn();
            int computerChoice = computer.turn();
            if(myChoice==4) {
                break;
            }
            if(myChoice==computerChoice) {
                System.out.println(me.getName()+"("+stringList[myChoice-1]+"),"+
                        computer.getName()+"("+stringList[computerChoice-1]+")");
                System.out.println(me.getName()+" 비겼습니다.");
            } else if((myChoice==1 && computerChoice==3) || (myChoice==2 && computerChoice==1) || (myChoice==3 && computerChoice==2)) {
                System.out.println(me.getName()+"("+stringList[myChoice-1]+"),"+
                        computer.getName()+"("+stringList[computerChoice-1]+")");
                System.out.println(me.getName()+"가 이겼습니다.");
            } else {
                System.out.println(me.getName()+"("+stringList[myChoice-1]+"),"+
                        computer.getName()+"("+stringList[computerChoice-1]+")");
                System.out.println(me.getName()+"가 졌습니다.");
            }
        }
    }
}
