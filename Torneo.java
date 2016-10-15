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
/**
 * <descripciOn>
 * @author paco 
 * @author saul
*/
public class Torneo{
    protected Contrincante c1;
    protected Contrincante c2;

    public Torneo( Contrincante c1, Contrincante c2 ){
	this.c1 = c1;
	this.c2 = c2;
    }

    protected Contrincante jugar(){
	Contrincante enTurno;
	boolean hayGanador = false;
	Scanner sc = new Scanner( System.in );

	System.out.println("Bienvenido al torneo de");
	String combatientes = c1.nombre + " VS " + c2.nombre; 
	System.out.println("\t\t" + combatientes);
	System.out.println("\t\t" + conbatientes.lenght());
	sc.nextLine();

	int i = 1;
	int opcion = -1;
	boolean bandera;
	do{
	    System.out.println(Monstruo.SALTOS);
	    System.out.println("Es el turno del jugador " + i%2 );
	    System.out.println("¿Qué desea hacer?");
	    imprimirMenu();

	    bandera = true;
	    do{
		try{
		    opcion = sc.nextInt();
		    if( opcion >= 1 && opcion <= 3 ){
			bandera = false;
		    }
		}catch( Exception ime ){}
	    }while( bandera );
	    ++i
	}while( !hayGanador ):
	
	// RegresarA al ganador
	return c1;
    }

    private void imprimeMenu(){
	System.out.println("\t\t 1)");
    }
}
