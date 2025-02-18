// https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int[] solution = solution(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] solution(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                    break;
                }
            }
        }
        return solution;
    }
}
