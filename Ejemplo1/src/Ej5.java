import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		Scanner  entrada= new Scanner(System.in);	
		
		System.out.println("Introduce una palabra ");
		
		String palabra =entrada.nextLine();
		
		for(int i=0; i<palabra.length();i++) {
			
			System.out.print(palabra.charAt(i)+" ");
			
		}
		entrada.close();
	}
	

}
