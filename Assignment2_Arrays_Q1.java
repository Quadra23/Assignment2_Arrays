

	import java.util.Arrays;

	public class Assignment2_Arrays_Q1 {
	    public int arrayPairSum(int[] nums) {
	        
	        Arrays.sort(nums);
	        
	        int sum = 0;
	        
	       
	        for (int i = 0; i < nums.length; i += 2) {
	            sum += nums[i];
	        }
	        
	        return sum;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 4, 3, 2};
	        
	        Assignment2_Arrays_Q1 solution = new Assignment2_Arrays_Q1();
	        int maxSum = solution.arrayPairSum(nums);
	        
	        System.out.println("Maximized sum: " + maxSum);
	    }
	}

