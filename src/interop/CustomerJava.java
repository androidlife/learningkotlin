package interop;

public class CustomerJava implements Cloneable {
    public String customerName;

    public CustomerJava(String customerName) {
        this.customerName = customerName;
    }

    public void printCustomerName() {
        System.out.println(customerName);
    }

    public static void main(String... args) {
        System.out.println("CUSTOMERJAVA");
        CustomerJava customerJava = new CustomerJava("CUSTOMER");
        //CustomerJava customerJava1 = customerJava.clone();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
