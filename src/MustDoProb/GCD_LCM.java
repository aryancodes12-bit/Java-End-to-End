package MustDoProb;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scn1=new Scanner(System.in);
        Scanner scn2=new Scanner(System.in);
        int n = scn1.nextInt();
        int m = scn2.nextInt();

        int small;
        if (n<m){
            small=n;
        }
        else {
            small=m;
        }
        int gcd=1;
        for(int i=small;i>0;i--){
           if(n%i==0 && m%i==0){
              gcd=i;
              break;
            }
        }
//        int large;
//        if (n > m) {
//            large = n;
//        } else {
//            large = m;
//        }
//        int lcm=large;
//        while(true){
//            if(lcm %small==0){
//                break;
//            }
//            lcm+=large;
//        }
 int lcm = (n*m)/gcd;
        System.out.println("the gcd is "+lcm);
        System.out.println("the gcd is"+gcd);
    }

}
