package com.mideros.fase1;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaOperationsF1 {

	public static List<String> listOfNames(List<String> nameList) {
		return nameList.stream().filter(l -> l.startsWith("A")).filter(l -> l.length() == 3)
				.collect(Collectors.toList());
	}

	public static String listOfNumbers(List<Integer> numberList) {
		return numberList.stream().map(n -> (n % 2 == 0) ? "e" + n : "o" + n).collect(Collectors.joining(" , "));
	}

	public static List<String> listStringWithO(List<String> nameList) {
		return nameList.stream().filter(l -> l.contains("o")).collect(Collectors.toList());
	}

	public static List<String> listWithFive(List<String> nameList) {
		return nameList.stream().filter(l -> l.contains("o")).filter(l -> l.length() > 5).collect(Collectors.toList());
	}

}
