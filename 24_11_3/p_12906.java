
import java.util.Stack;

public class p_12906 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        solution2(arr);
        
    }

    static int[] solution(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1;i<arr.length;i++) {
            if(stack.peek()!=arr[i]) stack.push(arr[i]);
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    static int[] solution2(int[] arr) {
        int[] newAraay = new int[1000000];
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);

        for(int i = 1;i<arr.length;i++) {
            if(arr[i] != sb.charAt(sb.length()-1)-'0') sb.append(arr[i]); 
        }
        for(int i = 0;i<sb.length();i++) {
            newAraay[i] = sb.charAt(i)-'0';
        }
        return newAraay;
    }
}
