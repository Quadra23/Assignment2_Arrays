

	import java.util.HashMap;

	public class Assignment2_Arrays_Q3 {
	    public int findLHS(int[] nums) {
	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
	        
	      
	        for (int num : nums) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }
	        
	        int longestSubsequence = 0;
	        
	       
	        for (int key : frequencyMap.keySet()) {
	            
	            if (frequencyMap.containsKey(key + 1)) {
	                int currentSubsequence = frequencyMap.get(key) + frequencyMap.get(key + 1);
	                longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
	            }
	        }
	        
	        return longestSubsequence;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
	        
	        Assignment2_Arrays_Q3 solution = new Assignment2_Arrays_Q3();
	        int longestSubsequenceLength = solution.findLHS(nums);
	        
	        System.out.println("Length of longest harmonious subsequence: " + longestSubsequenceLength);
	    }
	}

