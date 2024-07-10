package section09;

// 사람 정보에 대한 내용을 Person에서 가져와서 쓸 수 있음
public class Ex0903 {
    public static void main(String[] args) {
        UnclearOverloading uo1 = new UnclearOverloading();
        uo1.printField();

        UnclearOverloading uo2 = new UnclearOverloading(100, 10, "JAVA" );
        uo2.printField();
    }
}
