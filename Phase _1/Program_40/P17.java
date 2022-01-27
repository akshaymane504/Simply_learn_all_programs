// You are given a project to demonstrate a program implementing the concept of exception handling available in Java and the custom exception handlers.
class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        super(str);
    }
}

public class P17 {
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]){
        try{
            int data=100/0;
        }catch(ArithmeticException e){System.out.println(e);}

        try
        {
            validate(13);
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

    }
}
