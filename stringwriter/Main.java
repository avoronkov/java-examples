import java.io.*;

/**
 * Created by avoronkov on 16.02.17.
 * Capture the output to PrintStream
 */


public class Main {
    public static void main(String[] args){
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(os);
            printSmth(ps);
            String content = os.toString("UTF-8");
            System.out.println(content);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public static void printSmth(PrintStream out) {
        out.println("Something");
    }
}
