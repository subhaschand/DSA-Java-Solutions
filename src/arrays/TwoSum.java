package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    
    public int[] twoSum(int[] nums, int target) {
        // Map stores <Number, Index>
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;
            
            // Check if the complement is already in our map
            if (map.containsKey(complement)) {
                // If found, return the index of the complement and the current index
                return new int[] { map.get(complement), i };
            }
            
            // If not found, add the current number and its index to the map for future checks
            map.put(currentNum, i);
        }
        
        // Return an empty array if no solution is found (though problem statements usually guarantee one solution)
        throw new IllegalArgumentException("No two sum solution found");
    }
    
    // Main method for testing locally
    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solver.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]"); // Output should be [0, 1]
    }
}