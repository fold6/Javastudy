package section10.fianlexample;

class NomalMethod {
    void nomalMethod() {
        System.out.println("nomalMethod!");
    }
}

class ChildNomalClass extends NomalMethod {
    
    @Override
    void nomalMethod() {
        System.out.println("childNomalClass.nomalMethod!");
    }
}

public class EX1004 {
    public static void main(String[] args) {
        NomalMethod nm = new ChildNomalClass();
        nm.nomalMethod(); // childNomalClass.nomalMethod! 출력
    }
}
