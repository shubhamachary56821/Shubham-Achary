com.company;

class Company{
    float earning;
    float companyMargin = 10000000;
    float EmployeeSalary;

    public float getEarning(){
        return earning;
    }
    public void setEarning(float earning){
        this.earning = earning;
    }
   public void SalaryDistribution(){
        if(earning >= companyMargin){
            EmployeeSalary = (earning/10000)+ EmployeeSalary * 12;
            System.out.println("salary paid to each employee is" + EmployeeSalary);
        }else if(earning<companyMargin){
            EmployeeSalary = earning/ 10000;
        }
    }

}
import java.util.Scanner;
class Employee extends Company{
    String name;
    float salary;
    int age;
    String ranking;
    String Address;
    int WorkingDays;
    int attendance;
    String language = "java";

    public Employee(String myName, float mySalary, int myAge, String myRanking,String myAddress, int myWorkingDays, int myAttendance){
        this.name = myName;
        this.salary = mySalary;
        this.age = myAge;
        this.ranking = myRanking;
        this.Address = myAddress;
        this.WorkingDays = myWorkingDays;
        this.attendance = myAttendance;
    }
    public Employee(String myLang){
        this.language = myLang;
    }
    public void printDetails(){
        System.out.println("Name of the Employee " + name);
        System.out.println("age: " + age);
        System.out.println("Ranking " + ranking);
        System.out.println("Address " +  Address);
        System.out.println("Attendance " + attendance +" days");
        if(WorkingDays<=attendance){
            float s = salary*10;
            System.out.println("salary is increased X10 , and new is: $" + s);
        }else System.out.println("you are going to get the same salary = $"+salary );

    }
}

public class Employees {
    public static void main(String[] args){
        Company c = new Company();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input the Monthly Earning of your company");
        float inputEarning = Sc.nextInt();
        c.setEarning(inputEarning);
        c.SalaryDistribution();
        Employee E = new Employee("Shubham", 5700, 18, "Intern!",
                "Campus No-8 KIIT's University Bhubaneshwar", 250, 250);

        E.printDetails();
        String myLang = Sc.next();
        System.out.println(myLang);
    }
}
