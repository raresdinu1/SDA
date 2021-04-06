package Ex3;

public class main {
    public static void main (String[] args){
        Adress adress = new Adress("Primăriei" , "Ovidiu" , 44);
        PaymentMethod paymentMethod = new PaymentMethod("MasterCard");
        Customer customer = new Customer(adress, paymentMethod , "Rareș" , "Dinu" , 21);

        System.out.println(customer.getCompleteName());
        System.out.println(customer.getAdress().showFullAdress());
        System.out.println(customer.getPaymentMethod().getType());
        System.out.println(customer.getFirstname() + " Have " + customer.getAge()+" years old.");
    }
}
