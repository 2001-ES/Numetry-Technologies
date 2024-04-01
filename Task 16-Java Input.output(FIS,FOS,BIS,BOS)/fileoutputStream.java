import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class fileoutputStream {
   public static void main(String args[]) throws IOException {
      
      File file = new File("C:\\Users\\kmc\\OneDrive\\Desktop\\deco\\text.txt");
      FileInputStream inputStream = new FileInputStream(file);
      byte bytes[] = new byte[(int) file.length()];
      int numOfBytes = inputStream.read(bytes);
      System.out.println("Data copied successfully");
      FileOutputStream outputStream = new FileOutputStream("C:\\Users\\kmc\\OneDrive\\Desktop\\deco\\text.txt");
      outputStream.write(bytes);
      System.out.println("Data written successfully");
   }
}