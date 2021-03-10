package com.mideros.fase1;

import java.util.Arrays;
import java.util.List;

/**
 * •Tenint una llista de cadenes de noms propis, escriu un mètode que retorne
 * una llista de totes les cadenes que comencen amb la lletra 'a' (mayuscula) i
 * tenen exactament 3 lletres. Imprimeix el resultat. 
 * • Escriu un mètode que retorne una cadena separada per comes basada en una llista 
 * d’Integers. Cada element hauria d'anar precedit per la lletra "e" si el nombre és parell, i
 * precedit de la lletra "o" si el nombre és imparell. Per exemple, si la llista
 * d'entrada és (3,44), la sortida hauria de ser "o3, e44". Imprimeix el
 * resultat. 
 * • Tenint una llista de Strings, escriu un mètode que retorne una
 * llista de totes les cadenes que continguen la lletra ‘o’ i imprimeix el
 * resultat. 
 * • Has de fer el mateix que en el punt anterior, però retornant una
 * llista que incloga els elements amb més de 5 lletres. Imprimeix el resultat.
 * • Crea una llista amb els nombs dels mesos de l’any. Imprimeix tots els
 * elements de la llista amb una lambda. • Has de fer la mateixa impressió del
 * punt anterior però fent-ho mitjançant method reference.
 * 
 * @author Yohanna Mideros Giraldo
 *
 */
public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Amy", "Lucy", "Adi", "Dave", "Alonso", "Mary", "Ana", "Hope", "Alice",
				"Arturo", "Rose", "ada", "Dan", "Ava", "Liam", "Hunter", "martin", "Rick", "ane");

		List<Integer> numberList = Arrays.asList(1, 5, 8, 14, 17, 22, 25, 34, 39, 48, 50, 56, 59, 68, 75, 80, 87, 90,
				99);

		List<String> monthsList = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December");

		System.out.println("--> List of names that start with A and have three letters <--");
		LambdaOperationsF1.listOfNames(nameList).forEach(System.out::println);

		System.out
				.println("--> Even numbers preceded by the letter 'e' and odd numbers preceded by the letter 'o' <--");
		System.out.println(LambdaOperationsF1.listOfNumbers(numberList));

		System.out.println("--> List of names containing the letter o <--");
		LambdaOperationsF1.listStringWithO(nameList).forEach(System.out::println);

		System.out.println("--> List of names containing the letter o and have more than five letters <--");
		LambdaOperationsF1.listWithFive(nameList).forEach(System.out::println);

		System.out.println("--> Print every month of the year with a lambda <--");
		monthsList.stream().forEach(m -> System.out.println(m));

		System.out.println("--> print all the months of the year with reference method <--");
		monthsList.forEach(System.out::println);

	}

}
