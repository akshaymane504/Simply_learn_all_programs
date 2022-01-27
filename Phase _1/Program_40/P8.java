//Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder.
public class P8 {
    public static void main(String[] args) {
        System.out.println("Creating StringBuffer");
        String a = "Akshay";
        StringBuffer buf = new StringBuffer(a);
        buf.append("_Jr");
        String result = buf.toString();
        System.out.println("String to Str.Buffer: "+result);

        System.out.println("Creating StringBuilder");
        StringBuilder sb1=new StringBuilder("Happy");
        sb1.append("Learning");
        System.out.println(sb1);

        System.out.println(sb1.delete(0, 1));

        System.out.println(sb1.insert(1, "Welcome"));

        System.out.println(sb1.reverse());

        System.out.println("\n");
        System.out.println("Conversion of Strings to StringBuffer and StringBuilder");

        String str = "Hello";

        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println("String to StringBuffer");
        System.out.println(sbr);

        StringBuilder sbl = new StringBuilder(str);
        sbl.append("world");
        System.out.println("String to StringBuilder");
        System.out.println(sbl);
    }
    }

