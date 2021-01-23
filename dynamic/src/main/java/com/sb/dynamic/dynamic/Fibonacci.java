package com.sb.dynamic.dynamic;

/**
 * Hello world!
 *
 */
public class Fibonacci 
{
	public int fibonacci(int n){
        if (n <= 0){
            return 0;
        }

        if ( n == 1){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
        
    }
	
    public static void main( String[] args )
    {
    	Fibonacci obj = new  Fibonacci();
    	
    	int number = 25;
    	
    	int fibonacciAnswer = obj.fibonacci(number);
    	
    	StringBuilder ansString = new StringBuilder();
    	
    	ansString.append("The Fibonacci of ")
    		    .append(number)
    		    .append(" is ")
    		    .append(fibonacciAnswer);
    		    
    	
    	
    	
        System.out.println( ansString.toString() );
    }
}
