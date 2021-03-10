package com.mideros.fase3;

/**
 * Crea una Functional Interface que continga un mètode abstracte reverse (),
 * que retorne un valor String; en una altra classe, injecta a la interfície
 * creada mitjançant una lambda el cos del mètode, de manera que torne la
 * mateixa cadena que rep com a paràmetre però a l'inrevés. Invoca la instància
 * de la interfície passant-li una cadena i comprovant el resultat.
 * 
 * @author Yohanna Mideros Giraldo
 */

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		ReverseLambda rl = (n) -> new StringBuilder(n.trim()).reverse().toString();
		System.out.println(rl.reverseL("Hello world"));

	}

}
