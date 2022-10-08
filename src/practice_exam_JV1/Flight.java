package practice_exam_JV1;

public class Flight {
    public int number;
    public String destination;

    public Flight() {
        this.number = 0;
        this.destination = null;
    }

    public Flight(int number, String destination) {
        try {
            if(number <= 0)
                throw new Exception("The flight number should be positive-valued!");
            else {
                this.number = number;
                this.destination = destination;
            }
        }catch (Exception e){}
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void display(){
        System.out.println(getNumber() + ", " + getDestination());
    }


}
