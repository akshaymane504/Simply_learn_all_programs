//You are given a project to demonstrate the uses of the throws, throw, finally, and custom exceptions in Java.
public class P16_final {
    public static void main(String[] args)
    {
        try {
            System.out.println("inside try block");
            System.out.println(34 / 2);
        }
        catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("finally : i execute always.");
        }
    }
}
