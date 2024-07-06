package section05;

public class Ex0508 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if (i % 2 != 0){
                continue; 
            }
            System.out.printf("%d ",i);
        }
    }
}
