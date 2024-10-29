package problem;

public class StringStack implements Stack {

    private String elements[];
    private int tos;  // index,  top of stack

    public StringStack(int capacity) {
        this.elements = new String[capacity];
        tos = 0;
    }

    // 현재 스택에 쌓여 있는 갯수
    @Override
    public int length() {
        return tos + 1; //3
    }

    //스택의 최대 갯수
    @Override
    public int capacity() {
        return elements.length;
    }

    // 스택에 있는 값을 꺼낸온다.
    @Override
    public String pop() {
        //끄집어 낼게 없을때 있다.
        if(tos==-1) {
            System.out.println("왜");
            return null;
        }
        System.out.println("tos==="+tos);
        String popStr =  elements[tos-1];
        tos--;

        return popStr;
    }

    //스택에 넣을 수 있는지 없는지를 따진다.
    @Override
    public boolean push(String str) {
        if (tos >= elements.length) {
            return false;
        }
        elements[tos] = str;
        tos++;
        return true;
    }
}
