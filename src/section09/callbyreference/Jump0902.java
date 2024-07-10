package section09.callbyreference;

class Updater{
    void update(Counter counter) {
        counter.count++;
        System.out.println("update- myCounter.count\t:" + counter.count);
    }
}

class Counter {
    int count = 0;
}

public class Jump0902 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before - myCounter.count:\t" + myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after - myCounter.count:\t " + myCounter.count);
    }    
}
