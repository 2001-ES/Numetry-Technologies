import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileinputStream {
    public static void main(String args[]) throws IOException {

        File file = new File("C:\\Users\\kmc\\OneDrive\\Desktop\\deco\\text.txt");
        FileInputStream inputStream = new FileInputStream(file);
        byte bytes[] = new byte[(int) file.length()];
        int numOfBytes = inputStream.read(bytes);
        System.out.println("Data copied successfully...");
    }
}