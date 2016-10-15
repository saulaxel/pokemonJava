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
import java.util.InputMismatchException;

/**
 * Clase Contrincante que representa un jugador y sus monstruos así
 * como sus métodos
 * @author paco 
 * @author saul
*/
public class Contrincante{
    protected ArrayList<equipo.Monstruo> monstruos;
    protected ArrayList<Pocima> pocimas;
    String nombre;

    public Contrincante(){
	int i;
	Scanner sc = new Scanner( System.in );

	System.out.println("¿Cuál es su nombre?");
	this.nombre = sc.nextLine();

	System.out.println("Elija los monstruos iniciales: ");

	monstruos = new ArrayList<equipo.Monstruo>();
	pocimas = new ArrayList<Pocima>();

	equipo.Monstruo monstruoNuevo = new equipo.monstruoRaro(); // si no la inicializo a algo chilla
	for( i = 1; i < 6; ++i ){
	    int eleccion = 0;
	    System.out.println("\t 1) Electrode");
	    System.out.println("\t 2) Gato ");
	    System.out.println("\t 3) Pikachu");
	    System.out.println("\t 4) Bobomb");
	    System.out.println("\t 5) Bomberman ");
	    System.out.println("\t 6) Chinchou");
	    System.out.println("\t 7) Snorunt");
	    System.out.println("\t 8) Wynaut");
	    System.out.println("\t 9) Diglet");
	    System.out.println("\t10) Star");
	    System.out.println("\t11) Toad");
	    System.out.println("\t12) Underdog");
	    
	    boolean b = true;
	    do{
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

	    byte nivel;
	    nivel = (byte) (Math.random()*10 + 50);

	    switch( eleccion ){
		case 1:
		    monstruoNuevo = new equipo.Electrode(apodo,nivel);	
		break;

		case 2:
		    monstruoNuevo = new equipo.Gato(apodo,nivel);
		break;

		case 3:
		    monstruoNuevo = new equipo.Pikachu(apodo,nivel);
		break;

		case 4:
		    monstruoNuevo = new equipo.Bobomb(apodo,nivel);
		break;

		case 5:
		    monstruoNuevo = new equipo.Bomberman(apodo,nivel);
		break;

		case 6:
		    monstruoNuevo = new equipo.Chinchou(apodo,nivel);
		break;

		case 7:
		    monstruoNuevo = new equipo.Snorunt(apodo,nivel);
		break;

		case 8:
		    monstruoNuevo = new equipo.Wynaut(apodo,nivel);
		break;

		case 9:
		    monstruoNuevo = new equipo.Diglet(apodo,nivel);
		break;

		case 10:
		    monstruoNuevo = new equipo.Star(apodo,nivel);
		break;

		case 11:
		    monstruoNuevo = new equipo.Toad(apodo,nivel);
		break;

		case 12:
		    monstruoNuevo = new equipo.Underdog(apodo,nivel);
		break;
	    }
	    monstruos.add(monstruoNuevo);
	}
    }

    protected void guardarMonstruo( equipo.Monstruo m ){
	monstruos.add(m);
    }

    protected equipo.Monstruo elegirMonstruo(){
	Scanner sc = new Scanner( System.in );
	int i = 1;

	mostrarMonstruos();
	System.out.println("Elije el número de tu monstruo");
	boolean b = true;
	int pos = 0;
	do{
	    System.out.println("> ");
	    try{
		pos = sc.nextInt();
		if( pos >=1 && pos <= 6 ){
		    b = false;    
		}
	    }catch(Exception ime){}
	}while(b);

	i = 1; 
	int index = 0;
	for( equipo.Monstruo m: monstruos ){
	    if( i == pos ){
		index = monstruos.indexOf(m);
	    }
	    ++i;
	}

	return monstruos.get(index);
    }

    public void mostrarMonstruos(){
	int i = 1;
	System.out.println("Tus monstruos son: ");
	for( equipo.Monstruo m: monstruos ){
	    System.out.println(i + ") " + m.getClass().getName());     
	    ++i;
	} 
    }
}
