package Day1;

import java.util.Scanner;

public class PS2 {
    public static void main(String[] args) {
       String str = new String("ARYAN  ");
//        System.out.println(str.toLowerCase());
//
        //problem 2
//        System.out.println(str.replace(" ","_"));
        //problem 3
//        String Letter="hello! <|name|>, Thx a lot";
// Letter= Letter.replace("<|name|>","Aryan");
//       System.out.println(Letter);

        //problem 4
// double and triple spaces
//        System.out.println(str.indexOf("  "));
//        System.out.println(str.indexOf("   "));

//problem 5
       //salary Q
//        float income = 2.4f;
//        float tax = 0;
//        if (income < 2.5f) {
//            tax = tax + 0;
//        } else if (income > 2.5f && income <= 5.0f) {
//            tax = tax + 0.05f*(income-2.5f);
//        } else if (income > 5.0f && income <= 10.0f) {
//            tax = tax + 0.05f*(income-2.5f);
//            tax = tax + 0.2f*(income-5.0f);
//        }
//        else{
//            tax = tax + 0.05f*(income-2.5f);
//            tax = tax + 0.2f*(income-5.0f);
//            tax=tax+0.3f*(income-10.0f);
//        }
//        System.out.println("the tax paid by employee is"+ tax);

        //problem 8
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("monday");
//                break;
//                case 2:
//                System.out.println("tuesday");
//                break;
//                case 3:
//                System.out.println("wednesday");
//                break;
//                case 4:
//                System.out.println("thursday");
//                break;
//                case 5:
//                System.out.println("friday");
//                break;
//                case 6:
//                System.out.println("saturday");
//                break;
//                case 7:
//                System.out.println("sunday");
//                break;
//        }



        //problem 9
        Scanner sc=new Scanner(System.in);
        String x= sc.nextLine();

        if(x.endsWith(".com")){
            System.out.println("commercial");
        } else if (x.endsWith(".org")) {
            System.out.println("organization");
        }else if (x.endsWith(".in")) {
            System.out.println("Indian Website ");
        }

    }

}
    }
}
