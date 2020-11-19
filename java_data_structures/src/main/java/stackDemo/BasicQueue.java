package stackDemo;

public class BasicQueue<X> {

    private X[] data;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        data = (X[])new Object[size];
    }
}
