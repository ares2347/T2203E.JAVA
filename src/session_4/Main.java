package session_4;

import hw_ss3.Customer;
import hw_ss3.DomesticCustomer;
import hw_ss3.ForeignCustomer;

public class Main {
    public static void main(String[] args){
        Customer c = new Customer("C01","Lennon", "John", "04/03/2002" );
        DomesticCustomer d = new DomesticCustomer("D01", "Lennon", "John", "04/03/2002", DomesticCustomer.Type.DOMESTIC, 2300,800, 1500 );
        ForeignCustomer f = new ForeignCustomer("F01", "Lennon", "John", "04/03/2002", 2300,800, "US" );


        //upcasting
        Customer c1 = (Customer) d;

        System.out.println(c1.getFirstName());
    }
}
