public class Employee {
    int employeeNumber;
    double payRate;
    double hoursWorked;
    final double OVERTIME_RATE = 1.5;

    Employee(int empNum, double rate, double hours) {
        if (empNum > 9999)
            empNum = 9999;
        if (rate > 60.00)
            rate = 60.00;

        employeeNumber = empNum;
        payRate = rate;
        hoursWorked = hours;
    }

    double getRegularPay() {
        if (hoursWorked <= 40)
            return hoursWorked * payRate;
        else
            return 40 * payRate;
    }

    double getOvertimePay() {
        if (hoursWorked > 40)
            return (hoursWorked - 40) * payRate * OVERTIME_RATE;
        else
            return 0;
    }
}