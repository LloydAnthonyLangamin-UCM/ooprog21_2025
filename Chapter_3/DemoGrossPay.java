class DemoGrossPay {

    public static void calculateGross(double hoursWorked, double hourlyRate) {
        double TotalPayment = hoursWorked * hourlyRate;
        System.out.println(hoursWorked + "hours at $" + hourlyRate + "per hour is $" + TotalPayment);
    }

    public static void main(String[] a) {
        calculateGross(50, 22.75);
        calculateGross(150, 22.75);
        calculateGross(170, 22.75);
    }
}