package Ex3;

public class Customer {
    private Adress adress;
    private PaymentMethod paymentMethod;
    private String firstname;
    private String lastname;
    private Integer age;

    public Customer(Adress adress, PaymentMethod paymentMethod, String firstname , String lastname, Integer age){
        this.adress = adress;
        this.paymentMethod = paymentMethod;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }

    public Adress getAdress() {
        return adress;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getAge() {
        return age;
    }
    public String getCompleteName(){
        return getFirstname() + " " + getLastname();
    }
}

