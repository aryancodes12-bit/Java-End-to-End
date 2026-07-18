package MustDoProb;

public class SumOfDigits {
    public static int sumOf(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n/=10;
        }
return  sum;

//        int n=4;
//        int sum=0;
//        for(int i =0; i<n;i++){
//            sum+=n;
//        }
//        System.out.println(sum);

        //method 2

    }

    public static void main(String[] args) {
        // 2. Create the object instance
        SumOfDigits o = new SumOfDigits();
        // 3. Call the method ON the object 'o'
        int result = o.sumOf(754);

        System.out.println("The sum of digits is: " + result);
    }
}
