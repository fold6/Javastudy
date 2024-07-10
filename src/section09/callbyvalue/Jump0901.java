package section09.callbyvalue;

import section09.callbyreference.Counter;
import section09.callbyreference.Updater;

class Updater{
    void update(int count) {
        count++;
    }
}

class Counter {
    int count = 0;
}

public class Jump0901 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before - myCounter.count:\t" + myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.update(myCounter.count);
        System.out.println("after - myCounter.count:\t " + myCounter.count);
    }    
}
