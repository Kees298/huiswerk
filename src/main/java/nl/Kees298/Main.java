/*
De text van de opdracht 01 intro, Even & Oneven:
Maak een klein programma dat uit een lijst van getallen telt hoeveel er even of oneven zijn.

Maak een array (int[]) met de volgende getallen: 42, 67, 35, 89, 24, 76, 58, 93, 7, 30, 83, 46, 13, 25, 98, 53, 17, 79, 57, 8.
Gebruik een for-loop om door de array te itereren.
Controleer voor elk getal of het even of oneven is met behulp van een if-else-statement.
Bewaar de telling van even en oneven getallen in een HashMap waarbij de key de string "even" of "oneven" is en de waarde de telling is.
Letop: de HasMap heeft dus een "key" van het type String en een "value" van het type int.

*/
package nl.Kees298;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
		// Dictionary aanmaken met de keys even en oneven.
		HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
		//voordat het tellen begint is het aantal nul.
		int aantalEven = 0;
		int aantalOneven = 0;
		//De lijst met even en oneven getallen:
		int[] arr = {42, 67, 35, 89, 24, 76, 58, 93, 7, 30, 83, 46, 13, 25, 98, 53, 17, 79, 57, 8};
		//itereren over de lijst:
		for (int i : arr) {
			//als %2 == 0, dan is het getal even.
			if (i % 2 == 0) {
				aantalEven++;
			} else {
				//als het niet even is, dan is het oneven.
				aantalOneven++;
			}
			//de aantallen verbinden aan de keys even en oneven:
			dictionary.put("even", aantalEven);
			dictionary.put("oneven", aantalOneven);

		}
		System.out.println(dictionary.get("even"));
		System.out.println(dictionary.get("oneven"));
	}
}
