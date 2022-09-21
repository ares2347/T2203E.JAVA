package hw_ss3;


public class DomesticCustomer extends Customer{
    public enum Type {
        DOMESTIC,
        BUSINESS,
        PRODUCTION
    }
    public float usage;

    public int price;

    public float quota;

    public Type type;

    public DomesticCustomer() {
    }

    public DomesticCustomer(float usage, int price, float quota) {
        this.usage = usage;
        this.price = price;
        this.quota = quota;
    }

    public DomesticCustomer(String id, String lastName, String firstName, String date, Type type, float usage, int price, float quota) {
        super(id, lastName, firstName, date);
        this.usage = usage;
        this.price = price;
        this.quota = quota;
        this.type = type;
    }

    public float total(){
        return total(this.usage, this.quota, this.price);
    }
}
