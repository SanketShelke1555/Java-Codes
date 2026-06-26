import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptionclass {

    public static void main(String[] args) throws FileNotFoundException {
        
       try( FileReader f1 = new FileReader("D:\\Rohit.txt");
        BufferedReader br = new BufferedReader(f1);)
         {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

}
