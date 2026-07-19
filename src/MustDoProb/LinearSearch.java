package MustDoProb;

public class LinearSearch {
    static void search(int n, int ...arr){
        int target=7;
        for (int i=0; i< arr.length; i++){
            if(arr[i]==target){
                System.out.println("found at index"+i);
            }

        }
    }

    public static void main(String[] args) {
        search(5,4,7,8,9,6);
    }
}
