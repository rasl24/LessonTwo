package lessonTwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ALotOfExceptions {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            String[] rows = {"sada", "few"};
            String row = rows[2];
            InputStream is = new FileInputStream("li;lij");
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (StackOverflowError err) {
            err.printStackTrace();
        }
    }
    public static void test() {
        test();
    }
}
