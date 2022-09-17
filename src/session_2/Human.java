package session_2;

public class Human {

    public Human(){
        System.out.println("Run constructor");
    }

    public Human(String y){
        System.out.println("Run constructor" + y);
    }
    public void run(){
        System.out.println("Run: 5km/h");
    }
    public void run (int x) {
        for(int i=1; i>0; i++){
            System.out.println("Run:" + i);
            System.out.print("\b\b\b\b\b");
        }
    }
    public void run (int x, String y) {
        System.out.println("Run: 15km/h");
    }
    public void run (String y, int x) {
        System.out.println("Run: 20km/h");
    }
}
