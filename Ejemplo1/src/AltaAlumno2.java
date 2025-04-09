import java.util.Scanner;

public class AltaAlumno2 {	
	
	static Scanner  entrada= new Scanner(System.in);
	
	public static void main(String[] args) {
		int cantidad =0;
		cantidad=cantidadAlumnos();
		altaAlumnos(cantidad);
	}
	
	private static int cantidadAlumnos() {		
		System.out.println("Introduce el número de alumnos..");
		int cantidad=entrada.nextInt();
		entrada.nextLine();		
		return cantidad;				
	}
	
	public static void altaAlumnos(int cantidad) {		
		int numeroAlumnos=1;
		int longitud=cantidad*3;
		String [] alumnos=new String[longitud];
		
		for(int i=0;i<longitud;i+=3) {	
			
			System.out.println("Introduce el nombre del alumno"+numeroAlumnos);			
			alumnos[i]=entrada.nextLine();			
			System.out.println("Introduce el apellido");			
			alumnos[i+1]=entrada.nextLine();			
			System.out.println("Introduce la edad");
			
				int edad=entrada.nextInt();								
				alumnos[i+2]=Integer.toString(edad);	
				
				entrada.nextLine();	
				
			numeroAlumnos++;			
		}		
		System.out.println("LISTADO ALUMNOS:");
		
		for (int i=0; i<alumnos.length;i++) {			
			System.out.println("- "+alumnos[i]);
		}		
	}

}
