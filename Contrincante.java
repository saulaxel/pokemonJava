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
    protected ArrayList<Monstruo> monstruos = new ArrayList<>();
    protected ArrayList<Pocima> pocimas = new ArrayList<>();

    public contrincante(){
	int i;
	System.out.println("Elija los monstruos iniciales: ");
	for( i = 1; i < 6; ++i ){
	    System.out.println("\t 1)");
	    System.out.println("\t 2)");
	    System.out.println("\t 3)");
	    System.out.println("\t 4)");
	    System.out.println("\t 5)");
	    System.out.println("\t 6)");
	    System.out.println("\t 7)");
	    System.out.println("\t 8)");
	    System.out.println("\t 9)");
	    System.out.println("\t10)");
	    System.out.println("\t11)");
	    System.out.println("\t12)");
	}
    }

    protected void guardarMonstruo( Monstruo m ){
	monstruos.add(m);
    }

    protected Monstruo elegirMonstruo(){
	for( Monstruo m: 
    }
}
