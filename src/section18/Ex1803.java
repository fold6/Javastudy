package section18;
// print 메서드 와 서식문자의 종류  정리필요
public class Ex1803 {
    public static void main(String[] args) {
    System.out.println(String.format("I eat %d apples.", 5 ));
    //format 서식 문자(%d)를 사용하게 해주는 메서드
    //문자열을 동적으로 넣어줌

    //위의 string fomat 쓰는게 번거로워서 나온게 아래의 printf(얘도 줄바꿈이 안되므로 필요시 \n을 붙힘)
    System.out.printf("i eat %d apples. \n", 5);
    //실수 넣기 : 실수용 서식문자로 바꿔야함 (표현하고자하는 소숫점 자리까지를  %.n 으로 표기)
    /* System.out.printf("i eat %f apples. \n", 2.5);
    System.out.printf("i eat %.2f apples. \n", 2.5);
    System.out.printf("i eat %s apples. \n", "five");
    System.out.printf("i eat %s apples. \n", "2.50"); */


    //%를 붙히려면 %%로 함
    System.out.printf("i have completed %d%% of my Java studies.\n", 50);
    //숫자 글자 같이 서식문자로 나타내기
    System.out.printf("i have completed %d%% of my %s studies.\n", 100,"Java");
    System.out.printf("i have completed %3d%% of my %s studies.\n", 90,"Java");
    System.out.printf("i have completed %-3d%% of my %s studies.\n", 20,"Java");
    //%3d%%, %-3d%% 처럼 3칸의 공간을 확보하며 서식문자의 공간확보량을 지정가능

    System.out.printf("i have completed %.2f%% of my %s studies.\n", 99.9999,"Java");
    //반올림을 함 = 99.9999는 100.00%로 표현됨 (반올림이 싫으면 문자열로 넣어야함 -> "99.9999","Java")

    }
    
}
