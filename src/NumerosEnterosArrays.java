import java.util.Scanner;
import java.util.Arrays;

public class NumerosEnterosArrays {
static public void main(String[] args) {
	

	  Scanner entrada = new Scanner(System.in);
	  
	  int[] NumerosEnteros = new int [5];
	  String[] Numeros = {"primer","segundo","tercer","cuarto","quinto"};
	  int sum = 0;
	  
	  for(int i=0; i<5;i++){
	    System.out.println("Introduzca el "+Numeros[i]+" numero:");
	    sum=sum+(NumerosEnteros[i] = entrada.nextInt());
	  }
	  
	 System.out.print("Del listado de números [");
	  for(int i=0; i<5;i++){
	  System.out.print(NumerosEnteros[i]+ ",");
	  }
	  System.out.println("] obtuvimos:");
	  Arrays.sort(NumerosEnteros); 
	  
	  System.out.println(" El número menor es: " +NumerosEnteros[0]);
	  System.out.println(" El número mayor es:  "+NumerosEnteros[4]);
	  System.out.println("La sumatoria de los números es:  " + sum);
	  		
}
}
