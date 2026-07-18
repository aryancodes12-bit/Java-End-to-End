package MustDoProb;

public class Armstrong {
    static boolean Armstrong(int n){
        int temp=n; int digits=String.valueOf(n).length(); int sum=0;
        while (temp >0){
            sum+= Math.pow(temp%10,digits);
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//       int n= sc.nextInt();
//        int original = n;
//        int rem = 0;
//        int result = 0;
//        int digits = 0;
//        int temp = n;
//       while(temp !=0){
//digits++;
//temp /=10;
//       }
//       while (original !=0){
//           rem = original%10;
//           result+=(int) Math.pow(rem,digits);
//           original/=10;
//       }
//       if(result==n){
//           System.out.println("is armstrong");
//       }
//       else {
//           System.out.println("not armstrong ");
//       }
//    }


        // using method2
       int number=1456;
       boolean result= Armstrong(number);
        System.out.println(result);
    }
}
