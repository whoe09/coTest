
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p_12910 {
    public static void main(String[] args) {
        
        int[] arr = {5,9,7,10};
        int divisor = 5;
        solution(arr, divisor);
    }

    static int[] solution(int[] arr,int divisor) {
        // 오름 차순
        Arrays.sort(arr);
        List<Integer> newList = new ArrayList<>();
        for (int item : arr) {
            if(item%divisor == 0) {newList.add(item);} 
        }
        if(newList.isEmpty()) return new int[] {-1};
        return newList.stream().mapToInt(Integer::intValue).toArray();
    }
}
