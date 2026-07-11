package DAY2;

public class methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=x*y;
        }
        return z;
    }
    public static void main(String[] args) {int c;int a=5; int b=7;
        // using method invocation using object creation
       methods obj=new methods();
       c=obj.logic(a,b);

//c=logic(a,b);
        System.out.println(c);
    }
}
