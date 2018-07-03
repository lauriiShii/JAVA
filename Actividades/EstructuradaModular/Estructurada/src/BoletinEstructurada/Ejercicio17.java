package BoletinEstructurada;
import java.util.Scanner;

public class Ejercicio17 {
	/**
	 * Utilizando un bucle for con dos contadores, realiza un programa que dados
	 * dos números enteros a y b que se introducen por teclado(a<b), vaya
	 * aumentando a al doble de su valor y disminuyendo b a la mitad de su valor
	 * hasta que a>b.
	 */
	
	//1.PETICION DE DATOS ENTEROS A<B
	//2.BUCLE HASTA QUE A>B 
	//2.1 AUMENTAR A AL DOBLE DE SU VALOR Y MOSTRAR
	//    DISMINUIR B A LA MITAD Y MOSTRAR
	
	public static void main(String[] args) 
	{		
		Scanner teclado= new Scanner(System.in);
		int n1,n2,i,j,k;

		do{ //PETICION DE DATOS AL USUARIO
			System.out.println("Introduce numero positivo distinto de 0");
			n1=teclado.nextInt();
		
			System.out.println("Introduce numero mayor que el anterior");
			n2=k=teclado.nextInt();
		
			if (n1>=n2 || n1<=0)
				System.out.printf("El numero %d debe ser mayor que %d, ambos deben ser mayores que 0 %n",n2,n1);
		}
		while (n1>=n2 || n1<=0); //CONTROLAMOS QUE EL SEGUNDO NUMERO SEA MAYOR QUE EL PRIMERO, Y QUE ESTE SEA POSITIVO Y MAYOR QUE 0
		
		for( i=n1*2, j=n2/2 ; i<=j ;i*=2, j/=2) //IGUALO i A N1*2 Y j A N2/2 PORQUE QUIERO QUE EN LA PRIMERA ITERACION YA FUNCIONE
		{                                       //AUMENTAR n1 AL DOBLE DE SU VALOR Y MOSTRAR---DISMINUIR B A LA MITAD Y MOSTRA
			System.out.printf("%d * 2 = %d %n",i/2,i);
			System.out.printf("%d / 2 = %d %n",k,j);
			k=j;
		}
		System.out.printf("Resultado final %d * 2 = %d %n",i/2,i);
		System.out.printf("Resultado final %d / 2 = %d %n",j*2,j);

		teclado.close();
	}

}