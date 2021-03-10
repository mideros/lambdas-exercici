package com.mideros.fase2;

/**
 * Crea una Functional Interface que continga un mètode abstracte getPiValue (),
 * que retorna un valor double; en una altra classe, instancie la interfície i
 * assigneu-li mitjançant una lambda el valor 3.1415. Invoca el mètode
 * getPiValue de la instància d'interfície i imprimeix el resultat.
 * 
 * @author Yohanna Mideros Giraldo
 */
public class Main {

	public Main() {

	}

	public static void main(String[] args) {

		PiValue piV = () -> 3.1415;
		System.out.println(piV.getPiValue());
	}

}
