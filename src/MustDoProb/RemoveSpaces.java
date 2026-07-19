package MustDoProb;

public class RemoveSpaces {
    static String space(String s){
        return s.replaceAll(" ","");
    }

    public static void main(String[] args) {
        System.out.println( space("A r y a n"));;
    }
}
