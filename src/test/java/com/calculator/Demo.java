package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calculator.SimpleCalculator.App;

class Demo {
	App obj=new App();

	   @Test
	   public void testForAdd()
	   {
	        int x=obj.add(4, 5);
	       assertEquals(9,x);
	    }
	    
	    @Test
	    public void testForSub()
	    {
	       int x=obj.sub(14, 4);
	        assertEquals(10,x);
	    }
	

}
