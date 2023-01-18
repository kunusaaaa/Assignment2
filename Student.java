public class Student extends Person implements Payable{
    private double gpa;
    private String position;

    public Student(){

    }
    public Student(String name, String surname, String position, double gpa){
        super(name, surname);
        setPosition(position);
        setGpa(gpa);
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public void setPosition(String position){
        this.position = position;
    }
    @Override
    public String getPosition(){
        return position;
    }
    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67){
            return 36660.00;
        }
        return 0;
    }
}
