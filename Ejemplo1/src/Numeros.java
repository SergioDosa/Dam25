
/*Leer una cantidad ‘N’ y luego introducir ‘N’ números enteros.
 * Se pide imprimir el mayor y el menor y las veces que aparece cada uno*/

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		Scanner  entrada= new Scanner(System.in);
		int n =0;
		System.out.println("Introduce la cantidad de números");
		n=entrada.nextInt();		
		int []array=new int[n];
		
		for(int i=0; i<n;i++) {
			System.out.println("Introduce un número");			
			array[i]=entrada.nextInt();			
		}		
		for(int i=0; i<n;i++) {
			System.out.println(array[i]);
		}		
		int max=array[0], min=array[0];		
		for(int i=1; i<n;i++) {			
			if(array[i]>max) {
				max=array[i];
			}else {
				if(array[i]<min) {
					min=array[i];
				}
			}
		}		
		int cantMax=0, cantMin=0;		
		for(int i=0; i<n;i++) {
			
			if(array[i]==max) {
				cantMax++;
			}else {
				if(array[i]==min) {
					cantMin++;
				}
			}			
		}
		System.out.println("Max= "+max+"->"+cantMax);
		System.out.println("Min= "+min+"->"+cantMin);		
		entrada.close();
	}
}
