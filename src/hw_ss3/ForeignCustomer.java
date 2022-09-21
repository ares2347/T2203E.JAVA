package hw_ss3;

public class ForeignCustomer extends  Customer{
    public float usage;

    public int price;

    public String nation;

    public ForeignCustomer(float usage, int price, String nation) {
        this.usage = usage;
        this.price = price;
        this.nation = nation;
    }

    public ForeignCustomer(String id, String lastName, String firstName, String date, float usage, int price, String nation) {
        super(id, lastName, firstName, date);
        this.usage = usage;
        this.price = price;
        this.nation = nation;
    }

    public float total(){
        return total(this.usage, 2000, this.price);
    }
}
