import java.util.Scanner;

public class SalaryAnalyzer {

    
    private String[] majors;         // names of majors
    private int[] earlyCareerPay;    // early-career salaries
    private int[] midCareerPay;      // mid-career salaries

  //no arguemnt constuctor
    public SalaryAnalyzer() {
        majors = new String[] {
            "Petroleum Engineering",  "Computer Science", "Mechanical Engineering", "Electrical Engineering", "Finance", "Economics", "Nursing", "Psychology", "History",  "English Language & Literature"
        };

        earlyCareerPay = new int[] {
            98100, 74000, 70000, 70000, 60000,  60000, 55000, 42000, 50000, 48000
        };

        midCareerPay = new int[] {
            212100, 105000, 105000, 109000, 100000, 100000, 75000, 65000, 70000, 65000
        };
    }

 //parameterized constucor
    public SalaryAnalyzer(String[] m, int[] early, int[] mid) {
        majors = m;
        earlyCareerPay = early;
        midCareerPay = mid;
    }

 //reutrns majors 
    public int getNumMajors() {
        return majors.length;
    }

 //calculates avergae salary of early+mid pay
    public int getAveragePay(int index) {
        return (earlyCareerPay[index] + midCareerPay[index]) / 2;
    }

  //returns all the info
    public String getMajorInfo(int index) {
        return majors[index] + ": Early $" + earlyCareerPay[index] +
               " | Mid $" + midCareerPay[index] +
               " | Avg $" + getAveragePay(index);
    }

  //calculates major with highest pay
    public String gethighestAveragePay() {
        int maxIndex = 0;
        for (int i = 1; i < majors.length; i++) {
            if (getAveragePay(i) > getAveragePay(maxIndex)) {
                maxIndex = i;
            }
        }
        return majors[maxIndex] + " has the highest average salary: $" + getAveragePay(maxIndex);
    }
}



  
