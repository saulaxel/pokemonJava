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
	    System.out.println("\t 4) Bobomb");
	    System.out.println("\t 5) Bomberman ");
	    System.out.println("\t 6) Chinchou");
	    System.out.println("\t 7) Snorunt");
	    System.out.println("\t 8) Wynaut");
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

	    int nivel;
	    nivel = (int) (Math.random()*10 + 50);

	    switch( eleccion ){
		case 1:
		    monstruoNuevo = new Electrode(apodo,nivel);	
		break;

		case 2:
		    monstruoNuevo = new Gato(apodo,nivel);
		break;

		case 3:
		    monstruoNuevo = new Pikachu(apodo,nivel);
		break;

		case 4:
		    monstruoNuevo = new Bobomb(apodo,nivel);
		break;

		case 5:
		    monstruoNuevo = new Bomberman(apodo,nivel);
		break;

		case 6:
		    mostruoNuevo = new Chichou(apodo,nivel);
		break;

		case 7:
		    monstruoNuevo = new Snorunt(apodo,nivel);
		break;

		case 8:
		    monstruoNuevo = new Wynaut(apodo,nivel);
		break;

		case 9:
		    monstuoNuevo = new (apodo,nivel);
		break;

		case 9:
		    monstruoNuevo = new (apodo,nivel);
		break;

		case 10:
		    monstruoNuevo = new (apodo,nivel);
		break;

		case 11:
		    monstruoNuevo = new (apodo,nivel);
		break;

		case 12:
		    monstruoNuevo = new (apodo,nivel);
		break;
	    }
	    
	    monstruos.add(monstruoNuevo);
	}
    }

    protected void guardarMonstruo( Monstruo m ){
	monstruos.add(m);
    }

    protected Monstruo elegirMonstruo(){
	Scanner sc = new Scanner();
	int i = 1;
	System.out.println("Tus monstruos son: ");
	for( Monstruo m: monstruos ){
	    System.out.println(i + ") " + m.getClass().getName());     
	    ++i;
	} 
	System.out.println("Elije el número de tu monstruo");
	boolean b = true;
	int pos;
	do{
	    System.out.println("> ");
	    try{
		pos = sc.nextLine();
		if( pos >=1 && pos <= 6 ){
		    b = false;    
		}
	    }catch(InputMismatchException ime){}
	}while(b);

	int i = 1;
	for( Monstruo m: monstruo ){
	    if( i == pos ){
		int index = monstruos.indexOf(m);
		return monstruos.get(index);
	    }
	    ++i;
	}
	
    }
}
