import java.io.*;

public class Num3 {
    public static void main(String[]args) throws IOException{

    int vowels= 0;

    try (BufferedReader br = new BufferedReader(new FileReader("dummy.txt"))) {

        for (int i = 0; i < 5; i++) {
            String file = br.readLine();

            if (file == null) {
                
                break;
            }

            vowels += countVowels(file);
        }
    }

    catch (IOException e) {
           System.out.println("Something went wrong");
    }
        System.out.println(vowels);
    }
    
    public static int countVowels(String s) {

      int count = 0;

      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          count++;
        }
      }
      return count;
    }
    }
    
