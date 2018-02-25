import java.util.HashSet;
import java.util.HashMap;

public class Test {
    public static void main(String[] args){
        String[] options = new String[8];
        for(String o : options){
            System.out.println(o);
        }
        System.out.println(options.toString());
        //System.out.println(calcFirstBox(6));
    }

    public static int calcFirstBox(int tileNum){
        //DO NOT REMOVE need int divide for round number
        int BoxRow = tileNum/3 * 9 * 3;
        int BoxCol = (tileNum%3)*3;
        return  BoxRow + BoxCol;
    }

}
