import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_YEAR = 12;
        final byte PERCENT = 100;
        System.out.println("\nWelcome to Mortgage Calculator!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        float annualPercent = scanner2.nextFloat();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Period (Years): ");
        byte period = scanner3.nextByte();

        double monthlyRate = (annualPercent / PERCENT)/MONTHS_YEAR;
        double numberPayments = period * MONTHS_YEAR;

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate, numberPayments))
        / (Math.pow(1 + monthlyRate, numberPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}

