package Day4;

class A{
    public  int a ;
    public int Aryan(){
        return 4;
    }

    public void Meth2 (){
        System.out.println(" i am method 2 of class A");
    }
} class B extends  A{
    @Override
    public void Meth2(){
        System.out.println(" i am method 2 of class B");
    }
    public void Meth(){
        System.out.println(" i am method 3 of class B");
    }
}
public class method_overiding {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.Meth2();
        b.Meth2();
    }
}



