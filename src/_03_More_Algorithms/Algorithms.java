package _03_More_Algorithms;

import java.util.Iterator;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 +" = " + num1*num2;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equalsIgnoreCase("cracked")) {
				return i;
			}
		}
        return 0;
    }

	public static boolean isPrime(int i) {
		// TODO Auto-generated method stub) {
		for (int j = 2; j < i; j++) {
			if(i%j == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSquare(int i) {
		// TODO Auto-generated method stub
		for (int j = 1; j <= i; j++) {
			if (j*j == i) {
				return true;
			}
		}
		return false;
	}

	public static boolean isCube(int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j <= i; j++) {
			if (j*j*j == i) {
				return true;
			}
		}
		return false;
	}
	

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).booleanValue() == true) {
				pearls+=1;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double height = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
				if (peeps.get(i) > height) {
					height = peeps.get(i);
				}
		}
		return height;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String wordle = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>wordle.length()) {
				wordle = words.get(i);
			}
		}
		return wordle;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message1.size(); i++) {
			if (message1.contains("... --- ...")) {
				return true;
			}
			else {
				return false;
			}
		}
		return null;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		double a = 0;
		double b = 0;
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size()-1; j++) {
				if (results.get(j) > results.get(j+1) ) {
					a = results.get(j);
					results.set(j, results.get(j+1));
					results.set(j+1, a);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		String a = "";
		String b = "";
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size()-1; j++) {
				if (unsortedSequences.get(j).length() > unsortedSequences.get(j+1).length() ) {
					a = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j+1));
					unsortedSequences.set(j+1, a);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		String a = "";
		String b = "";
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size()-1; j++) {
				if (words.get(j).compareTo(words.get(j+1)) > 0) {
						a = words.get(j);
						words.set(j, words.get(j+1));
						words.set(j+1, a);
			}
		}
	}
		return words;
	}	
}
