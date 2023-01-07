public class Customer {
    String name;
    Long contactNo=874837485L;
    String email="test@gmeil.com";

    public void getMessage(){
        System.out.println("Get message is called");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", contactNo=" + contactNo +
                ", email='" + email + '\'' +
                '}';
    }
}
