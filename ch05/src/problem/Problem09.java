package problem;

import java.util.Scanner;

class Player {
    private String name;
    Scanner scanner = new Scanner(System.in);
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int turn() {
        System.out.println(name+"[가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
        return scanner.nextInt();
    }
}
class Computer extends Player {

    public Computer(String name) {
        super(name);
    }

    @Override
    public int turn() {
        return (int)(Math.random()*3)+1;
    }
}

public class Problem09 {
    public static void main(String[] args) {
        //나는 숫자 1,2,3
        //컴퓨터는  1,2,3
        String stringList[] = {"가위","바위","보"};
        Player me = new Player("장성호");
        Computer computer = new Computer("컴퓨터");
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
