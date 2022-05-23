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
	
}
