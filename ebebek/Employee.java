package ebebek;

public class Employee {
    private final String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double taxAmount = 0;
        if (this.salary > 1000){
            taxAmount =  this.salary * 0.03;
        }
        return taxAmount;
    }

    public double bonus(){
        double bonusAmount = 0;
        if(this.workHours > 40){
           bonusAmount =   (this.workHours - 40) * 30;
        }
        return bonusAmount;
    }
    public void raiseSalary(){
        int currentYear = 2021;
        int totalWorkYear = currentYear - this.hireYear;
        double extraAmount =  bonus() ;

        if (totalWorkYear < 10)
            this.salary += (this.salary * 0.05);

        else if (totalWorkYear > 10 && totalWorkYear < 20)
            this.salary += (this.salary*0.1);

        else if (totalWorkYear > 19)
            this.salary += (this.salary*0.15);
        
        extraAmount -= tax();

        this.salary += extraAmount;
    }


    public String toString() {
        return "Employee " +
                "name= '" + name + '\'' +
                ", salary =" + salary +
                ", workHours =" + workHours +
                ", hireYear =" + hireYear +
                ", bonus =" + bonus() +
                ", tax =" + tax() +
                '}';
    }
}
