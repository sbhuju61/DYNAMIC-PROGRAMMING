package com.sb.dynamic.dynamic;

import java.util.Arrays;
import java.util.HashMap;

public class CanSum {
	
	public boolean canSumRecursive(int targetSum, int [] numArray) {
		
		if (targetSum == 0) return true;
		if (targetSum < 0) return false;
		
		if (numArray.length == 0) return false;
		
		for (int num : numArray) {
			
			final int remainder = targetSum - num;
			
			boolean canSum = canSumRecursive(remainder,numArray);
			
			if (canSum == true) return true;
			
			
		}
		
		return false;
		
		
	}
	
	HashMap<Integer,Boolean>  hm = new HashMap<Integer,Boolean>();
	
public boolean canSumDynamic(int targetSum, int [] numArray){
        
		
		
		if (hm.containsKey(targetSum)) return hm.get(targetSum);
  
		if (targetSum == 0) return true;
		if (targetSum < 0) return false;
		
		if (numArray.length == 0) return false;
		
		for (int num : numArray) {
			
			final int remainder = targetSum - num;
			
			boolean canSum = canSumDynamic(remainder,numArray);
			
			if (canSum == true) {
				hm.put(targetSum, true);
				return true;
			}
			
			
		}
		hm.put(targetSum, false);
		return false;
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanSum obj = new CanSum();
		int targetSum = 300;
		int [] numArray = {7,14};
		
		boolean canSumAnswer = obj.canSumDynamic(targetSum, numArray);
		
		StringBuilder ansString = new StringBuilder();
    	
    	ansString.append("Target Sum: ")
    		    .append(targetSum)
    		    .append(" Array of numbers: ")
    		    .append(Arrays.toString(numArray))
    		    .append(" Can Sum? ")
    		    .append(canSumAnswer);
    		    
    	
    	
    	
        System.out.println( ansString.toString() );
		
		

	}

}
