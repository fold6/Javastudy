package section05;
//check
public class Ex0505 {
    public static void main(String[] args) {
        int number = 1;
        while (true) {
            number++;
            if (number % 2 != 0) {
                continue;
            }
            System.out.printf("%d ", number);
            if (number >= 10){
                break;
            }
        }
    }
}
