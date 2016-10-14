/*
 * Universidad Nacional Autonoma de MExico
 * IngenierIa en computaciOn
 * Integrantes:
 *  MartInez Ortiz SaUl Axel
 *  Nava Luján Francisco José
 * PROTECO, generaciOn 33
 * Java bAsico, proyecto 1
 * DescripciOn: VersiOn en java del juego de pokemon
 *  sin interfaz grAfica
 * Recursos o fuentes:

 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Clase Contrincante que representa un jugador y sus monstruos así
 * como sus métodos
 * @author paco 
 * @author saul
*/
public class Contrincante{
    protected ArrayList<Monstruo> monstruos;
    protected ArrayList<Pocima> pocimas;
    String nombre;

    public contrincante(){
	int i;
	Scanner sc = new Scanner( System.in );

	System.out.println("¿Cuál es su nombre?");
	this.nombre = sc.nextLine();

	System.out.println("Elija los monstruos iniciales: ");

	monstruos = new ArrayList<Monstruo>();
	pocimas = new ArrayList<Pocima>();

	Monstruo monstruoNuevo;
	for( i = 1; i < 6; ++i ){
	    int eleccion = 0;
	    System.out.println("\t 1) Electrode");
	    System.out.println("\t 2) Gato ");
	    System.out.println("\t 3) Pikachu");
	    System.out.println("\t 4) ");
	    System.out.println("\t 5)");
	    System.out.println("\t 6)");
	    System.out.println("\t 7)");
	    System.out.println("\t 8)");
	    System.out.println("\t 9)");
	    System.out.println("\t10)");
	    System.out.println("\t11)");
	    System.out.println("\t12)");
	    
	    do{
		boolean b = true;
		System.out.print("> ");
		try{
		    eleccion = sc.nextInt();
		    if( eleccion > 0 && eleccion < 13 ){
			b = false;
		    }
		}catch(InputMismatchException ime){}
	    }while(b);

	    System.out.println("Ingrese el apodo de su nuevo pokemon");
	    String apodo = sc.nextLine();

	    switch( eleccion ){
		case 1:
		    monstruoNuevo = new Electrode();	
		break;

		case 2:
		    monstruoNuevo = new Gato();
		break;

		case 3:
		    monstruoNuevo = new ();
		break;

		case 4:
		    monstruoNuevo = new();
		break;

		case 5:
		    monstruoNuevo = new();
		break;

		case 6:
		    mostruoNuevo = new();
		break;

		case 7:
		    monstruoNuevo = new();
		break;

		case 8:
		    monstruoNuevo = new();
		break;

		case 9:
		    monstuoNuevo = new();
		break;

		case 9:
		    monstruoNuevo = new();
		break;

		case 10:
		    monstruoNuevo = new();
		break;

		case 11:
		    monstruoNuevo = new();
		break;

		case 12:
		    monstruoNuevo = new();
		break;
	    }
	    
	    monstruos.add(monstruoNuevo);
	}
    }

    protected void guardarMonstruo( Monstruo m ){
	monstruos.add(m);
    }

    protected Monstruo elegirMonstruo(){
	for( Monstruo m: 
    }
}
