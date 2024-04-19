import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            String data = "test ahahaha!!!";
            writer.write(data);
            writer.close();
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
