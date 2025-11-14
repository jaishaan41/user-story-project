import java.util.Scanner;

public class DataRunner {
    public static void main(String[] args) {

        // creates analyzer object
        SalaryAnalyzer analyzer = new SalaryAnalyzer();

        // prints each major
        System.out.println("\n--- Majors ---");
        for (int i = 0; i < analyzer.getNumMajors(); i++) {
            System.out.println(analyzer.getMajorInfo(i));
        }

        // prints major with highest pay
        System.out.println("\n" + analyzer.gethighestAveragePay());
    }
}