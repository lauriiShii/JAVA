import java.util.InputMismatchException;
import java.util.Scanner;






public class Teclado {

    static Scanner teclado = new Scanner(System.in);

    public static char imprimirCaracter(String mensaje){
        char caracter;
        System.out.println(mensaje);
        caracter=teclado.nextLine().charAt(0);
        
        return caracter;
    }
    
    public static byte nextByte(String mensaje){
        byte numero;
        System.out.println(mensaje);
        numero = teclado.nextByte();
        System.out.println("");
        return numero;

    }
    
    public static float nextFloat(String mensaje) {
		float n=0;
		boolean error=false;
		do{
			System.out.println(mensaje);
			try {
				n=teclado.nextFloat();
				error=false;
			}catch (InputMismatchException e) {
				System.out.println("¡Error! El numero introducido no esta dentro de rango o no es un dato válido.");
				error=true;
			}finally {//Limpiar el buffer despues de realizar el try catch
				teclado.nextLine();
			}
		}while(error);
	return n;
	}
    
    public static double nextDouble(String mensaje) {
		double n=0;
		boolean error=false;
		do{
			System.out.println(mensaje);
			try {
				n=teclado.nextDouble();
				error=false;
			}catch (InputMismatchException e) {
				System.out.println("Error, el dato introducido no es valido.");//Se llama el mensaje de otra clase para facilitar traduccion
				error=true;
			}finally {//Limpia el buffer despues de hacer el try catch siempre.
				teclado.nextLine();
			}
		}while(error);
	return n;
	}

