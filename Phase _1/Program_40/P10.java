//Write a program to search a specific string from the given set of strings using regular expressions.
import java.util.regex.*;
public class P10 {
    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String check = "Regular Expressions Example";
        Pattern a = Pattern.compile(pattern);
        Matcher b = a.matcher(check);
        while (b.find())
            System.out.println(check.substring(b.start(), b.end()));
    }
}


