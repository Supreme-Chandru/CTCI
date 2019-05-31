package ctci.chapter1.iq1_4;

public class IQ1_4_a {
    public static void main(String[] args){
        System.out.println(isPalindromePermutation("Taco Coa"));

    }

    private static boolean isPalindromePermutation(String s) {
        String s1 = s.toLowerCase().replaceAll("\\s+","");
        //System.out.println(s1);

        int[] mem = new int[128];
        for(int i=0; i<s1.length(); i++){
            int num = (int) s1.charAt(i);
            mem[num]++;
        }

        boolean alreadyHasOdd = false;
        for(int i=0; i<mem.length; i++){
            if(mem[i] % 2 != 0){
                if(alreadyHasOdd){
                    return false;
                }
                alreadyHasOdd = true;
            }
        }

        return true;
    }
}
