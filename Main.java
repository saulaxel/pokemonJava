/*
 * Universidad Nacional Autonoma de MExico
 * IngenierIa en computaciOn
 * Integrantes:
 *  MartInez Ortiz SaUl Axel
 *  Nava Luján Francisco José
 * PROTECO, generaciOn 33
 * Java bAsico, proyecto 1
 * DescripciOn: VersiOn en java del juego de pokemon
 *  sin interfaz grafica
 * Recursos o fuentes:

 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.InputMismatchException;

/**
 * Clase principal del juego de combates de monstruos estílo pokémon
 * @author paco 
 * @author saul
 */
public class Main{
    private static final String ARCHIVO_USUARIOS = "algo.txt";
    private static final int SALIR = 2;

    private static final Scanner sc = new Scanner( System.in ); 

    public static void main( String[] args ){
	ArrayList<Contrincante> usuarios = new ArrayList<>();

	System.out.println(Monstruo.SALTOS);
	System.out.println("\t\tBienvenido al PPROTEMON");
	System.out.println("\t\t_______________________");
	System.out.println("\n\n\n\n\n");
	sc.nextLine();

	usuarios = leerUsuarios();
	
	int opcion;
	
	do{
	    System.out.println(Monstruo.SALTOS);
	    System.out.println("Indique la opción que desea realizar");
	    imprimirMenu(); 
	    opcion = leerOpcion();

	    switch( opcion ){
		case 1:
		    iniciarJuego();
		break;

		case SALIR:
		System.out.println("Esperamos volver a verl@ pronto");
		sc.nextLine();
		break;
	    }
	}while( opcion != SALIR );
    }

    private static void imprimirMenu(){
	System.out.println("\t1) Jugar");
	System.out.println("\t" + SALIR + ") Salir");
    }

    private static void iniciarJuego(){
	
    }

    private static int leerOpcion(){
	boolean bandera = true;
	int leido = 0;

	do{
	    try{
		leido = sc.nextInt();
		if( leido >= 1 && leido <= SALIR ){
		    bandera = false;    
		}else{
		    System.out.println("Número fuera de rango");
		}
	    }catch(InputMismatchException ime){
		System.out.println("Eso no es un número");
	    }
	    sc.nextLine();
	}while(bandera);
	
	return leido;
    }
}

