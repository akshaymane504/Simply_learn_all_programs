//You are given a project to demonstrate the workflow of a linear search algorithm.
import java.util.Scanner;

public class P32 {
    public static void main(String args[])
    {
        int c, n, search, array[];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = s.nextInt();
        array = new int[n];

        System.out.println("Enter those " + n + " elements");

        for (c = 0; c < n; c++)
            array[c] = s.nextInt();

        System.out.println("Enter value to find");
        search = s.nextInt();

        for (c = 0; c < n; c++)
        {
            if (array[c] == search)
            {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if (c == n)
            System.out.println(search + " isn't present in array.");
    }
}
