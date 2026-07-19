package MustDoProb;
public class BinarySearch {
    static  int binary(int ...arr){
       int low=0;int high=arr.length-1;
       int target=8;
       while(low<=high){
           int mid=low+(high-low)/2;
           if(arr[mid]==target){
               return mid;
           } else if (arr[mid]<target) {
               low=mid+1;
           }
           else high=mid-1;
       }
       return -1;
    }
    public static void main(String[] args) {
        System.out.println( binary(2,4,8,9,10));
    }
}
