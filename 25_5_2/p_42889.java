
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class p_42889 {
    public static void main(String[] args) {

        // int N = 5;
        // int[] stages = {2,1,2,6,2,4,3,3};
        // answer = 3,4,2,1,5

        // int N = 4;
        // int[] stages = {4,4,4,4,4};

        int N = 2;
        int[] stages = {1,1,1,1};
        solution(N, stages);
        
    }

    static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[] temp = new float[N];
        List<Float> list = new ArrayList<>();
        //20250506
        int totalSize = stages.length;
        for (int level = 1;  level <= N; level++) {
            int count = 0;
            for(int i = 0;i<stages.length;i++) {
                if(level == stages[i]) {
                    count++;
                }
            }
            float ratio = (float)count/totalSize;
            if(totalSize<=0) ratio=0.0f;
            temp[level-1] = ratio;
            list.add(ratio);
            totalSize-=count;
        }
        Collections.sort(list);
        // for(int i = 0;i<temp.length;i++) {
        //     System.out.println(temp[i]);
        // }

        int i = 0;
        while (true) { 
            float maxValue = list.get(list.size()-1);
            for(int j = 0;j<temp.length;j++) {
                if(maxValue == temp[j]) {
                    temp[j] = -1f;
                    answer[i++] = j+1;
                    break;
                }
            }
            list.remove(list.size()-1);
            if(list.isEmpty()) break;
        }
        for(int j = 0;j<answer.length;j++) {
            System.out.println(answer[j]);
        }
        return answer;
        


        // double[] temp = new double[N];
        // // N 보다 높은 숫자가 없을 경우 실패율 0
        // List<Integer> targets = Arrays.stream(stages).boxed().collect(Collectors.toList());
        // int lev = 1;
        // while(N>0) {
        //     int remainUsers = targets.size();

        //     for(int i = targets.size()-1;i>=0;i--) {
        //         if(targets.get(i) <= lev) {
        //             targets.remove(i);
        //         }
        //     }
        //     N--;
        //     temp[lev-1]=(double)(remainUsers-targets.size())/remainUsers;

        //     // System.out.println((double)(remainUsers-targets.size())/remainUsers);
        //     lev++;
        //     // System.out.println("=============");
        // }
        // for(int i = 0;i<temp.length;i++) {
        //     double target = temp[i];
        //     int rank = 0;
        //     System.out.println(target);
        //     for(int j = 0;j<temp.length;j++) {
        //         if(target<temp[j]) rank++;
        //     }
        //     answer[i]=rank;
        // }
        // //23104
        // for(int i : answer) {
        //     System.out.print(i+" ,");
        // }


        // return answer;
    }
}
