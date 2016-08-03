package com.kodea.tdd.calc;

import org.springframework.stereotype.Service;

@Service
public class Calc implements ICalc {

//	public double add(int val1, int val2) {
//		double result=val1+val2;
//		return result;
//	}
//
//	public double subtract(int val1, int val2) {
//		double result=val1-val2;
//		return result;
//	}
//
//	public double multiply(int val1, int val2) {
//		double result=val1*val2;
//		return result;
//	}
//
//	public double divide(int val1, int val2) {
//		if(val2==0){
//			throw new ArithmeticException();
//		}		
//		double result=val1/val2;
//		return result;	
//	}

	@Override
	public double add(double val1, double val2) {
		return val1+val2;
	}

	@Override
	public double subtract(double val1, double val2) {
		return val1-val2;
	}

	@Override
	public double multiply(double val1, double val2) {
		return val1*val2;
	}

	@Override
	public double divide(double val1, double val2) {
		if(val2==0){
			throw new ArithmeticException();
		}		
		return val1/val2;	
	}
	
	
	
	

}
