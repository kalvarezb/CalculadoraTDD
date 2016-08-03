package com.kodea.tdd.calc;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		
		//Falta ciclo
		
		System.out.println("Ingrese opcion");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("5. Salir");
		
		int opcion=scanner.nextInt();

		
		System.out.println("Ingrese valor 1");
		
		int val1=scanner.nextInt();
		
		System.out.println("Ingrese valor 2");
		
		int val2=scanner.nextInt();
		
		calcular(opcion,val1,val2);	

	}
	
	public static void calcular(int opcion, int val1, int val2){

		Calc calc=new Calc();
		
		switch(opcion){
		case 1:
			double result1=calc.add(val1, val2);
			System.out.println("El resultado es: "+result1);
			break;
		case 2:
			double result2=calc.subtract(val1, val2);
			System.out.println("El resultado es: "+result2);

			break;
		case 3:
			double result3=calc.multiply(val1, val2);
			System.out.println("El resultado es: "+result3);

			break;
		case 4:
			double result4=calc.divide(val1, val2);
			System.out.println("El resultado es: "+result4);

			break;
		}
		
	}
		

	}


