package program;

import entities.Individual;
import entities.Company;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Application {
    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.print("Enter the number of Tax Payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + "data:");
            System.out.print("Individual or Company (i/c)?");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual Income: ");
            Double annualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                Individual individual = new Individual(name, annualIncome, healthExpenditures);
                list.add(individual);

            } else {
                System.out.print("Number of Employees: ");
                Integer numberOfEmployees = sc.nextInt();
                Company company = new Company(name, annualIncome, numberOfEmployees);
                list.add(company);
            }


        }
        System.out.println();
        System.out.println("TAX PAID: ");
        for (TaxPayer tp: list){
            System.out.println(tp.getName() + ": $" + String.format("%.2f", tp.tax()));
        }
        double sum = 0.0;
        for (TaxPayer tp: list){
            sum += tp.tax();
        }
        System.out.println();
        System.out.println("Total Taxes: $" + String.format("%.2f", sum));


        sc.close();
    }
}
