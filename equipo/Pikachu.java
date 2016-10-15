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
public class Pikachu extends MonstruoElectrico{
//    public void ataque2(Monstruo objetivo){}

	public Pikachu(
	    String apodo,
	    byte nivel
	){ 
		super(
			new File("./monstruos_ascii/pokemon3.txt"),
			18,
			15,
			12,
			20,
			apodo,
			nivel
			);
	}

	public void ataque2(Monstruo enemigo){
		int danioInfringido;

		System.out.println("¡" + this.apodo + " realiza paralizar");
		danioInfringido = causarDanio2( enemigo );
		System.out.println("El enemigo ha recibido: " + danioInfringido +
			" de daño en este turno"	
		);
		try{ Thread.sleep(3000); }catch(Exception e){}
		
		if( enemigo.estado.compareTo("fuera de combate") == 0 ){
		    recibirExperiencia( enemigo );  
		}
    }


    protected int causarDanio2( Monstruo enemigo){
        System.out.println("¡" + this.apodo + " realiza paralizar");

        if( (int)(Math.random()*5) != 0 ){ // 80% probabilidad de acertar
            enemigo.estado = "paralizado";

            enemigo.animarDanio( (byte)0 );
            System.out.println("El enemigo está paralizado.");
        }else{
            System.out.println("Falló");
        }
        return 0;
    }

}
