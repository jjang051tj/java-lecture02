public class Condition {
    public static void main(String[] args) {
        //문 statement
        // 실행명령어 또는 코드 조각
        int x = 10;            //변수 선언문
        System.out.println(x); //출력문
        if (true) {             //조건문

        }
        //값 value
        // 10,'A',"장성호" 리터럴들
        // 데이터 그 자체
        int age = 20;
        int adultAge = 18;
        if (age >= adultAge) System.out.println("성인입니다.");
        else System.out.println("미성년자입니다.");

        age = 6;
        if(age<=7) System.out.println("미취학 아동");
        else if(age<=13) System.out.println("초등학생");
        else if(age<=16) System.out.println("중학생");
        else if(age<=19) System.out.println("고등학생");
        //쇼핑몰 시스템
        // 내가 산 물건값이 10000원 이상이면 1000원 할인
        // 나이가 10살보다 작으면 1000원 할인
        int price = 20000;
        int age02 = 9;
        int discount = 0;
        if(price>10000) {
            discount+=1000;
        }
        if(age<10) {
            discount+=1000;
        }
        System.out.println(price-discount);

//        어느 아내가 프로그래머 남편에게
//        아내 : 우유 하나 사와. 아, 달걀 있으면 6개 사와
        int milk = 1;
        boolean isEgg = true;
        if(isEgg) {
            milk=6;
        }
        int grade = 2;
        int coupon = 0;
        //깔끔해 보인다.
        switch (grade) {
            case 1 : coupon=1000; break;
            case 2 : coupon=3000; break;
            case 3 : coupon=3000; break;
            default: coupon = 500; break;
        }
        System.out.println(coupon);


        grade=1;
        switch (grade) {
            case 1 :
            case 2 :
            case 3 : coupon=3000; break;
            default: coupon = 500; break;
        }
        System.out.println(coupon);

        //자바 14버전 이상에서만....
        grade=1;
        coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(coupon);
        grade=1;
        coupon = switch (grade) {
            case 1  -> 1000;
            case 2,3 -> 3000;
            default  -> 500;
        };
        System.out.println(coupon);

        grade=5;
        coupon = switch (grade) {
            case 1  -> {
                System.out.println("1등급");
                yield 1000;
            }


            case 2,3 -> {
                System.out.println("2~3등급");
                yield 2000;
            }
            default  -> {
                System.out.println("나머지 등급");
                yield 1000;
            }
        };
        System.out.println(coupon);








    }
}
