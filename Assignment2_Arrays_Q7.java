
public class Assignment2_Arrays_Q7 {
	
	    public boolean isMonotonic(int[] nums) {
	        boolean increasing = true;
	        boolean decreasing = true;
	        
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] < nums[i - 1]) {
	                increasing = false;
	            }
	            
	            if (nums[i] > nums[i - 1]) {
	                decreasing = false;
	            }
	        }
	        
	        return increasing || decreasing;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 2, 2, 3};
	        
	        Assignment2_Arrays_Q7 solution = new Assignment2_Arrays_Q7();
	        boolean isMonotonic = solution.isMonotonic(nums);
	        
	        System.out.println("Is the array monotonic? " + isMonotonic);
	    }
	}

