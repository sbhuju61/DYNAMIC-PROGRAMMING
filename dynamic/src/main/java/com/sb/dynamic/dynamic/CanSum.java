package com.sb.dynamic.dynamic;

import java.util.Arrays;
import java.util.HashMap;

public class CanSum {
	
	public Boolean canSumRecursive(Integer targetSum, Integer [] numArray) {
		
		if (targetSum == 0) return true;
		if (targetSum < 0) return false;
		
		if (numArray.length == 0) return false;
		
		for (Integer num : numArray) {
			
			final Integer remainder = targetSum - num;
			
			Boolean canSum = canSumRecursive(remainder,numArray);
			
			if (canSum == true) return true;
			
			
		}
		
		return false;
		
		
	}
	
	HashMap<Integer,Boolean>  hm = new HashMap<Integer,Boolean>();
	
public Boolean canSumDynamic(Integer targetSum, Integer [] numArray){
        
		
		
		if (hm.containsKey(targetSum)) return hm.get(targetSum);
  
		if (targetSum == 0) return true;
		if (targetSum < 0) return false;
		
		if (numArray.length == 0) return false;
		
		for (Integer num : numArray) {
			
			final Integer remainder = targetSum - num;
			
			Boolean canSum = canSumDynamic(remainder,numArray);
			
			if (canSum == true) {
				hm.put(targetSum, true);
				return true;
			}
			
			
		}
		hm.put(targetSum, false);
		return false;
        
    }
	
	
	public static void main(String[] args) {
		
		CanSum obj = new CanSum();
		Integer targetSum = 300;
		Integer [] numArray = {7,14};
		
		Boolean canSumAnswer = obj.canSumDynamic(targetSum, numArray);
		
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
