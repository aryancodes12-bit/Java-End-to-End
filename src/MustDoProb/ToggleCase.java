package MustDoProb;

public class ToggleCase {
static String toggle(String s){
    StringBuilder sb=new StringBuilder();
    for (char ch: s.toCharArray()){
        if(Character.isUpperCase(ch)) {
            sb.append(Character.toLowerCase(ch));
        }
        else {
            sb.append(Character.toLowerCase(ch));
        }

    }
    return sb.toString();
}

    public static void main(String[] args) {

        System.out.println( toggle("ArYaN"));
    }
}
