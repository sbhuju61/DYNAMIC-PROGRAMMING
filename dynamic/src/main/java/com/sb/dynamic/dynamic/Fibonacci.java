package com.sb.dynamic.dynamic;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class Fibonacci 
{
	public Long fibonacciRecursive(Long n){
        if (n <= 0){
            return 0l;
        }

        if ( n == 1){
            return 1l;
        }

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        
    }
	
	HashMap<Long,Long>  hm = new HashMap<Long,Long>();
	
	public Long fibonacciDynamic(Long n){
        
		if (hm.containsKey(n)) {
        	return hm.get(n);
        }
		
		if (n == 0){
            return 0l;
        }

        if ( n == 1){
            return 1l;
        }
        
        
        
        Long nthValue = fibonacciDynamic(n-1) + fibonacciDynamic(n-2);
        
        hm.put(n, nthValue);
        
        return nthValue;
        
    }
	
	
    public static void main( String[] args )
    {
    	Fibonacci obj = new  Fibonacci();
    
    	Long number = 50l;
    	
    	// Long fibonacciAnswer = obj.fibonacciRecursive(number);
    	Long fibonacciAnswer = obj.fibonacciDynamic(number);
    	
    	StringBuilder ansString = new StringBuilder();
    	
    	ansString.append("The Fibonacci of ")
    		    .append(number)
    		    .append(" is ")
    		    .append(fibonacciAnswer);
    		    
    	
    	
    	
        System.out.println( ansString.toString() );
    }
}
