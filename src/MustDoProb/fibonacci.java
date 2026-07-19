package MustDoProb;

public class fibonacci {
    static int getfib(int n ) {
if (n==0 ){
    return 0;
        } else if(n==1) {
    return 1;
}
else {
    return getfib(n-1)+getfib(n-2);
}
    }

    public static void main(String[] args) {
        //iterative
//        int n = 15;
//        int a = 0; // First Fibonacci number
//        int b = 1; // Second Fibonacci number
//        for (int i = 2; i <= n; i++) {
//            System.out.print(a+" ");
//            int next= a+b;
//            a=b;
//            b=next;
//        }
//        System.out.println(b);
int num=5;
for(int i=0; i<num;i++){
        System.out.println(getfib(i));
    }
}}