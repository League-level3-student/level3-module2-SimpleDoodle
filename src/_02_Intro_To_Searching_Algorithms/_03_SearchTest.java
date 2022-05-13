package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String [] words = {"grand", "ennui", "wordle", "elon", "musk"};
        assertEquals(2, _01_LinearSearch.linearSearch(words, "wordle"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int [] arr = {1,4,5,7,81};
        assertEquals(3,_02_BinarySearch.binarySearch(arr, 0, 4, 7) );
        assertEquals(-1,_02_BinarySearch.binarySearch(arr, 0, 4, 9) );
    }
}
