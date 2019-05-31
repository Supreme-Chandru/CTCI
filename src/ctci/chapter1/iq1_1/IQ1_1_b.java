package ctci.chapter1.iq1_1;

public class IQ1_1_b {
    public static void main(String args[]) {

        String[] sArr = new String[]{"abcDa", "abcD", "a", "aA", "aa"};

        for (int i = 0; i < sArr.length ; i++) {
            System.out.print("\n"+sArr[i]+" : ");
            System.out.println(hasUniqueChars(sArr[i]));
        }
    }

    public static boolean hasUniqueChars(String s) {
        boolean[] mem = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            if(mem[(int)s.charAt(i)]){
               return false;
            }
            mem[(int)s.charAt(i)] = true;
        }
        return true;
    }
}
