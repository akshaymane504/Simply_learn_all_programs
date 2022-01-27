// You are given a project to demonstrate the multithreading with and without synchronization.
//synchronized method
class Table1{
    synchronized void printTable1(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread4 extends Thread{
    Table t;
    MyThread4(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread5 extends Thread{
    Table t;
    MyThread5(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class P14_2 {
    public static void main(String[] args){
        Table obj = new Table();
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
