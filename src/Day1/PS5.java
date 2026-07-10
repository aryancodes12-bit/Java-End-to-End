package Day1;

public class PS5 {

    public static void main(String[] args) {
//problem 2
//        int n=10;
//       int i=0;
//       int sum=0;
//       while (i<n){
//           if(i%2==0){
//               sum=sum+i;
//           }
//           i++;
//       }
//        System.out.println(sum);

        //problem 3
//        int n=5;
//        for(int i=1;i<=10;i++){
//            System.out.printf(" %d X %d=%d\n",n,i,n*i);
//        }

        //problem4
//        int n=5;
//        int fact=1;
//        //5*4*3*2*1
//        for (int i=n;i>0;i--){
//            fact=fact*i;
//        }
//        System.out.println(fact);

// using while loop
// int n = 5;
// int fact=1;
// while(n!=0){
//         fact=fact*n;
//         n--;
// }
// System.out.println(fact);

// using do while
        int n=5;
        int fact=1;
        do{
            fact=fact*n;
            n--;
        } while(n!=0);
        System.out.println(fact);
        //problem 5
//        int n=8;
//        int sum=0;
//     for(int i=1;i<=10;i++){
//         sum=sum+(n*i);
//     }
//        System.out.println(sum);

    }
}

