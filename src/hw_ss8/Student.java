package hw_ss8;

public class Student {
    public String name;
    public String email;
    public int mark;

    public Student(String name, String email, String mark) {
        this.name = name;
        this.email = email;
        this.mark = Integer.parseInt(mark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String toString (){
        return getName() + " - " + getEmail() + " - " + getMark();
    }
}
