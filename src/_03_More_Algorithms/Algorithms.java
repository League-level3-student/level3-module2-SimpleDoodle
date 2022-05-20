package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 +" = " + num1*num2;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
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
		for (int j = 1; j < i; j++) {
			if (i/j == j) {
				return true;
			}
		}
		return false;
	}
}
