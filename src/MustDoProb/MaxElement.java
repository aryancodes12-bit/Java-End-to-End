package MustDoProb;

public class MaxElement {
    public static void main(String[] args) {
        int arr [] ={-213,45,7,9} ;
        int max=Integer.MIN_VALUE;
        for(int e: arr){
      if(e >max){
          max=e;
      }
        }
        System.out.println(max);

    }
}
