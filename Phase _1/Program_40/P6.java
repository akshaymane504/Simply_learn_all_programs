//Write a program to demonstrate the uses of collections and its types.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
public class P6 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr1=stack.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
