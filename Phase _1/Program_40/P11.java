import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        String[] strAr = {"Akshay", "Jaywant", "Mane"};
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to search : ");
        String name = sc.nextLine();

        for (int i=0; i<strAr.length; i++)
        {
            if (strAr[i].equals(name)){
                System.out.println("Name "+name+" found at position : "+(i+1));
                flag = true;
            }
        }
        if (!flag){
            System.out.println(name+" not found");
        }
    }
}
