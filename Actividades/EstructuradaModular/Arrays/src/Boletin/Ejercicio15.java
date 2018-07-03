package Boletin;

public class Ejercicio15 {
	/**HISTOGRAMA*/
	public static void main(String[] args) {

	/**DECLARAMOS VARIABLES*/
	int rango1=0, rango2=9, datos [] = {6,4,4,1,9,7,5,6,4,2,3,9,5,6,4}, repeticiones[], i, j ,k ,l ;
	repeticiones = new int [rango2+1];
	
	/**CONTAMOS CUANTAS VECES SE REPITE CADA NUMERO*/
	for (i = rango1; i <= rango2; i++) {
		for (j = 0; j < datos.length; j++)
			if (datos[j] ==  i)
				repeticiones[i] += 1;
		//System.out.printf("%d se repite %d veces%n",i ,repeticiones[i]);
	}
	
	/**DIBUJAMOS HISTOGRAMA PARA LOS NUMEROS ENTRE 0 Y 9*/
	System.out.println("HISTOGRAMA");
	//PUNTOS QUE MARCAN CUANTAS VECES SALEN EN LA SECUENCIA CADA NUM
	for ( k = repeticiones.length; k > 0; k--) {
		for ( l = 0; l < repeticiones.length; l++) {
			
			if(repeticiones[l] < k)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println("");
	}
	//NUMEROS INFERIORES
	for ( i = rango1; i <= rango2; i++)
		System.out.print(i);
	}

}
