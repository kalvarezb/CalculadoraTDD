import java.util.Scanner;

public class Main {
	
	public static void main (String args[]){
		Scanner scanner=new Scanner(System.in);
		int opcion=0;
		int opcionDos=0;
		
		do{
			
			System.out.println("Ingrese operaci�n");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicaci�n");
			System.out.println("4. Divisi�n");
			opcion=scanner.nextInt();			
			
		System.out.println("Ingrese primer n�mero");
		double numeroUno=scanner.nextDouble();
		System.out.println("Ingrese segundo n�mero");
		double numeroDos=scanner.nextDouble();
		
		double resultado=0;
		
		switch(opcion){
		
		case 1: 
			resultado=numeroUno+numeroDos;
			break;
		case 2:
			resultado=numeroUno-numeroDos;
			break;
		case 3:
			resultado=numeroUno*numeroDos;
			break;
		case 4:
			resultado=numeroUno/numeroDos;
			break;	
		case 5:
			break;
			default:
				break;
		}
		
		System.out.println("El resultado es "+resultado);
		System.out.println("Presione 1 para continuar");
		System.out.println("Cualquier otro n�mero para salir");
		opcionDos=scanner.nextInt();
		
			}while(opcionDos!=1);
		
		}		
		
	}


