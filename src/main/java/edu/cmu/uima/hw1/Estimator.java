package edu.cmu.uima.hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Estimator {
  
  public void estimate(File file1, File file2) {
    
    try {
      // Create two scanner
      Scanner scanner1 = new Scanner(file1);
      Scanner scanner2 = new Scanner(file2);
      
      // This part is for sample.out
      int size1 = 0;
      
      Map<String, String> map = new HashMap<String, String>();
      
      while (scanner1.hasNextLine()) {
        String line = scanner1.nextLine();
        map.put(line, line);
        size1++;
      }
      
      scanner1.close();
      
      // This part is for my output
      int size2 = 0;
      int relcnt = 0;
      
      while (scanner2.hasNextLine()) {
        String line = scanner2.nextLine();
        // Check whether such entry already exists
        if (map.containsKey(line)) {
          relcnt++;
        }
        size2++;
      }
      
      // Calculate metrics
      double precision = (relcnt + 0.0) / size2;
      double recall = (relcnt + 0.0) / size1;
      double f1 = 2 * precision * recall / (precision + recall);
      
      System.out.println("precision: " + precision);
      System.out.println("recall: " + recall);
      System.out.println("f1: " + f1);
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] argv) {
    Estimator estimator = new Estimator();
    estimator.estimate(new File("src/main/resources/data/out/sample.out"), new File("src/main/resources/data/processed/hw1-yuliangy.out"));
  }

}
