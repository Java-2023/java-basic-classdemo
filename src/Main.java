public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer);
        customer.getMessage();
        customer.name="David";
        System.out.println(customer);
    }
}
