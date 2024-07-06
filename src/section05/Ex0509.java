package section05;

public class Ex0509 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            //1~100 이하
            if (1 % 2 != 0){
                // 왜 continue 했을때 짝수가 나오는가~

                //1이니까 트루가 됨 근데 컨티뉴 했으니까 밑에꺼는 실행안됨 
                // i++ 때매 처음으로 돌아가고 2가 됨
                // 2%2가 되는데 0!=0 은 폴스 니까 ? 컨티뉴가 건너뛰어지니까 
                // if i > 10 break; 가 돼서 결과값은 짝수에서 10이하인 값들이 나옴

                //홀수인것
                continue; 
            }
            if (i > 10){
                break;
            }
            System.out.printf("%d ",i);
        }
    }
}
