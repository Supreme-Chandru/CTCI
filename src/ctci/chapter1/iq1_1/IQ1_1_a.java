package ctci.chapter1.iq1_1;

public class IQ1_1_a {
    public static void main(String args[]) {

        String[] sArr = new String[]{"abcDa", "abcD", "a", "aA", "aa"};

        for (int i = 0; i < sArr.length ; i++) {
            System.out.print("\n"+sArr[i]+" : ");
            System.out.println(hasUniqueChars(sArr[i]));
        }
    }

    public static boolean hasUniqueChars(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
