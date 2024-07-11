package section09.practice.practice01;
/*
이름: 김일남, 성적: 85
이름: 김이남, 성적: 92
 
 */
class Student {
    String name;
    int score;
    Student(String name) {
        this.name = name;
    }
    void setScore(int score) {
        this.score = score;
    }
    void printInfo() {
        System.out.println("이름: " + name + ", 성적: " + score);
    }
}
public class Practice0901 {
    public static void main(String[] args) {
        Student student1 = new Student("김일남");
        Student student2 = new Student("김일남");
        student1.setScore(85);
        student2.setScore(92);
        student1.printInfo();
        student2.printInfo();
    }
}