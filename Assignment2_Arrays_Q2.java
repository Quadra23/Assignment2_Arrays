

	import java.util.HashSet;

	public class Assignment2_Arrays_Q2 {
	    public int maxCandies(int[] candyType) {
	        int maxCandies = candyType.length / 2; 
	        
	        HashSet<Integer> uniqueCandies = new HashSet<>();
	        
	     
	        for (int candy : candyType) {
	            uniqueCandies.add(candy);
	        }
	        
	        
	        return Math.min(uniqueCandies.size(), maxCandies);
	    }
	    
	    public static void main(String[] args) {
	        int[] candyType = {1, 1, 2, 2, 3, 3};
	        
	        Assignment2_Arrays_Q2 solution = new Assignment2_Arrays_Q2();
	        int maxDifferentTypes = solution.maxCandies(candyType);
	        
	        System.out.println("Maximum number of different candy types: " + maxDifferentTypes);
	    }
	}