    public static byte limiteByte(String mensaje, byte rango, Limite limite){

        boolean SeguirCiclo = true;
        byte numero = 0;
        do{
            try{
                System.out.println(mensaje);
                numero = teclado.nextByte();
                switch(limite){
                    case MAYOIGMIN:
                        if(numero >= rango){
                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case MENOIGMAX:
                        if(numero<=rango){
                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case MAYORMIN:
                        if(numero > rango){
                           SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case MENORMAX:
                        if(numero<rango){
                           SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                }

            }catch(InputMismatchException e){
                System.out.println("�Error!, el dato no pertenece al rango.");

            }finally{
                teclado.nextLine();
            }

        }while(SeguirCiclo);

        return numero;
    }

    public static byte minimoMaximoByte(String mensaje, byte minimo, byte maximo, Rango limite){

        boolean SeguirCiclo = true;
        byte numero = 0;
        if(minimo>maximo)
            throw new IllegalArgumentException();
        do{
            try{
                System.out.println(mensaje);
                numero = teclado.nextByte();
                switch(limite){
                    case AMBOSINC:
                        if(numero >= minimo && numero <= maximo){
                            //System.out.printf("El n�mero %d est� incluido entre %d y %d", numero, minimo, maximo);
                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case AMBOSEXC:
                        if(numero > minimo && numero < maximo){
                           // System.out.printf("El n�mero %d est� entre %d y %d", numero, minimo, maximo);
                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case MININCMAXEX:
                        if(numero >= minimo && numero < maximo){
                            //System.out.printf("El numero %d es igual o mayor a %d y menor a %d", numero, minimo, maximo);

                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case MINEXCMAXINC:
                        if(numero > minimo && numero <= maximo){
                            //System.out.printf("El numero %d es mayor que %d y menor o igual que %d", numero, minimo, maximo);

                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                }
            }
            catch(InputMismatchException e){
                System.out.println("�Error!, el dato no pertenece al rango.");
            }
            finally{
                teclado.nextLine();
            }

        }while(SeguirCiclo);

        return numero;
    }

    public static int nextInt(String mensaje){
    	int numero=0;
		boolean error=false;
		do{
			System.out.println(mensaje);
			try {
				numero=teclado.nextInt();
				error=false;
			}catch (InputMismatchException e) {
				System.out.println("¡Error! El numero introducido no es valido");
				error=true;
			}finally {
				teclado.nextLine();
			}
		}while(error);
	return numero;
	}

    public static int limiteInt(String mensaje, int rango, Limite limite){

        boolean SeguirCiclo = true;
        int numero = 0;
        do{
            try{
                System.out.println(mensaje);
                numero = teclado.nextInt();
                switch(limite){
                    case MAYOIGMIN:
                        if(numero >= rango){
                            System.out.printf("El numero %d introducido es mayor o igual que %d", numero, rango);
                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case MENOIGMAX:
                        if(numero<=rango){
                            System.out.printf("El numero %d introducido es menor o igual que %d", numero, rango);
                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case MAYORMIN:
                        if(numero > rango){
                            System.out.printf("El numero %d introducido es mayor o igual que %d", numero, rango);
                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                    case MENORMAX:
                        if(numero<rango){
                            System.out.printf("El numero %d introducido es menor o igual que %d", numero, rango);
                            SeguirCiclo= false;
                        }else
                            System.out.println("El numero introducido no es v�lido.");
                        break;
                }

            }catch(InputMismatchException e){
                System.out.println("�Error!, el dato no pertenece al rango.");

            }finally{
                teclado.nextLine();
            }

        }while(SeguirCiclo);

        return numero;
    }

    public static int minimoMaximoInt(String mensaje, int maximo, int minimo, Rango limite){

        boolean SeguirCiclo = true;
        int numero = 0;

        do{
            try{
                if(minimo>maximo)
                    throw new IllegalArgumentException();

                else{
                    System.out.println(mensaje);
                    numero = teclado.nextInt();
                    switch(limite){
                        case AMBOSINC:
                            if(numero >= minimo && numero <= maximo){
                                System.out.printf("El n�mero %d est� incluido entre %d y %d", numero, minimo, maximo);
                                SeguirCiclo= false;
                            }else
                                System.out.println("El numero introducido no es v�lido.");
                            break;
                        case AMBOSEXC:
                            if(numero > minimo && numero < maximo){
                                System.out.printf("El n�mero %d est� entre %d y %d", numero, minimo, maximo);
                                SeguirCiclo= false;
                            }else
                                System.out.println("El numero introducido no es v�lido.");
                            break;
                        case MININCMAXEX:
                            if(numero >= minimo && numero < maximo){
                                System.out.printf("El numero %d es igual o mayor a %d y menor a %d", numero, minimo, maximo);

                                SeguirCiclo= false;
                            }else
                                System.out.println("El numero introducido no es v�lido.");
                            break;
                        case MINEXCMAXINC:
                            if(numero > minimo && numero <= maximo){
                                System.out.printf("El numero %d es mayor que %d y menor o igual que %d", numero, minimo, maximo);

                                SeguirCiclo= false;
                            }else
                                System.out.println("El numero introducido no es v�lido.");
                            break;
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("�Error!, el dato no pertenece al rango.");
            }catch(IllegalArgumentException a){
                System.out.println("�Error!, el m�nimo es superior al m�ximo");
                SeguirCiclo = false;
            }finally{
                teclado.nextLine();
            }

        }while(SeguirCiclo);

        return numero;
    }




    public static boolean lecturaBoolean(String mensaje, String mensajeTrue,String mensasjeFalse){
        boolean error,booleano=false;
        int opcion=0;

        do{
            System.out.printf("%s%n1.%s%n2.%s%n",mensaje,mensajeTrue,mensasjeFalse);
            try {
                opcion = teclado.nextByte();
                error=false;
            } catch (InputMismatchException e) {
                error=true;
                System.out.println("No has introducido un n�mero correcto");
            }
            finally{
                teclado.nextLine(); //Limpieza del buffer
            }
        }while(opcion!=1 && opcion!=2 || error);

        booleano=(opcion==1)?true:false;
        return booleano;
    }

    public static void limpiarBuffer(){
        teclado.nextLine();
    }



    public static String imprimirCadena(String mensaje){
        String cadena;
        System.out.println(mensaje);
        cadena = teclado.nextLine();

        return cadena;
    }

    public static void cerrarTeclado(){
        teclado.close();
    }


}
