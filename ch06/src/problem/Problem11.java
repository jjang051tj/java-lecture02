package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Word {
    private String eng;
    private String kor;

    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }

    public String getEng() {
        return eng;
    }

    public String getKor() {
        return kor;
    }
}
public class Problem11 {
    public static void main(String[] args) {
        ArrayList<Word> arrayList = new ArrayList<>();
        arrayList.add(new Word("constructor", "생성자"));
        arrayList.add(new Word("overriding", "재정의"));
        arrayList.add(new Word("extends", "상속"));
        arrayList.add(new Word("array", "배열"));
        arrayList.add(new Word("string", "문자열"));
        arrayList.add(new Word("character", "문자"));
        arrayList.add(new Word("integer", "정수"));
        arrayList.add(new Word("double", "실수"));
        arrayList.add(new Word("abstract", "추상"));
        arrayList.add(new Word("implements", "구현하다"));
        int total = arrayList.size();
        System.out.println("현재 "+total+"개의 단어가 있습니다. -1을 입력하면 종료합니다.");
        Scanner scanner = new Scanner(System.in);
        //리팩토링
        while(true) {
            int answerIdx = (int)(Math.random()*total); //랜덤한 번호를 잡는다.  0~9
            String answerEng = arrayList.get(answerIdx).getEng(); //문제로 던져질 영어 단어
            int example[] =  new int[4]; //사지선다 배열 하나 만듦 [3,4,2,7]
            for(int i=0;i<4;i++) {
                int randomNum = (int)(Math.random()*total);  //4
                if(randomNum==answerIdx || existNum(example,randomNum)) {
                    i--;
                    continue;
                }
                example[i] = randomNum;
            }
            //1. example배열에 중복이 들어가면 안된다.
            //2. 정답이 배열에 들어가면 안된다.

            //정답없고 중복 없는 배열이 하나 생성된다.
            int fixedNum = (int)(Math.random()*example.length);
            example[fixedNum] = answerIdx;
            //System.out.println("정답은 "+answerIdx+"===="+ Arrays.toString(example));
            //System.out.println(answerEng);
            System.out.println(answerEng+"?");
            for(int i=0;i<example.length;i++) {
                System.out.print("("+(i+1)+")"+arrayList.get(example[i]).getKor()+"\t");
            }
            System.out.println("1,2,3,4 중에 하나를 고르시오. >>");
            int num = scanner.nextInt();
            if(num==-1) break;
            if(num-1==fixedNum) System.out.println("정답니다.");
            else System.out.println("땡");

        }
    }
    static boolean existNum(int nums[],int idx) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==idx) return true;
        }
        return false;
    }
}
