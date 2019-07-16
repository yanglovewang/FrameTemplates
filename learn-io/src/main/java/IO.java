import java.io.*;

public class IO {

    public static void main(String[] args) throws FileNotFoundException {
      //  FileInputStream fileInputStream = new FileInputStream("file.txt");
        try {
            InputStreamReader re = new InputStreamReader(System.in, "GBK");
            char[] c = new char[10];
            while (re.read(c) != -1) {
                System.out.println(c);
            }
            re.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
