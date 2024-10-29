public class StringTest {
    public static void main(String[] args) {
        String str01 = "bbbb";  // 리터럴   모든 곳에서 constant pool에 생성
        String str03 = "abcd";  // 리터럴   모든 곳에서 constant pool에 생성
        String str04 = "abcd";  // 리터럴   모든 곳에서 constant pool에 생성
        int num = 10; // 리터럴  "abcd" ,1, 10.4  //값
        //program에서 사용하는 숫자 문자 문자열 논리값
        // String을 literal로 사용하면 메모리가 가리키는 곳은 같다.
        String str02 =  new String("abcd"); // heap 메모리에 생성
        String str05 =  new String("abcd"); // heap 메모리에 생성
        System.out.println(str01==str02);
        System.out.println(str01==str03);
        System.out.println(str01==str04);
        System.out.println(str02==str05);

        char ch = str01.charAt(str01.length()-1);
        System.out.println(ch);
        System.out.println(str01.compareTo("bbbb"));
        System.out.println("동해물과"+" 백두산이");
        String concatStr = "동해물과".concat(" 백두산이");
        System.out.println(concatStr);
        System.out.println(" jjang051");
        System.out.println(" jjang051".trim());
        System.out.println(" jjang051   ".trim());
        System.out.println(" jjang 051   ".trim());
        System.out.println("010 1111 2222".replace(" ",""));
        System.out.println("951225-1111222".substring(0,6)); //substring(index, 자를 문자 갯수)
        System.out.println("동해물과 백두산이".contains("해물"));
        System.out.println("동해물과 백두산이".startsWith("동해")); //String은 정말 많이 사용함 라이브러리 많음

        StringBuffer sb = new StringBuffer("java");  // 글자 쓰는 거
        System.out.println("sb java"+sb.hashCode()+"==="+sb.toString());
        String str08 = "java";  // 글자 쓰는 거
        System.out.println("java"+str08.hashCode());
        str08+="world";
        System.out.println(sb.equals("java"));
        System.out.println(str08);
        System.out.println("javaworld"+str08.hashCode());
        sb.append("world");
        System.out.println("sb java"+sb.hashCode()+"==="+sb.toString());
        // 상수 사용할때는 String 불변객체 (내용이 바뀌면 메모리 주소값이 바뀐다.)
        // 묹열이 자주 바뀐다 StringBuffer를 사용한다.  가변객체(메모리에 주소값은 같으면서 길이는 바꿀 수 있다.)
        //java안에는 garbage collection

    }
}
