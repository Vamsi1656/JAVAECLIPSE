package com.Exceptions;

public class Test2 {
	
	static int i = 0;
	
    public static int printNumber(int x)
    {
  
        i = i + 2;
        System.out.println(i);
        
        if (i == 10)
            return i;
        return i + printNumber(i + 2);
    }

	public static void main(String[] args) {
		
	
        Test2.printNumber(i);
		
	  

	}

}
