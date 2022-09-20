package no.hvl.dat100.lab5.tabeller;

import java.lang.StringBuilder;

public class Tabeller {
	
	// a)
	public static void skrivUt(int[] tabell) {

		System.out.println(tilStreng(tabell));

	}

	// b)
	public static String tilStreng(int[] tabell) {

		StringBuilder str = new StringBuilder("[");
		for (int num : tabell) str.append(num + ",");
		str.replace(str.length() - 1, str.length(), "]");
		return str.toString();
		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int num : tabell) sum += num;
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		for (int num : tabell) {
			if (num == tall) return true;
		}
		return false;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) return i;
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revers = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			revers[tabell.length - 1 - i] = tabell[i];
		}
		return revers;
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1]) return false;
		}
		return true;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int[] sammenSetning = new int[tabell1.length + tabell2.length];
		int i;
		for (i = 0; i < tabell1.length; i++) {
			sammenSetning[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			sammenSetning[i + j] = tabell2[j];
		}
		return sammenSetning;

	}
}
