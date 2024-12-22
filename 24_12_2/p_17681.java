
import java.util.HashMap;
import java.util.Map;

public class p_17681 {
    public static void main(String[] args) {

        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        int n =5;
        soution(n, arr1, arr2);
        
    }

    static String[] soution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        Map<Integer,String> puzzle = new HashMap<>();
        long maxLength = (long)Math.pow(2, n)-1;
        for(int i =0;i<maxLength;i++) {
            String tmp = Long.toString(i,2);
            puzzle.put(i, "0".repeat((n-tmp.length()))+tmp);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++) {
            String targ = Long.toBinaryString(arr1[i] | arr2[i]);
            targ = "0".repeat(n-targ.length())+targ;
            answer[i] =targ.replaceAll("1", "#").replaceAll("0", " ");
        }
        for(String s : answer) {
            System.out.println(s);
        }
        return answer;
    }
}
