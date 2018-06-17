package interop;

public class CustomerJava {
    public String customerName;

    public CustomerJava(String customerName) {
        this.customerName = customerName;
    }

    public void printCustomerName() {
        System.out.println(customerName);
    }

    public static void main(String... args) {
        System.out.println("CUSTOMERJAVA");
    }


}
