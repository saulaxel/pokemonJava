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
package equipo;

import java.util.Scanner;
import java.io.File;
/**
 * <descripciOn>
 * @author paco 
 * @author saul
*/
public class Underdog extends MonstruoFuego{
//    public void ataque2(Monstruo objetivo){}

	public Underdog(
	    String apodo,
	    byte nivel
	){ 
		super(
			new File("./monstruos_ascii/pokemon14.txt"),
			19,
			14,
			16,
			15,
			apodo,
			nivel
			);
	}

	public void ataque2(Monstruo enemigo){
		int danioInfringido;

		System.out.println("¡" + this.apodo + " realiza piromanía");
		danioInfringido = causarDanio2( enemigo );
		System.out.println("El enemigo ha recibido: " + danioInfringido +
			" de daño en este turno"	
		);
		try{ Thread.sleep(3000); }catch(Exception e){}
		
		if( enemigo.estado.compareTo("fuera de combate") == 0 ){
		    recibirExperiencia( enemigo );  
		}
    }

    protected int causarDanio2( Monstruo enemigo ){
		int danio = 0;
		byte tipoDanio = 0;

		if( (int)(Math.random()*5) != 0 ){ // 80% probabilidad de acertar
		    danio = (this.getAtaque() - enemigo.getDefensa());
		    danio *= this.multiplicadorElemental( enemigo );
		    if( (int)(Math.random()*10) == 0 ){ // 5% de golpe crItico
				danio *= 2;
				tipoDanio = 2;
		    }else{
				tipoDanio = 1;
		    }
		}else{
		    tipoDanio = 0;
		}

		enemigo.recibirDanio( (int)(danio*1.7) );
		enemigo.animarDanio( tipoDanio );
		return (int)(danio*1.7);
    }

}
