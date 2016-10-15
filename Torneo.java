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
	boolean hayGanador;
	Scanner sc = new Scanner( System.in );

	System.out.println("Bienvenido al torneo de");
	String combatientes = c1.nombre + " VS " + c2.nombre; 
	System.out.println("\t\t" + combatientes);
	System.out.println("\t\t" + conbatientes.lenght());
	
	// RegresarA al ganador
	return c1;
    }
}
