
import java.util.HashMap;
import java.util.Map;

public class p_67256 {

    public static void main(String[] args) {
        int[] nubmers= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        solution(nubmers, hand);
        
    }

    // 1 2 3
    // 4 5 6
    // 7 8 9
    //   0

    // 1 3 4 5 8 2 1 4 5 9 5
    // (1,4,7) L / (3,6,9) R / 
    // (2,5,7,0) 앞의 L,R의 위치
   
    static String solution(int[] numbers,String hand) {
        String answer = "";

        // L의 마지막 row
        // R의 마지막 row

        int lRow = 0;
        int rRow = 0;
        Map<Integer,Integer> targets = new HashMap<>();
        targets.put(2, 1);
        targets.put(5, 2);
        targets.put(8,3);
        targets.put(0, 4);
        // int[] targets = {2,5,7,0};

        StringBuilder sb = new StringBuilder();
        for(int number : numbers) {
            // System.out.println(sb.toString());
            if(number == 1 || number == 4 || number == 7) {
                sb.append("L");
                lRow = (number-1)/3+1;
            } else if(number != 0 &&number%3 == 0) {
                sb.append("R");
                rRow = number/3;
            } else {
                int targetRow = targets.get(number);
                int left = Math.abs(targetRow-lRow);
                int right = Math.abs(targetRow-rRow);

                if(left<right) sb.append("L");
                else if(left>right) sb.append("R");
                else {
                    if(hand.equals("right")){
                        sb.append("R");
                    } else {
                        sb.append("L");
                    }
                }
            }
        }
        System.out.println(sb.toString());

        return answer;
    }
    
    
}
