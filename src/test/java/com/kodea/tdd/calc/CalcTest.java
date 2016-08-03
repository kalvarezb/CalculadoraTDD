package com.kodea.tdd.calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
	
	@Test
	
	public void checkInstance(){
		
		//arrange
		Calc calc;
		
		//act
		calc=new Calc();
		
		//assert
		assertNotNull(calc);
		
	}
	
	@Test
	public void checkAddTwoIntegers(){
		Calc calc;
		calc=new Calc();
		int val1=1;
		int val2=20;
		
		double result=calc.add(val1,val2);
		
		assertEquals(21,result,0.1);
	}
	
	@Test
	public void checkSubtractTwoIntegers(){
		Calc calc;
		calc=new Calc();
		int val1=10;
		int val2=6;
		
		double result=calc.subtract(val1,val2);
		
		assertEquals(4,result,0.1);
		
	}
	
	@Test
	public void checkMultiplyTwoIntegers(){
		Calc calc;
		calc=new Calc();
		int val1=5;
		int val2=6;
		
		double result=calc.multiply(val1,val2);
		
		assertEquals(30,result,0.1);
	}
	
	@Test
	public void checkDivideTwoIntegers(){
		Calc calc;
		calc=new Calc();
		int val1=10;
		int val2=2;
		
		double result=calc.divide(val1,val2);
		
		assertEquals(5,result,0.1);
	}
	
	@Test (expected = ArithmeticException.class)
	public void checkDivideByZero(){
		
		Calc calc;
		calc=new Calc();
		int val1=10;
		int val2=0;
		
		calc.divide(val1, val2);
	}
	
	

}
