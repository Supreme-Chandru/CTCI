package ctci.chapter1.iq1_3;

//URLify
public class IQ1_3_a {
    public static void main(String[] args) {

        String output = urlify("Mr John Smith    ",13);
        System.out.println(output);
    }

    private static String urlify(String s, int length) {
        char[] cArr = s.toCharArray();
        int rightIndex = cArr.length-1;
        for(int i=length-1; i>=0; i--){
            if(cArr[i]==' '){
                cArr[rightIndex--] = '0';
                cArr[rightIndex--] = '2';
                cArr[rightIndex--] = '%';
            }else{
                cArr[rightIndex--] = cArr[i];
            }
        }
        return String.valueOf(cArr);
    }
}
