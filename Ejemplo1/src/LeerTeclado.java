import java.util.Scanner;
public class LeerTeclado {

	public static void main(String[] args) {

		String nombre;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca su nombre (cadena)");
		nombre=entrada.nextLine();			//LEER LINEA
		System.out.println("NOMBRE: "+nombre);
		
		System.out.println("Introduzca su edad ");
		int edad=entrada.nextInt();		// LEER ENTERO	
		System.out.println("EDAD, "+edad);
		
		entrada.nextLine();	//PARA LIMPIAR EL BUFFER
		
		System.out.println("Introduzca su apellido (cadena)");
		String apellido=entrada.nextLine();		//LEER LINEA	
		System.out.println("APELLIDO: "+apellido);
		entrada.close();
	}
	
	//PISTAS
		//String.valueOf(numero);
		//""+numero;
	    //Integer.toStrig(numero);

}
