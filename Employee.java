public class Employee extends Person implements Payable{
    private String position;
    private double salary;
    public Employee(){

    }
    public Employee(String name, String surname, String position,double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }


    public void setPosition(String position){
        this.position = position;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String getPosition(){
        return position;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
