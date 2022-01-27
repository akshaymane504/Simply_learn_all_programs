//rite a program to demonstrate the uses of constructors and its types.
public class P5 {
    String name;
    int id;
    void display(){System.out.println(id+" "+name);}
    public static void main(String[] args) {
        P5 s1=new P5();
        P5 s2=new P5();
        s1.display();
        s2.display();
    }
}
class P5_2 {
    int id;
    String name;
    P5_2(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        P5_2 s1 = new P5_2(111, "Karan");
        P5_2 s2 = new P5_2(222, "Aryan");
        s1.display();
        s2.display();
    }
}