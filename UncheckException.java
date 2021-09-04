package lessonTwo;

public class UncheckException
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 0;

        try
        {
            int c = a / b;
        }

        catch(RuntimeException e)
        {
            System.out.println("Исключение");
        }

        if (b != 0)
        {
            int c = a / b;
        }
    }
}
