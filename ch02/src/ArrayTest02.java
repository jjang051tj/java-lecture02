public class ArrayTest02 {
    public static void main(String[] args) {
        //대학교 4학년 평균

        //double[][] score02 = {{3.8,3.7},{3.2,4.1},{2.9,3.6},{3.5,4.2}};
        int arr01[] = new int[3];
        arr01[0] = 100;
        arr01[1] = 200;
        arr01[2] = 300;

        int arr02[][] = new int[4][2];
        arr02[0][0] = 100;
        arr02[0][1] = 200;
        arr02[1][0] = 300;
        arr02[1][1] = 400;

        int arr03[][] =  {{100,200,300,400},{200,300,300},{300,400},{400,500}};
        for(int i=0;i<arr03.length;i++) {
            for(int j=0;j<arr03[i].length;j++) {
                System.out.println(arr03[i][j]);
            }
        }



        double[][] score02 = new double[4][2];
        score02[0][0] = 3.8;
        score02[0][1] = 3.7;

        score02[1][0] = 3.2;
        score02[1][1] = 4.1;

        score02[2][0] = 2.9;
        score02[2][1] = 3.6;

        score02[3][0] = 3.5;
        score02[3][1] = 4.2;

        System.out.println(score02[0][1]);
        for(int i=0;i<score02.length;i++) {
            for(int j=0;j<score02[i].length;j++) {
                System.out.print(score02[i][j]);
            }
            System.out.println();
        }
        for(double row[]:score02) {
            for(double score:row) {
                System.out.print(score+" ");
            }
            System.out.println();
        }
    }
}
