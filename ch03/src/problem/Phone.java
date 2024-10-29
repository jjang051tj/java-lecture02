package problem;

public class Phone {
    private String tel;
    private String name;

    public String getTel() {
        return tel;
    }

    public String getName() {
        return name;
    }
    //tel, name

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}
