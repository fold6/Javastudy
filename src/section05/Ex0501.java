package section05;

public class Ex0501 {
    public static void main(String[] args) {
        int count = 0;
        // 반복 횟수가 정해져 있지 않았을때 효과적
        while (true) {
            System.out.printf("무한루프(Infinite loop) - %d\n",++count);
        }
    }
    
}
