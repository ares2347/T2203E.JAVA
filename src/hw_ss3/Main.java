package hw_ss3;

public class Main {
    public static void main(String[] args){
        Customer c = new Customer();
        DomesticCustomer d = new DomesticCustomer("F01", "Lennon", "John", "04/03/2002", DomesticCustomer.Type.DOMESTIC, 2300,800, 1500 );
        ForeignCustomer f = new ForeignCustomer("F01", "Lennon", "John", "04/03/2002", 2300,800, "US" );
        System.out.println(d.total());
        System.out.println(f.total());


    }
}
