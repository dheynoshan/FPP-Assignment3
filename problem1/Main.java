package problem1;

public class Main {
    public static void main(String[] args){
        Address ad1 = new Address("test", "Chicago","test","123456");
        Address ad2 = new Address("test", "Chicago","test","123456");
        Address ad3 = new Address("test", "test","test","123456");
        Address ad4 = new Address("test", "test","test","123456");
        Address ad5 = new Address("test", "Chicago","test","123456");
        Address ad6 = new Address("test", "test","test","123456");

        Customer cust1 = new Customer("Joe", "Root","987654321");
        Customer cust2 = new Customer("Daniel", "Vitory","912837465");
        Customer cust3 = new Customer("Paul", "Helms","198237465");

        cust1.setBillingAddress(ad1);
        cust1.setShippingAddress(ad2);
        cust2.setBillingAddress(ad3);
        cust2.setShippingAddress(ad4);
        cust3.setBillingAddress(ad5);
        cust3.setShippingAddress(ad6);

        Customer[] custArray = {cust1, cust2, cust3};

        for (Customer cus: custArray) {
            if(cus.getBillingAddress().getCity().equals("Chicago")){
                System.out.println(cus.toString());
                System.out.println("City of the billing address is " + cus.getBillingAddress().getCity());
            }
        }
    }
}
