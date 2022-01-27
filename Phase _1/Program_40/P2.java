//Write a program to demonstrate how and when access modifiers are used.
 class A{
    private void s(){
        int a = 10;
        System.out.println("Private Class = "+a);
    }

    protected void f(){
        int b = 12;
        System.out.println("Protected Class = "+b);
    }

    public void g(){
        int c = 14;
        System.out.println("Public Class = "+c);
    }
}

class B{
    void h(){
        A obj = new A();
        obj.f();
        obj.g();
    }
}

public class P2 extends A{
    public static void main(String[] args) {
        B obj = new B();
        obj.h();

    }
}
