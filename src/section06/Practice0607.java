package section06;

public class Practice0607 {
    public static void main(String[] args) {
        /* 
        
         * 
         **
         ***
         ****
         *****
        
         */

        //역으로 뒤집기
         
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
