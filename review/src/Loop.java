public class Loop {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            System.out.print(i+"\t");
        }
        System.out.println("");
        int j = 0;
        while(j<10) {
            System.out.print(j+"\t");
            j++;
        }
        System.out.println();
        int k = 0;
        do {
            System.out.print(k+"\t");
            k++;
        }
        while(k<10);
        System.out.println(k);

        int i=0;
        int sum = 0;
        while(i<=100) {
            i++;
            if(i==50) continue; // 여기에 걸리면 조건으로 올라간다.
            sum+=i;

        }
        System.out.println("sum==="+sum);



    }
}
