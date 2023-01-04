import java.io.*;
import java.util.Scanner;

public class Num4 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Please enter the file name: ");
      String fileName = scanner.nextLine();

      try {
        File file = new File(fileName);
        Scanner fileScanner = new Scanner(file);
        int wordCount = 0;

        while (fileScanner.hasNext()) {
          String word = fileScanner.next();
          wordCount++;
        }

        System.out.println(wordCount);
        fileScanner.close();
      } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());

      
      }
    }
  }
}
