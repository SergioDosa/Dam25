import java.util.Scanner;

public class Ej8 {
	
	public static void main(String[] args) {
	
		Scanner  entrada= new Scanner(System.in);		
		
		System.out.println("Introduce palabra a comprobar");
		
		String palabra= entrada.nextLine();
		
		if (isPalin(palabra)) {
			
			System.out.println(palabra+" es palindrómo");
		}else {
			
			System.out.println(palabra+" no es palindrómo");
		}
		
		entrada.close();
		
	}

	private static boolean isPalin(String palabra) {
		
		int longitud= palabra.length(); 				
		for(int i=0; i<longitud/2;i++) {			
			if(palabra.charAt(i)!=palabra.charAt(longitud-i-1)) {				
				return false;				
			}
		}						
		return true;
	}

}
