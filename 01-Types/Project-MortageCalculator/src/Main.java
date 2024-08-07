import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte Months = 12;
        final byte Percent = 100;
        Scanner input = new Scanner(System.in);

        System.out.print("Principal: "); // double
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate: "); // float
        float annualRate = input.nextFloat();
        float monthlyRate = annualRate / Percent / Months;

        System.out.print("Period (Years): "); // int
        byte years = input.nextByte();

        int numberOfPayments = years * Months;

        double mortgage = principal
                * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        System.out.printf("Mortgage: %.2f", mortgage); // float
    }
}