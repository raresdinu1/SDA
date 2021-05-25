import java.util.Objects;

public class StudInfo {
    private  String firstName;
    private  String lastName;
    private  Double gradeRo;
    private  Double gradeMath;

    public StudInfo(String firstName, String lastName, Double gradeRo, Double gradeMath){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeRo = gradeRo;
        this.gradeMath = gradeMath;
    }
   public  String getFirstName() {
      return firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public  Double getGradeRo() {
        return gradeRo;
    }

    public  Double getGradeMath() {
        return gradeMath;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGradeRo(Double gradeRo) {
        this.gradeRo = gradeRo;
    }

    public void setGradeMath(Double gradeMath) {
        this.gradeMath = gradeMath;
    }

    @Override
    public String toString() {
        return  "Nume: " + lastName + '\n' +
                "Prenume: " + firstName + '\n' +
                "Nota la Limba Romana: " + gradeRo + '\n' +
                "Nota la Matematica: " + gradeMath;
    }

}
