public class Regular_Employee {
    public static float basicPay(float prod, float dR) {
        Employee_Runner.PNDW = prod;Employee_Runner.dailyRate = dR;
        return prod*dR;
    }
    public static float overtimePay(float prod, float dR){
        Employee_Runner.PNDW = prod;Employee_Runner.dailyRate = dR;
        return (dR*0.15f/100f)*prod;
    }
    public static float Rsalary(){
        float bp = basicPay(Employee_Runner.PNDW, Employee_Runner.dailyRate);
        float otp = overtimePay(Employee_Runner.PNDW, Employee_Runner.dailyRate);
        return bp + otp;
    }
    public static float Rdeduction(){
        return (basicPay(Employee_Runner.PNDW,Employee_Runner.dailyRate) / 30) * 20;
    }
}
/*
-Regular Employee
    salary is sum of
        basic pay (product of number of days worked and daily rate)
        overtime pay (product of number of overtime hours and 15% of daily rate)
    deduction is from 20% of monthly salary (product of daily rate * 20)

Each employee is a person with first, middle and last name details.
Ensure that every employee can be computed with the following details

    salary where number of days and overtime hours worked are accepted as input
    deduction with no parameters
Apply encapsulation in classes where every data is editable.*/