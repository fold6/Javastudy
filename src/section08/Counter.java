package section08;

public class Counter {
    static int count = 0;
    String displayName;

    static void setCount() {
        count++;
    }

    void setName(String displayName) {
        this.displayName = displayName;
    }
}
