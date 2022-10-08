package practice_exam_JV1;

public class Main {
    public static void main(String[] args){
        Bank b = new Bank(1000, 10);
        System.out.println(b.calculateInterest());

        Flight f1 = new Flight();
        Flight f2 = new Flight(-2, "");
        Flight f3 = new Flight(857, "Toronto");
        f1.display();
        f2.display();
        f3.display();
    }
}
