package inter;

public interface PhoneInterface {
    public static final int TIME_OUT=10000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo() {
        System.out.println("===phone===");
    }
}
