package my_practice;

public class while_break {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            int val = (int) (Math.random() * 50) + 1;
            if (val == 30) {
                System.out.println("30!종료!");
                break;
                // val 값이 30을 만나면 강제로 멈춘다(break)
            }
            sum += val;
            System.out.print(val + ", ");
        }

        System.out.println();
        System.out.println(sum);
    }
}
