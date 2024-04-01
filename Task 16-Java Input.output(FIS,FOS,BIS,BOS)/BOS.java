import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BOS {
    public static void main(String[] args) {

        String data = "Java is a platform independent language";
 try {
           FileOutputStream file = new FileOutputStream("C:\\Users\\kmc\\OneDrive\\Desktop\\deco\\b.txt");
             BufferedOutputStream output = new BufferedOutputStream(file);
             byte[] array = data.getBytes();
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}