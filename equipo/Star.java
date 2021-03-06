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
public class Star extends MonstruoElectrico{
//    public void ataque2(Monstruo objetivo){}

	public Star(
	    String apodo,
	    byte nivel
	){ 
		super(
			new File("./monstruos_ascii/pokemon13.txt"),
			22,
			15,
			16,
			20,
			apodo,
			nivel
			);
	}

	public void ataque2(Monstruo enemigo){
		int danioInfringido;

		System.out.println("¡" + this.apodo + " realiza supernova");
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

		if( (int)(Math.random()*20) != 0 ){ // 5% probabilidad de acertar
		    danio = (this.getAtaque() - enemigo.getDefensa());
		    danio *= this.multiplicadorElemental( enemigo );
		    if( (int)(Math.random()*1) == 0 ){ // Siempre es golpe crItico
				//danio *= 2;
				tipoDanio = 2;
		    }else{
				tipoDanio = 1;
		    }
		}else{
		    tipoDanio = 0;
		}

		enemigo.recibirDanio( (int)(danio*100) );
		enemigo.animarDanio( tipoDanio );
		return (int)(danio*100);
    }
}
