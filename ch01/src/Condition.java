public class Condition {
    //프로그램 진입점
    public static void main(String[] args) {
        int age = 22;
        if(age>20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }
        int month = 8;
        String season = "Apr";
        String strMonth = "";
        switch(season) {
            case "Jan" : strMonth = "Jan";break;
            case "Feb" : strMonth = "Feb";break;
            case "Mar" : strMonth = "Mar";break;
            case "Apr" : strMonth = "Apr";break;
            case "May" : strMonth = "May";break;
            case "Aug" : strMonth = "Aug";break;
            case "Sep" : strMonth = "Sep";break;
        }
        System.out.println(strMonth);

    }
}
