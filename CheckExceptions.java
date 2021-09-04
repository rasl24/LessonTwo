package lessonTwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckExceptions
{
    public static void main(String[] args)
    {
        //  InputStream открывает поток
        // FileInputStream для чтения данных из файла
        // в скобках название файла
        try {
            int a = 1 / 0;
            InputStream is = new FileInputStream("li;lij");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("I'm alive");
    }
}
