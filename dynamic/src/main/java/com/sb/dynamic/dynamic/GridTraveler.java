package com.sb.dynamic.dynamic;

import java.util.HashMap;

public class GridTraveler {
	
	class MyKey {
	    int firstIndex;
	    int secondIndex;
	    // important: override hashCode() and equals()
	}
	
	public Long gridTravelerRecursive( Long y, Long x) {
		if (x == 0 || y  == 0) {
			return 0l;
		}
		if (x == 1 && y  == 1) {
			return 1l;
		}
		
		return gridTravelerRecursive(y-1 ,x) + gridTravelerRecursive(y ,x-1) ;
		
	}
	
	HashMap<String,Long>  hm = new HashMap<String,Long>();
	
	
	
	public Long gridTravelerDynamic(Long y, Long x){
        
		StringBuilder sb = new StringBuilder();
    	
    	sb.append(y)
	    .append(",")
	    .append(x);
    	
		String key = sb.toString();
		
		if (hm.containsKey(key)) {
        	return hm.get(key);
        }
		
		if (x == 0 || y  == 0) {
			return 0l;
		}
		if (x == 1 && y  == 1) {
			return 1l;
		}
		
		Long possibleSteps =  gridTravelerDynamic(y-1 ,x) + gridTravelerDynamic(y ,x-1) ;
        
        hm.put(key, possibleSteps);
        
        
        return possibleSteps;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridTraveler obj = new  GridTraveler();
		
		
		// y is vertical
		Long y = 18l;
		
		// x is horizontal
		Long x = 18l;
		
		Long gridTravelerAnswer = obj.gridTravelerDynamic(y, x);
		
		StringBuilder ansString = new StringBuilder();
    	
    	ansString.append("No. of ways to travel grid size of ")
    		    .append(y)
    		    .append(" X ")
    		    .append(x)
    		    .append(" is ")
    		    .append(gridTravelerAnswer);
    		    
    	
    	
    	
        System.out.println( ansString.toString() );
        
        
	}

}
