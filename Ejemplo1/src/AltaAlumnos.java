import java.util.Scanner;

public class AltaAlumnos {

	public static void main(String[] args) {
		int totalAlumnos=2;
		Scanner entrada= new Scanner(System.in);
			//System.out.println("Introduce el número de alumnos");
			//totalAlumnos=entrada.nextInt();
			//entrada.nextLine();			
		
		String [] nombres=new String[totalAlumnos];
		String [] apellidos=new String[totalAlumnos];
		int [] edades=new int[totalAlumnos];
		
		//String [i] alumnos=nombres[i]+apellidos[i]+edades[i];
		
		for(int i=0;i<totalAlumnos;i++) {
			
			System.out.println("Introduce el nombre");
			nombres[i]=entrada.nextLine();
			
			System.out.println("Introduce el apellido");
			apellidos[i]=entrada.nextLine();
			
			System.out.println("Introduce el edad");
			edades[i]=entrada.nextInt();
			
			entrada.nextLine();
			
		}
		
		for(int i=0;i<totalAlumnos;i++) {
			System.out.println("nombre: "+nombres[i]+ "apellido: "+ apellidos[i]+ 
																		"edad: "+edades[i]);
		}
		entrada.close();
	}
}
