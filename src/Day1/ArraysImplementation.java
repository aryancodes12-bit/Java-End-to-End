package Day1;

public class ArraysImplementation {    public static void main(String[] args) {
//        int[] marks =new int[5];
//        marks[0]=85;
//        marks[1]=38;
//        marks[2]=92;
//        marks[3]=99;
//        marks[4]=89;
//        System.out.println(marks[4]);
    int[] marks={89,78,98,67,87};
    // System.out.println(marks[3]);
    for (int mark : marks) {
        System.out.println(mark);
        System.out.println(marks.length);
    }
}
}
  // for 2D Arrays

//public class array_2 {
//    public static void main(String[] args) {
//        int[][] flats = new int[2][3]; // 2 rows, 3 columns
//
//        // Assign values to the array
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//
//        // Display the 2D array
//        for (int i = 0; i < flats.length; i++) { // Iterate over rows
//            for (int j = 0; j < flats[i].length; j++) { // Iterate over columns
//                System.out.print(flats[i][j] + " "); // Print each element
//            }
//            System.out.println(); // Newline after each row
//        }
//    }
//}

