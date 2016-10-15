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
    protected Contrincante enTurno;
    protected equipo.Monstruo[] enUso;
    private Scanner sc;

    public Torneo( Contrincante c1, Contrincante c2 ){
	this.c1 = c1;
	this.c2 = c2;
    }

    protected Contrincante jugar(){
	enUso = new equipo.Monstruo[2];
	enUso[0] = enUso[1] = null;

	boolean hayGanador = false;
	sc = new Scanner( System.in );

	System.out.println("Bienvenido al torneo de");
	String combatientes = c1.nombre + " VS " + c2.nombre; 
	System.out.println("\t\t" + combatientes);
	System.out.print("\t\t");
	for( int i = 0; i < combatientes.length(); ++i ){
	    System.out.print("_");
	}
	System.out.println("");
	sc.nextLine();

	int i = 1;
	int opcion = -1;
	int contrincante = 0;
	boolean bandera;
	do{
	    System.out.println(equipo.Monstruo.SALTOS);
	    contrincante = i%2;

	    if( enUso[0] == null ){
		elegirMonstruo(0);
	    }
	    if( enUso[1] == null ){
		elegirMonstruo(1);
	    }

	    System.out.println("Las estadisticas de los monstruos son:");
	    System.out.print();

	    System.out.println("Es el turno del jugador " + (1+contrincante) );
	    if( contrincante == 0 ){
		enTurno = c1;
		if( enUso[0].getEstado().compareTo("paralizado") == 0 ){
		    enUso[0].setEstado("ok");
		    bandera = false;
		}else{
		    bandera = true;
		}
	    }else{
		enTurno = c2;
		if( enUso[1].getEstado().compareTo("paralizado") == 0 ){
		    enUso[1].setEstado("ok");
		    bandera = false;
		}else{
		    bandera = true;
		}
	    }
	    
	    if( bandera ){
		System.out.println("¿Qué desea hacer?");
		imprimirMenu();
		do{
		    try{
			opcion = sc.nextInt();
			if( opcion >= 1 && opcion <= 3 ){
			    bandera = false;
			}
		    }catch( Exception ime ){}
		}while( bandera );

		switch( opcion ){
		}
	    }else{
		System.out.println("No hay turno para tu monstruo paralizado");
	    }

	    ++i;
	}while( !hayGanador );
	
	// RegresarA al ganador
	return c1;
    }

    private void elegirMonstruo( int contrincante ){
	System.out.println("El contrincante " + (contrincante+1) + " debe elegir otro monstruo para pelear");
	Contrincante c; 
	if( contrincante == 0 ){
	    c = c1;
	}else{
	    c = c2;
	}

	c.mostrarMonstruos();
	System.out.println("¿Qué monstruo desea usar?");
		
	int index = 0;;
	boolean bandera = true;
	do{
	    System.out.print("> ");
	    try{
		index = sc.nextInt();
		if( index >= 1 && index <= c.monstruos.size() ){
		    bandera = false;
		}
	    }catch(Exception ime){}
	}while(bandera);
	enUso[contrincante] = c.monstruos.get(index);
    }

    private void imprimirMenu(){
	System.out.println("\t\t 1) Ataque1");
	System.out.println("\t\t 2) Ataque2");
	System.out.println("\t\t 3) Usar pocima");
    }

    private void imprimirPocimas(int contrincante){
	Contrincante c; 
	if( contrincante == 0 ){
	    c = c1;
	}else{
	    c = c2;
	}

	c.mostrarPocimas();
    }
}
