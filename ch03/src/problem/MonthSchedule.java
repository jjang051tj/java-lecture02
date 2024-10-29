package problem;

import java.util.Scanner;

public class MonthSchedule {
    //날짜가 몇개인지를 알아야 한다.
    private Day dayList[] = new Day[30];


    private int days;
    Scanner scanner = new Scanner(System.in);

    public MonthSchedule() {
    }

    public MonthSchedule(int days) {
        this.days = days;
        dayList = new Day[days];
        for(int i=0;i<days;i++) {
            dayList[i] = new Day();  //객체 배열
        }

        System.out.println("이번 달은 "+days+"일 까지 있습니다.");
//        dayList[0].set("자바 공부하기");
//        dayList[0].show();
    }

    public void input() {
        System.out.print("날짜(1 ~ "+days+") ? ");  //1 ~ 28 ? 3
        int day = scanner.nextInt();
        System.out.print("할일(빈칸없이입력) ? ");
        String work = scanner.next();
        day--;
        dayList[day].set(work);
//        Day day = new Day();
//        day.set("영화보기");
//        for(int i=0;i<dayList.length;i++) {
//            dayList[i].show();
//        }
    }
    //4번을 누르면 전체보기
    // showAll();
    public void view() {
        //System.out.println("뭔가를 보여드립니다.");
        System.out.print("날짜 (1 ~ "+days+") ? ");
        int day = scanner.nextInt();
        System.out.print(day+"일의 할일은 ");
        day--;
        dayList[day].show();
    }
    public void showAll() {
        for(int i=0;i<dayList.length;i++) {
            dayList[i].show();
        }
    }
    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }
    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(true) {
            System.out.print("할일(입력:1, 보기:2, 전체보기:3, 끝내기:4) >>");
            int selectMenu =  scanner.nextInt();
            if(selectMenu==1) {
                input();
            } else if(selectMenu==2) {
                view();
            } else if(selectMenu==3) {
                showAll();
            } else if(selectMenu==4) {
                finish();
                return;
            }
        }
    }

    public static void main(String[] args) {
        //Day day = new Day();
        //day.set("넷플릭스 밀린거 보기");
        //day.show();
        MonthSchedule octScedule = new MonthSchedule(28);
        octScedule.run();
    }
}
