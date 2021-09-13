import java.util.Scanner;
public class Employee_Runner {
    public static float PNDW;
    public static float dailyRate;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Fname,Lname,Minitial;
        //Enter name
        System.out.println("Please Enter Your First name: ");
        Fname = sc.next();
        System.out.println("Please Enter Your Middle name: ");
        Minitial = sc.next();
        System.out.println("Please Enter Your Last name: ");
        Lname = sc.next();

        System.out.println("Hello "+Lname+", "+Fname+" "+Minitial);
        System.out.print("""
                1. Regular Employee
                2. Contractual Employee
                3. Exit
                choice:
                """);
        int choice;
        choice = sc.nextInt();
        while (true){
            switch (choice){
                case 1 -> {
                    System.out.println("Number of days worked: ");
                    PNDW = sc.nextFloat();
                    System.out.println("Daily Rate: ");
                    dailyRate = sc.nextFloat();
                    System.out.println("Salary: "+Regular_Employee.Rsalary());
                    System.out.println("Deduction: "+Regular_Employee.Rdeduction());
                    main(null);
                }
                case 2 -> {
                    System.out.println("Number of days worked: ");
                    PNDW = sc.nextFloat();
                    System.out.println("Daily Rate: ");
                    dailyRate = sc.nextFloat();
                    System.out.println("Salary: "+Contractual_Employee.Csalary());
                    System.out.println("Deduction: "+Contractual_Employee.Cdeduction());
                    main(null);
                }
                case 3 -> System.exit(0);
                default -> main(null);
            }
        }
    }
}
/*Regular Employee
salary is sum of
basic pay (product of number of days worked and daily rate)
overtime pay (product of number of overtime hours and 15% of daily rate)
deduction is from 20% of monthly salary (product of daily rate * 20)
Contractual Employee
salary is product of days worked and daily rate
deduction is a constant 1250
Each employee is a person with first, middle and last name details.
Ensure that every employee can be computed with the following details

salary where number of days and overtime hours worked are accepted as input
deduction with no parameters*/