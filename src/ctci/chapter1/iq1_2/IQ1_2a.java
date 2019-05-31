package ctci.chapter1.iq1_2;

import java.util.Arrays;

public class IQ1_2a {
    public static void main(String args[]) {
        String[] input = new String[]{"ads", "aaa"};
        String[] output = new String[]{"asd", "aaaa"};

        for(int i=0; i <input.length; i++){
            System.out.println("is \'"+input[i]+"\' anagram of \'"+output[i]+"\'?");
            System.out.println(isAnagram(input[i], output[i]));
        }
    }

    private static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);


        String sa1 = new String(c1);
        String sa2 = new String(c2);

        //System.out.println(sa1+" "+sa2);

        return sa1.equals(sa2);
    }
}
