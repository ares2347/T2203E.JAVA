package hw_ss3;

public class Customer {
    public String id;
    public String lastName;
    public String firstName;
    public String date;

    public Customer() {
    }

    public Customer(String id, String lastName, String firstName, String date) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float total (float usage, float quota, int price) {
        if(usage <= quota) {
            return usage*price;
        } else {
            float overuse = usage - quota;
            return (
                    price*quota
                            + 1000*(overuse<=50? overuse: 50)
                            + 1200*(overuse>50? overuse <=100? overuse-50 : 50 : 0 )
                            + 1500*(overuse>100? overuse<=200? overuse-100: 100 : 0)
                            + 2000*(overuse>200? overuse-200:0)
            );
        }
    }
}
