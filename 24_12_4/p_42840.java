
import java.util.ArrayList;
import java.util.List;

public class p_42840 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        // int[] answers = {1,3,2,4,2};
        solution(answers);
        
    }   
    
    static int[] solution(int[] answers) {
        // 1번 1,2,3,4,5
        // 2번 2,1,2,3,2,4,2,5
        // 3번 3,3,1,1,2,2,4,4,5,5 (3,1,2,4,5)*2

        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int[][] temp = new int[3][1];
        for(int i = 0,j=1;i<answers.length;i++,j++) {
            int as = answers[i];
            int temp1 = j%5 == 0 ? 5 : j%5;
            if(p1[temp1-1] == as) temp[0][0]++;
            int temp3 = j%10 == 0 ? 10 : j%10;
            if(p3[temp3-1] == as) temp[2][0]++;
            int temp2 = j%8 == 0 ? 8 : j%8;
            if(p2[temp2-1] == as) temp[1][0]++;
        }
        int max = temp[2][0];
        if(temp[0][0]>=temp[1][0] && temp[0][0]>=temp[2][0]) {
            max = temp[0][0];
        } else if(temp[1][0]>=temp[0][0] && temp[1][0]>=temp[2][0]) {
            max = temp[1][0];
        }
        List<Integer> t = new ArrayList<>();
        for(int i = 0;i<temp.length;i++) {
            if(max==temp[i][0]) t.add(i+1);
        }
        return t.stream().mapToInt(Integer::intValue).toArray();
    }
}
