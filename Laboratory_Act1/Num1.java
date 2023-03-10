import java.io.*;

public class Num1 {
    public static void main(String[] args) throws IOException, FileNotFoundException{

        int sum = 0;
        
        try (BufferedReader data = new BufferedReader(new FileReader("data.txt"))) {
            String text;
            
            while ((text = data.readLine()) != null) {
             
                System.out.println(text);
                sum += Integer.parseInt(text);

            }
        } catch (IOException e) {
        
            System.out.println("Something went wrong " + e.getMessage());
        }
    
        try (PrintWriter pw = new PrintWriter(new FileWriter("sum.txt"))) {
       
            pw.println(sum);
            System.out.println("File sum created succesfully");
            
        } catch (IOException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }
    }
}
