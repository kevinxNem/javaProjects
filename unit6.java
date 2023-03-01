import java.lang.String;
import java.util.Scanner;
//Writing a program without inheritence

class Company{
    final int SIZE = 100;
    private Salaried [] salaryList;
    private HourlyPaid [] hourList;
    //referencing arrays^^^^^^^^^

    public Company(){
        salaryList = new Salaried[SIZE];
        hourList = new HourlyPaid[SIZE];

        salaryList[3]= new Salaried("Kevin Nembhard", "5382403", 300.75);
        hourList[3]= new HourlyPaid("Ericka Smithenson","ES11510", 12.5, 17.5);

        for(int i = SIZE; i < SIZE; i++){
            salaryList[i] = null;
            hourList[i] = null;
        }

    
    }
    public void printSalaried(){
        System.out.println("\nLIST OF SALARY EMPLOYEES:");
        for(Salaried s: salaryList)
            if (s != null) System.out.println(s);
    }

    public void printHourly(){
        System.out.println("\nLIST OF HOURLY EMPLOYEES:");
        for(HourlyPaid h: hourList)
            if (h != null) System.out.println(h);
    }

    public boolean addSalaried(Salaried salaried){
        for (int i = 0; i<SIZE; i++){
            if (salaryList[i]==null){
                salaryList[i]=salaried;
                return true;
            }
        }
        return false;
    }

}

class HourlyPaid{
    private String name;
    private String id;
    private double hoursWorked;
    private double payRate;
    //_______________________________
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    //____________________________
    public HourlyPaid(String name, String id, double hoursWorked, double payRate) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return "Hourly Pay [name=" + name + ", id=" + id + ", hoursWorked=" + hoursWorked + ", payRate=" + payRate
                + "]";
    }
    //___________________________
    
    public void printCheck(){
        printHead();//calling header method

        System.out.println(id+ ": "+ name);
        System.out.println("Net Pay: "+ payRate * hoursWorked);
    }
    private static void printHead(){
        System.out.println("_______________________________");
        System.out.println("Kevin's Company & co");
        System.out.println("42069 Mainwell Street 10453");
        System.out.println("Fufilling tomorrow's promises");
        System.out.println("_______________________________");
    }
}

class Salaried{
    private String name;
    private String id;
    private double salary;
    //______________________________
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //setting constructors
    public Salaried(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Salaried(){
        salary = -1;
    }

    @Override
    public String toString(){
        return "Salaried [name="+ name +", id ="+ id + ", salary=" + salary +"]";
    }
    //__________________________________________________________

    public void printCheck(){
        printHead();//calling header method

        System.out.println(id+ ": "+ name);
        System.out.println("Net Pay: "+ String.format("$%.2f",salary));
    }
    private static void printHead(){
        System.out.println("_______________________________");
        System.out.println("Kevin's Company & co");
        System.out.println("42069 Mainwell Street 10453");
        System.out.println("Fufilling tomorrow's promises");
        System.out.println("_______________________________");
    }
} 


public class unit6{
    public static void main(String[] args){
            Salaried s1, s2;
            s1= new Salaried();
            s2= new Salaried("Kevin Nembhard", "5382403", 300.75);
           
            s2.setSalary(s2.getSalary()*0.333333);
            System.out.println("Here's a test for salary input:");
            s2.printCheck();

            System.out.printf("\n\n");

            HourlyPaid h1, h2= new HourlyPaid("Ericka Smithenson","ES11510", 12.5, 17.5);
            System.out.println("Here's a test hourly pay input:");
            h2.printCheck();

            Company comp = new Company();
            comp.addSalaried(s2);
            comp.addSalaried(new Salaried("Aaron Ford", "AF1151", 15));

            comp.printHourly();
            comp.printSalaried();



    }

}
