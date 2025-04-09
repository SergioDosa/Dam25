import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner  entrada= new Scanner(System.in);			
		String palabraMayor="";
		int lonMayor=0;
		
		//String lista[]=new String[5];
		
		for (int i=1; i<=5;i++) {			
			System.out.println("Introducle la  palabra"+i);
			String palabra=entrada.nextLine();//casa		
			//palabra.trim();
			if(palabra.length()>lonMayor) {
				palabraMayor=palabra;
				lonMayor=palabra.length();
			}									
		
		}
		
		System.out.println("Palabra con mayor longitud"+ palabraMayor);
		System.out.println("Tamaño "+lonMayor);
		entrada.close();

	}

}
