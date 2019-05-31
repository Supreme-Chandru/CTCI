package ctci.chapter1.iq1_2;

import java.util.Arrays;

public class IQ1_2_b {
    public static void main(String args[]) {
        String[] input = new String[]{"ads", "aaa", "abd"};
        String[] output = new String[]{"asd", "aaaa", "abd"};

        for(int i=0; i <input.length; i++){
            System.out.println("is \'"+input[i]+"\' anagram of \'"+output[i]+"\'?");
            System.out.println(isAnagram(input[i], output[i]));
        }
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }

        int[] mem = new int[128]; // assuming the string contains only ASCII value

        for(int i=0; i< s1.length(); i++) {
            int c = (int) s1.charAt(i);
            mem[c]++;
        }
        for(int i=0; i< s2.length(); i++) {
            int c = (int) s2.charAt(i);
            mem[c]--;
        }
        for(int i=0; i<mem.length ; i++){
            if(mem[i]<0) return false;
        }
        return true;
    }
}
