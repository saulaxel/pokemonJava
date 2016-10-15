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
	Monstruo[] enUso = new Monstruo[2];
	enUso = {null,null};

	boolean hayGanador = false;
	Scanner sc = new Scanner( System.in );

	System.out.println("Bienvenido al torneo de");
	String combatientes = c1.nombre + " VS " + c2.nombre; 
	System.out.println("\t\t" + combatientes);
	System.out.println("\t\t" + conbatientes.lenght());
	sc.nextLine();

	int i = 1;
	int opcion = -1;
	int contrincante = 0;
	boolean bandera;
	do{
	    System.out.println(Monstruo.SALTOS);
	    contrincante = i%2;
	    System.out.println("Es el turno del jugador " + contrincante );
	    if( contrincante == 1 ){
		enTurno = c1;
	    }else{
		enTurno = c2;
	    }

	    if( enUso[contrincante] == null ){
		System.out.println("Elija un nuevo monstruo para pelear");
		c1.mostrarMonstruos();
		System.out.println("¿Qué monstruo desea usar?");
		
		int index;
		bandera = true;
		do{
		    System.out.println("> ");
		    try{
			index = sc.nextInt();
			if( index >= 1 && index <= 6 ){
			    bandera = false;
			}
		    }catch(Exception ime){}
		}while(bandera);

		enUso[contrincante] == enTurno.monstruos.get(index-1);
	    }
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
