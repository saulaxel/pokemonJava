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

//import java.util.Scanner;
/**
 * Clase pocima que representa a las diferentes ayudas que el jugador
 * le puede dar a sus monstruos
 * @author paco 
 * @author saul
*/
public class PocimaAtaque extends Pocima{
    protected int anterior;

    public PocimaAtaque(){
		super("ataque");
    }

    public void usarPocima(equipo.Monstruo objetivo){
    	anterior = objetivo.getAtaque();
    	objetivo.recibirAtaque();
    	System.out.println("El ataque de " + 
    		objetivo.getApodo() + 
    		" se incrementó " + 
    		((objetivo.getAtaque())-anterior) + 
    		" puntos.");
    }
}
