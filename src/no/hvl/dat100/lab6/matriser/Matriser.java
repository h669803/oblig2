package no.hvl.dat100.lab6.matriser;

import java.lang.StringBuilder;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int i = 0; i < matrise.length; i++) {
			String linje = "";
			for (int num : matrise[i]) linje += num + " ";
			System.out.println(linje);
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		StringBuilder str = new StringBuilder();
		
		for (int[] kolonne : matrise) {
			for (int num : kolonne) str.append(num + " ");
			str.append("\n");
		}
		
		return str.toString();
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][];
		
		for (int i = 0; i < matrise.length; i++) {
			int len = matrise[i].length;
			int[] nyKolonne = new int[len];
			for (int j = 0; j < len; j++) nyKolonne[j] = matrise[i][j] * tall;
			nyMatrise[i] = nyKolonne;
		}
		return nyMatrise;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length) return false;
		if (a[0].length != b[0].length) return false;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) return false;
			}
		}
		
		return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		if (matrise.length != matrise[0].length) return matrise;

		int[][] nyMatrise = new int[matrise.length][matrise.length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++) {
				nyMatrise[j][i] = matrise[i][j];
			}
		}
		return nyMatrise;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (b[0].length > a.length) return a;

		int rader = a[0].length, kolonner = b.length;
		int[][] nyMatrise = new int[rader][kolonner];
		for (int i = 0; i < kolonner; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < rader; k++) {
					nyMatrise[i][k] += b[i][j] * a[j][k];
				}
			}
		}
		return nyMatrise;
	
	}
}
