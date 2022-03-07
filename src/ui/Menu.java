package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import model.SetArithmetic;

public class Menu {
	private int elementsA;
	private int elementsB;
	private String elementX;
	private Set<String> setA;
	private Set<String> setB;
	private SetArithmetic<String> sa;
	
	public Menu() {
		setA = new HashSet<String>();
		setB = new HashSet<String>();
		sa = new SetArithmetic<String>();
	}
	
	public void showMenu() {
		System.out.println("\nIngrese la opción que desee realizar: ");
		System.out.println("[1] Operaciones con conjuntos.\n"+
		                   "[2] Salir del programa.\n");
	}
	
	public int readOption(BufferedReader br) throws NumberFormatException, IOException {
		int option = Integer.parseInt(br.readLine());
		return option;
	}
	
	public void doOption(int option, BufferedReader br) throws NumberFormatException, IOException {
		switch(option) {
		
		case 1:
			System.out.println("-----------------------------------------------------");
			System.out.println("             OPERACIONES CON CONJUNTOS");
			System.out.println("-----------------------------------------------------");
			readData(br);
			showInfo();
			break;
				
		case 2:
			System.out.println("Bye! :)");
			break;
			
			default: 
				System.out.println("Opción inválida. Intenta de nuevo ...");
				showMenu();
		}
	}
	
	public void startProgram() throws NumberFormatException, IOException {
		int option = 0;
		int exit = 2;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			setA.removeAll(setA);
			setB.removeAll(setB);
			showMenu();
			option = readOption(br);
			doOption(option, br);
		}while(option != exit);
		
	}
	
	private void readData(BufferedReader br) throws IOException {
		System.out.println("<<<<<<<<<<  CONJUNTO A  >>>>>>>>>>");
		System.out.print("En primer lugar, escriba la cantidad de elementos del conjunto A (valor numérico): ");
		elementsA = Integer.parseInt(br.readLine());
		String [] a = new String[elementsA];
		System.out.println("A continuación, en cada línea escriba los "+elementsA+ " elementos del conjunto A.\nPresiona enter cada vez que se agregue un nuevo elemento.");
		
		for(int i=0;i<a.length;i++) {
			elementX = br.readLine();
			a[i] = elementX;
		}
		setA.addAll(Arrays.asList(a));
		
		System.out.println("<<<<<<<<<<  CONJUNTO B  >>>>>>>>>>");
		System.out.print("En primer lugar, escriba la cantidad de elementos del conjunto B (valor numérico): ");
		elementsB = Integer.parseInt(br.readLine());
		String [] b = new String[elementsB];
		System.out.println("A continuación, en cada línea escriba los "+elementsB+ " elementos del conjunto B.\nPresiona enter cada vez que se agregue un nuevo elemento.");
		
		for(int i=0;i<b.length;i++) {
			elementX = br.readLine();
			b[i] = elementX;
		}
		setB.addAll(Arrays.asList(b));
	}
	
	private void showInfo() {
		System.out.println("A unión B (A U B) = "+sa.union(setA, setB));
		System.out.println("Intersección entre A y B = "+sa.intersection(setA, setB));
		System.out.println("Diferencia entre A y B = "+sa.difference(setA, setB));
	
	}
}