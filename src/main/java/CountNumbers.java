import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        BufferedReader reader;
        double sum =0;
        try {
            reader = new BufferedReader(new FileReader(
                    "/Users/ysereda/IdeaProjects/countNumbers/src/main/resources/file.txt"));
            String line = reader.readLine();
            while (line != null) {
                if(!line.contains("#")){
                    sum+=Double.parseDouble(line);

                }
                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }
}







