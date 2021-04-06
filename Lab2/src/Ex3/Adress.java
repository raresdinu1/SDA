package Ex3;

public class Adress {

    private String str;
    private String city;
    private int number;

    public Adress(String str, String city, int number){
        this.str = str;
        this.city = city;
        this.number = number;

    }
    public String getStr() {
        return str;
    }

    public String getCity() {
        return city;
    }

    public int getNumber() {
        return number;
    }


    public String showFullAdress(){
        return getCity() + ", " + getStr() + ", " + getNumber();
    }


}
