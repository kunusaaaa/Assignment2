public abstract class Person implements Comparable<Person>, Payable{
    private static int iD = 1;
    private int id = 0;
    private String name;
    private String surname;
    public Person(){
        id = iD++;
    }
    public Person(String name, String surname){
        id = iD++;
        setName(name);
        setSurname(surname);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }


    public abstract String getPosition();

    @Override
    public String toString(){
        return id + "." + name + " " + surname;
    }


    public abstract double getPaymentAmount();

    @Override
    public int compareTo(Person o) {
        if (this.getPaymentAmount() > o.getPaymentAmount()){
            return 1;
        }else return -1;
    }
}
