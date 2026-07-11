package DAY2;

public class var_args {
    static int sum(int x, int ...arr) {
        int sum = x;
        for (int e : arr) {
            sum += e;
        }
        return sum;
    }
        public static void main (String[]args){
            System.out.println("the sum is "+ sum(5,8,6,7));
        }
    }
