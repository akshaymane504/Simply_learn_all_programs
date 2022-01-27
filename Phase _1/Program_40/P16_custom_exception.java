//You are given a project to demonstrate the uses of the throws, throw, finally, and custom exceptions in Java.
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}

public class P16_custom_exception {
    public static void main(String[] args)
    {
        try
        {
            throw new MyException("Akshay Mane");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
