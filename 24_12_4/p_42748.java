import java.util.Arrays;

public class p_42748 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commans = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        solution(array, commans);       
        
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0;i<commands.length;i++) {
            int[] innerArray = commands[i];
            int[] newArray = Arrays.copyOfRange(array,innerArray[0]-1, innerArray[1]);
            Arrays.sort(newArray);
            answer[i] = newArray[innerArray[2]-1];
        }
        return answer;
    }
}
