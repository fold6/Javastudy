package section03;

public class Eme3_test{
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int temp;

        temp = x; 
        x = y; 
        y = temp;

        System.out.println("x : " + x); //x:10
        System.out.println("y : " + y);//y:5

    }
}
