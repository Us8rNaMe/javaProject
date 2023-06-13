package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFife {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/Textfile.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                if(!line.equals("")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Something wrong with the given file: " + fileName);
            e.printStackTrace();
        }
    }
}