package session_3;

public class Dog extends Animal{
    public void eat(){

    }

    public Dog() {
    }

    public Dog(int id, String name) {
        super(id, name);
    }

    public void fetch(){
        super.run();
    }
}
