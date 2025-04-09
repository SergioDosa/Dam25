import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner  entrada= new Scanner(System.in);		
		String texto=entrada.nextLine();		
		
		int cantidadPalabras=contarPalabras(texto.trim());
		
		System.out.println("Texto texto tiene "+cantidadPalabras+" palabras");
		entrada.close();
	}

	private static int contarPalabras(String texto) {
		//int cantidad = 0;
		
		int contador=0;		
		if(texto.length()==0)  return 0;
		
		if(Character.isLetter(texto.charAt(0))) contador++;		
			for(int i=0; i<texto.length();i++) {				
				if(texto.charAt(i)==' ' && Character.isLetter(texto.charAt(i+1))) {					
					contador++;
				}				
			}
				
		/*for(int i=0; i<texto.length();i++) {				
			if(texto.charAt(i)==' ' && texto.charAt(i+1)!=' ') {				
				cantidad++;
			}					
		}	*/						
		//return cantidad+1;
		return contador;
	}

}
