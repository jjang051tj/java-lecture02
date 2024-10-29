class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public int getTotal() {
        return price*quantity;
    }
    public void display() {
        System.out.println("상품명 : "+name+",합계 : "+getTotal());
    }
}
public class Cart {
    private Item [] items = new Item[3];
    private int itemCount = 0;
    public void addItem(Item item) {
        if(itemCount>=items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }
    private int calcTotal() {
        int sum = 0;
        for(Item item : items) {
            sum+=item.getTotal();
        }
        return sum;
    }
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(Item item : items) {
            item.display();
        }
        System.out.println("총액 : "+calcTotal());
    }

    //디자인 패턴
    public static void main(String[] args) {
        Cart cart = new Cart();

        Item item01 = new Item("마늘",1000,2);
        int total = item01.getTotal();
        cart.addItem(item01);
        cart.addItem(item01);
        cart.addItem(item01);
        cart.addItem(item01);
        cart.displayItems();

    }
}
