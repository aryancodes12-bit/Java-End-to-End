package Day1;

import java.util.Arrays;

public class PS6 {
    public static void main(String[] args) {
        //problem 1
//        int [] [] mat1= new int[2] [3];
//   mat1[0] [0]=4; mat1[0] [1]=1; mat1[0] [2]=7;
//
//        int [] [] mat2= new int[2] [3];
//
//        mat2[1] [0]=4; mat2[1] [1]=1; mat2[1] [2]=7;
//        int [][] result={{0,0,0},{0,0,0}};
//        for (int i=0 ;i< mat1.length;i++){
//            for (int j=0; j< mat1[i].length;j++){
// result[i][j] =mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
        // problem 2
//        int arr []= {1,2,3,4,5};
//        int l= arr.length;
//        int temp;
//        int n = Math.floorDiv(l,2);
//        for(int i=0;i<=n;i++){
//           temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//
//        }
//        for(int e: arr) {
//            System.out.print(e);
//        }

        // array is sorted or not
      boolean isSorted=true;
      int arr[]={4,1,2,6,7};
      for(int i=0;i< arr.length;i++) {
          if (arr[i] > arr[i + 1]) {
              isSorted = false;
             break;
          }
      }
          if(isSorted){
              System.out.println("the array is sorted");
          }
          else {
              System.out.println("not sorted");
          }
      }

    }

