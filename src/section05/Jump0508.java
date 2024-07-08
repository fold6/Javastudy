package section05;

public class Jump0508 {
    public static void main(String[] args) {
        //Jump0505를 for each로 refactoring
        String[] numbers = {"one","two","three"};

        for(String number : numbers){
            System.out.printf("%s ",number);
        }
        System.out.print(numbers.length);
    }
}
