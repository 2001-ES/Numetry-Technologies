import java.io.*;

public class BIS {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\kmc\\OneDrive\\Desktop\\deco\\text.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
