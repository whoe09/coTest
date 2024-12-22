
import java.util.HashSet;
import java.util.Set;

public class p_1845 {
    public static void main(String[] args) {

        int[] nums = {3,3,3,2,2,2};
        System.out.println(solution(nums));
        
    }

    static int solution(int[] nums) {
        int maxNumber = nums.length/2;

        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        if(set.size()>maxNumber) return maxNumber;
        else return set.size();
    }
}
