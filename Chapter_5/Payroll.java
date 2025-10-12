import java.util.Scanner;

class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empNum = input.nextInt();

        System.out.print("How many hours did you work this week? ");
        double hours = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        Employee emp = new Employee(empNum, rate, hours);

        double regularPay = emp.getRegularPay();
        double overtimePay = emp.getOvertimePay();
        System.out.println("Regular pay is $" + regularPay);
        System.out.println("Overtime pay is $" + overtimePay);

        input.close();
    }
}