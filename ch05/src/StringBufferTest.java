import java.util.StringTokenizer;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb.equals("java"));
        System.out.println(sb.toString().equals("java"));
        sb.append(" world");
        System.out.println(sb.toString());
        sb.insert(4, "script"); // 순서 잡아서 넣기
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        //sb.setLength(30);
        System.out.println(sb.length());
        //sb.append("===");
        System.out.println(sb.toString());
        sb.reverse();
        sb.delete(4, 10);
        System.out.println(sb.toString());

        String query = "name=장성호&addr=파주&age=30";
        StringTokenizer stringTokenizer = new StringTokenizer(query, "&");
        System.out.println(stringTokenizer.countTokens());
        //다음 토큰
//        System.out.println(stringTokenizer.nextToken());
//        System.out.println(stringTokenizer.countTokens());
//        System.out.println(stringTokenizer.nextToken());
//        System.out.println(stringTokenizer.countTokens());
//        System.out.println(stringTokenizer.nextToken());

//        System.out.println(stringTokenizer.countTokens());
//        int total = stringTokenizer.countTokens();
//        for(int i=0;i<total;i++) {
//            System.out.println(stringTokenizer.nextToken());
//        }

        for (; stringTokenizer.hasMoreTokens(); ) {
            System.out.println(stringTokenizer.nextToken());
        }
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}










