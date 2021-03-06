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
import equipo.*;
public abstract class Pocima{
    protected String tipo_pocima;

    public Pocima(String tipo_pocima){
		this.tipo_pocima = tipo_pocima;
    }

    protected abstract void usarPocima(equipo.Monstruo objetivo);
}
