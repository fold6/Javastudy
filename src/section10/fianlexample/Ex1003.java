
package section10.fianlexample;

class NomalClass {

}

class ChildnomalClass extends NomalClass{

}


class FinalClass {
    
}

class ChildFinalClass extends FinalClass{

}

public class Ex1003 {
    public static void main(String[] args) {
        ChildnomalClass cnc = new ChildnomalClass();
        System.out.println(cnc);
    }
}
