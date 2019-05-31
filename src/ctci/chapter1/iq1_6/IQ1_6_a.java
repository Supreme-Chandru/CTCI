package ctci.chapter1.iq1_6;

public class IQ1_6_a {
    public static void main(String args[]){
       String[] inputs = new String[]{"aabbbccaaa", "a", "aa", "ab", "aaadc", "aacc"};

       for(String input: inputs){
           System.out.println("Input: "+input+", Output: "+compress(input));
       }

    }

    private static String compress(String input) {
        int count =1 ;
        String output = "";
        int i;
        for( i=0; i< input.length() - 1; i++){
            if(input.charAt(i) == input.charAt(i+1)){
                count++;
            }else{
                output+= ""+input.charAt(i)+count;
                count=1;
            }
        }
        output+= ""+input.charAt(i)+count;

        return input.length() < output.length() ? input: output;
    }
}
