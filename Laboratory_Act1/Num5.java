import java.io.*;
import java.util.*;

public class Num5 {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    try (
    Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the input file name: ");
      String inputFileName = sc.nextLine();
      System.out.print("Enter the output file name: ");
      String outputFileName = sc.nextLine();

      
      File inputFile = new File(inputFileName);
      Scanner input = new Scanner(inputFile);

      
      FileWriter outputFile = new FileWriter(outputFileName);
      PrintWriter output = new PrintWriter(outputFile);

      
      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] words = line.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
          output.print(words[i] + " ");
        }
        output.println();
      }

      
      input.close();
      output.close();
    }
  }
}
