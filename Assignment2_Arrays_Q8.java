

	import java.util.Arrays;

	public class Assignment2_Arrays_Q8 {
	    public int minimumScore(int[] nums, int k) {
	        Arrays.sort(nums);
	        
	        int n = nums.length;
	        
	       
	        for (int i = 0; i < k; i++) {
	            nums[i] += nums[n - k];
	        }
	        
	       
	        for (int i = k; i < n; i++) {
	            nums[i] -= nums[n - k - 1];
	        }
	        
	       
	        return nums[n - 1] - nums[0];
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1};
	        int k = 0;
	        
	        Assignment2_Arrays_Q8 solution = new Assignment2_Arrays_Q8();
	        int minScore = solution.minimumScore(nums, k);
	        
	        System.out.println("Minimum score: " + minScore);
	    }
	}

