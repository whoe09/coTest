
import java.util.Arrays;

public class p_12977 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        solution(nums);

        
    }
    static int solution(int[] nums) {
        // 최대 갯수까지 소수를 먼저 구하자
        Arrays.sort(nums);
        int maxSum = 0;
        for(int i = nums.length-1,x = 0;x<3;i--,x++) {
            maxSum+=nums[i];
        }

        boolean[] prime = new boolean[maxSum+1];

        for(int i = 0;i<prime.length;i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;

        for(int i = 2;i<=Math.sqrt(maxSum);i++) {
            if(prime[i]) {
                for(int j = i*i;j<=maxSum;j+=i) {
                    prime[j] = false;
                }
            }            
        }
        // 1,2,4,6,7
        int answer = 0;
        int maxLength = (nums.length);
        for(int i = 0;i<maxLength;i++) {
            for(int j = i+1;j<maxLength;j++) {
                for(int x = j+1;x<maxLength;x++) {
                    int target = nums[i]+nums[j]+nums[x];
                    if(prime[target]) answer++;
                }
            }
        }
        return answer;
    }
}
