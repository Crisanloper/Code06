import java.util.Scanner;

public class codigo6 {
	public static void main(String[] args) {//añadí un método main para poder realizar las funciones
	    int[] n = new int [20];

	    for (int i = 0; i < 20; i++) {//Se agrega un + para que "i" incremente
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//Se añade la palabra .out a print.
	    }//for
	  
	    System.out.println("¿Qué números quiere resaltar? ");//Le quité el backslage n por que println ya hace la función de salto de linea
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    Scanner scanner = new Scanner(System.in);//Añado escanner para que lea los datos que ingresa el usuario en este caso 1 o 2 
	    int opcion = Integer.parseInt(scanner.nextLine());//Se añade paréntesis de cierre y le agrego scanner para que guarde el dato que solicita 

	    int multiplo = (opcion == 1) ? 5 : 7;//Se ordenan los simbolos de interrogación y dos puntos correctamente 

	    for (int e : n) {//Se cambia for each por for diciendole que e tomará los datos de n en este caso n es el arreglo.
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {//Se cierra llave de if 
	        System.out.print(e + " ");//
	      }//else
	    }//if
	    scanner.close();
	}//for
}//se cierra clase codigo6