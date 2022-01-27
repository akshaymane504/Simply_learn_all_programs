//You are given a project to demonstrate the uses of try-catch blocks in Java.
public class P15 {
    public static void main(String[] args) {
        try
        {
            int data=50/0;
        }
        //handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
