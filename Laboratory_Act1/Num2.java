import java.io.*;

public class Num2 {
  public static void main(String[] args) throws IOException, FileNotFoundException{

    try (BufferedReader br = new BufferedReader(new FileReader("dummy.txt"))) {
      String text;

     int lines = 0;

      while ((text = br.readLine()) != null && lines < 5) {
        System.out.println(text);
        
        lines++;
      }
      }

      catch(IOException e){
       System.out.println("Something went wrong");  

     }
      
    } 
  }

