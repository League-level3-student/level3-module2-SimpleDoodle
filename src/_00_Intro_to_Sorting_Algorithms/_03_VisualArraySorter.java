package _00_Intro_to_Sorting_Algorithms;

import java.awt.Rectangle;
import java.util.Iterator;

import processing.core.PApplet;

/*
 * Goal: Create a program that sorts each rectangle by height!
 * 
 * 1. Create an array of ints. Do not initialize it. Done
 *
 *In the settings() method:
 * 2. Set the size of your window to at least 500 width 500 height Done?
 * 
 * In the setup() method:
 * 3. Initialize your array to contain 50 ints Done
 * 
 * 4. Initialize the ints in the array with random numbers from
 *    0 to the window height. Use the following code to get a random int:
 *    (int)random(height) Done?
 * 
 * 5. Call the noStroke() method to remove the outline for each shape Done
 * 
 * In the draw() method:
 * 6. Set the background color with background(r, g, b); Done
 * 
 * 7. Set the color for your graph using the fill() method Done
 * 
 * 8. Draw a rectangle for each int in your array.
 *    the x value will be the loop variable multiplied by (width/intArray.length)
 *    the y value will the height variable
 *    the width is (width/intArray.length)
 *    the height is the negative array value at the array index, e.g. -intArray[i] Done
 * 
 * 9. Call the stepSort method Done
 * 
 * 10. Extract the code from step 4 that randomizes the array into a new method.
 * 
 * 11. Call the method you made in step 10 when the mouse is pressed using the
 *     mousePressed variable
 */
public class _03_VisualArraySorter extends PApplet {
	int[] arr;
	final int WIDTH = 600;
	static final int HEIGHT = 400;

	@Override
	public void settings() {
		size(500, 500);
	}

	@Override
	public void setup() {
		arr = new int[50];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) random(height);
		}
		noStroke();
	}

	@Override
	public void draw() {
		background(0, 0, 0);
		fill(255, 255, 255);
		for (int i = 0; i < 50; i++) {
			rect(i * (width / arr.length), height, width / arr.length, -arr[i]);
		}
		stepSort(arr);
		if (mousePressed) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) random(height);
			}
			noStroke();
		}
	}

	static public void main(String[] passedArgs) {
		PApplet.main(_03_VisualArraySorter.class.getName());
	}

	/*********************** DO NOT MODIFY THE CODE BELOW ********************/

	int startIndex = 1;

	void stepSort(int[] arr) {
		for (int i = startIndex; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				int t = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = t;

				startIndex = i;
				return;
			}
		}
		startIndex = 1;
	}
}