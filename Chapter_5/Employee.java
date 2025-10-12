class Employee {

    int empNumber;
    double payRate;
    double hoursWorked;

    final int MAX_EMP_NUMBER = 9999;
    final double MAX_RATE = 60.00;
    final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int number, double rate, double hours) {
        empNumber = number;
        payRate = rate;
        hoursWorked = hours;
    }

    public double getRegularPay() {
        double regularPay;
        if (hoursWorked <= 40) {
            regularPay = hoursWorked * payRate;
        } else {
            regularPay = 40 * payRate;
        }
        return regularPay;
    }

    public double getOvertimePay() {
        double overtimePay;
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * payRate * OVERTIME_MULTIPLIER;
        } else {
            overtimePay = 0;
        }
        return overtimePay;
    }
}