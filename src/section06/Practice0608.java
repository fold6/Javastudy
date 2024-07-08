package section06;

public class Practice0608 {
    public static void main(String[] args) {
        /* 
            * : s 4개, * 1개 
           ** : s 3개, * 2개
          *** : s 2개, * 3개
         **** : s 1개, * 4개
        ***** : s 0개, * 5개
         */
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print("#");
            }
            for(int j =1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
