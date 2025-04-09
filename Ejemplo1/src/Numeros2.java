import java.util.Scanner;

public class Numeros2 {

	public static void main(String[] args) {

		Scanner  entrada= new Scanner(System.in);
		int n =0;
		System.out.println("Introduce la cantidad de números");
		n=entrada.nextInt();		
		int []numeros=new int[n];		
		int maximo = 0, minimo=0,repMax=0, repMin=0;
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Introduce el número");
			numeros[i]=entrada.nextInt();
			entrada.nextLine();			
			if(i==0) {
				maximo=numeros[i];
				minimo=numeros[i];
			}
			if(numeros[i]>maximo) {
				maximo=numeros[i];
				repMax=0;
			}else {
				if(numeros[i]<minimo) {
					
					minimo=numeros[i];
					repMin=0;
				}
			}
			if(maximo==numeros[i]) {
				repMax++;
			}
			if(minimo==numeros[i]) {
				repMin++;
			}			
		}		
		System.out.println("Max= "+maximo+"->"+repMax);
		System.out.println("Min= "+minimo+"->"+repMin);		
		entrada.close();		
	}
}
