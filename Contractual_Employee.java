public class Contractual_Employee {
    public static float Csalary(){
        float bp = Regular_Employee.basicPay(Employee_Runner.PNDW, Employee_Runner.dailyRate);
        float otp = Regular_Employee.overtimePay(Employee_Runner.PNDW, Employee_Runner.dailyRate);
        return bp * otp;
    }
    public static float Cdeduction(){
        return (float) ((1250 / 30) * 20);
    }
}
/*
-Contractual Employee
    salary is product of days worked and daily rate
    deduction is a constant 1250

Each employee is a person with first, middle and last name details.
Ensure that every employee can be computed with the following details

    salary where number of days and overtime hours worked are accepted as input
    deduction with no parameters
Apply encapsulation in classes where every data is editable.*/
