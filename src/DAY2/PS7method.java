package DAY2;

public class PS7method {
    //problem  1
//    public static void print(){
//        int n =10;
//        for(int i=0;i<n;i++){
//
//            System.out.printf(" %d X %d=%d",n,i,n*i);
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        print();
//    }

    //problem 2
//  static void pattern(){
//      for (int i=0;i<4;i++){
//          for (int j=0;j<=i;j++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }
//
//  }
//
//    public static void main(String[] args) {
//        pattern();
//    }

    //problem 3  to calculate sum of recursion elements
//    static int rec(int n ) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n+ rec(n-1);
//        }
//    }
//    public static void main(String[] args) {
//
//        System.out.println(rec(5));
//
//    }


    // problem 4
//    static  void pattern(){
//        int n =5;
//        for (int i=0;i<n;i++){
//            for (int j= i ;j <n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern();
//    }

    //problem 5
//    static int fib(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//return fib(n-2)+fib(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int result= fib(5);
//        System.out.println(result);
//    }

    // problem 6
//    static int avg(int x,int ...arr){
//int avg =x;
//int n=5;
//        for (int e: arr ){
//           avg+=e;
//        }
//       return avg/n;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("the avg is "+avg(5,4,5,8,9));
//    }

    //problem 7
//    static void pattern(int n ) {
//        if (n == 0) {
//            return;
//        } else {
//            for (int i = 0; i < n; i++) {
//                for (int j = i; j < n; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//                pattern(n - 1);
//                return;
//            }
//        }
//
//    }
//    public static void main(String[] args) {
//        pattern(5);}

    // problelm 8
//    static void pattern(int n ) {
//        if (n == 0) {
//            return;
//        }   pattern(n - 1);
//
//                for (int j = 1; j <= n; j++) {
//                    System.out.print("*");
//                }    System.out.println();
//        }
//    public static void main(String[] args) {
//        pattern(5);}


    // problem 10
    public static void main(String[] args) {
        int n =5;
        int sum=0;
        for(int i =0;i<n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    }