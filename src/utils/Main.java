package utils;
import java.util.Scanner;
public class Main {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota este:");
		Integer nota = sc.nextInt();
		System.out.println("Alegeti materia:");
		System.out.println("1-DE");
		System.out.println("2-SS");
		System.out.println("3-Engleza");
		System.out.println("4-MS");
		Integer optiuni = sc.nextInt();
		
		
		switch(optiuni)
		{
		case 1 : 		System.out.println("Nota la DE este:" +nota);
		break;
		case 2 : 		System.out.println("Nota la SS este:" +nota);
		break;
		case 3 : 		System.out.println("Nota la engleza este:" +nota);
		break;
		case 4 : 		System.out.println("Nota la MS este:" +nota);
		break;
		}
		
	}		

}
