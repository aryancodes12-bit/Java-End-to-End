package MustDoProb;

public class MinElement {
    static int findMin(int ...arr){
        int min=arr[0];
        for (int e : arr){
           if (e<min){
               min=e;
           }

        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(findMin(9,8,9,6));
    }
}
