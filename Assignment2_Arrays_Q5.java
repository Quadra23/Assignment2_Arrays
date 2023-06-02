

	import java.util.Arrays;

	public class Assignment2_Arrays_Q5 {
	    public int maximumProduct(int[] nums) {
	        
	        Arrays.sort(nums);
	        
	        int n = nums.length;
	        
	        
	        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
	        int product2 = nums[0] * nums[1] * nums[n - 1];
	        
	        
	        return Math.max(product1, product2);
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3};
	        
	        Assignment2_Arrays_Q5 solution = new Assignment2_Arrays_Q5();
	        int maxProduct = solution.maximumProduct(nums);
	        
	        System.out.println("Maximum product: " + maxProduct);
	    }
	}

