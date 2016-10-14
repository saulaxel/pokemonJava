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
import java.io.File;
/**
 * <descripciOn>
 * @author paco 
 * @author saul
*/
public class Gato extends MonstruoHierba{
//    public void ataque2(Monstruo objetivo){}

	public Gato(
	    String apodo,
	    byte nivel
	){ 
		super(
			new File("./monstruos_ascii/pokemon2.txt"),
			17,
			13,
			16,
			15,
			apodo,
			nivel
			);
	}

	public void ataque2(Monstruo enemigo){
		int danioInfringido;

		System.out.println("¡" + this.apodo + " realiza rasguño");
		danioInfringido = causarDanio( enemigo );
		System.out.println("El enemigo ha recibido: " + danioInfringido +
			" de daño en este turno"	
		);
		
		if( enemigo.estado.compareTo("fuera de combate") == 0 ){
		    recibirExperiencia( enemigo );  
		}
    }

}
