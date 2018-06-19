package ctci.chapter1.iq1_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IQ1_1_c {
    public static void main(String args[]) {

        String[] sArr = new String[]{"abcDa", "abcD", "a", "aA", "aa"};

        for (int i = 0; i < sArr.length ; i++) {
            System.out.print("\n"+sArr[i]+" : ");
            System.out.println(hasUniqueChars(sArr[i]));
        }
    }

    // O(N log N)
    public static boolean hasUniqueChars(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for(int i=0; i<chars.length-1; i++){
            if(chars[i]==chars[i+1]){
                return false;
            }
        }
        return true;
    }
}
