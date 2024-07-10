package section09;

public class UnclearOverloading {
    String s;
    int a;
    int b;

    UnclearOverloading(){
        this.s = "java";
        this.a = 1;
        this.b = 2;
    }

    UnclearOverloading(String s, int a, int b){
        this.s = s;
        this.a = a;
        this.b = b;
    }

    UnclearOverloading( int b, int a,String s){
        this.s = s;
        this.a = a;
        this.b = b;
    }



    void printField(){
        System.out.printf("s = %s, a = %d, b = %d\n", s, a, b);
    }
}
