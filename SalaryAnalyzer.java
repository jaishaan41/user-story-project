import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class SalaryAnalyzer {

//instance variables
  private String[] major;    
  private int[] earlycareerpay;
  private int[] midcareerpay;

  //noarugment cosntrucotr
public SalaryAnalyzer () {
  major = FileReader.toStringArray("major.txt");
  earlycareerpay = FileReader.toIntArray("earlycareerpay.txt");
  midcareerpay = FileReader.toIntArray("midcareerpay.txt");  
  
}


  
//parameterized constructor
  
  public SalaryAnalyzer(String[] mmajors, int[] eearlycareerpay, int[] mmidcareerpay) {
    major = mmajors;
    earlycareerpay = eearlycareerpay;
    midcareerpay = mmidcareerpay;
    }




//finds the average pay per major based on the early and mid career pay
public int[] averagepaypermajor() {
  int [] avgpaypermajor = new int [earlycareerpay.length];
  for (int i = 0; i< earlycareerpay.length; i++) {
    avgpaypermajor[i] = (earlycareerpay[i] + midcareerpay[i]) / 2;
  }
  return avgpaypermajor;
}


public String majorwithhighestpay() {
  int [] aavgpermajor = averagepaypermajor();
  int j = 0;
  for (int i = 1; i < aavgpermajor.length; i++) {
    if (aavgpermajor[i] > aavgpermajor[j]) {
      j=i;
    }
  }
  return major[j];
}


public void majorswithsalaries() {
int [] avg = averagepaypermajor();
System.out.println("Major / Average Pay");
  for (int i = 0; i < major.length; i++) {
    System.out.println( major[i] + "/ $" + avg[i]);
  }
}

  



public String toString() {
 return "average pay per major: " + averagepaypermajor() +  "Major with Highest Average Pay: " + majorwithhighestpay();  
}





  
  }



















  
  




  
