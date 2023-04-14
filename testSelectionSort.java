/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	public void testPositive() {

		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;

		SelectionSort selectionSort = new SelectionSort();

		int[] afterSorted = selectionSort.basicSelectionSort(arr);

		assertArrayEquals(Sortedarr, afterSorted);

		/** add tests to check for this unit test **/
	}

	public void testNegative() {
		
		int[] arr = new int[5];
		arr[0] = -1;
		arr[1] = -2;
		arr[2] = -100;
		arr[3] = -82;
		arr[4] = -20;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -100;
		Sortedarr[1] = -82;
		Sortedarr[2] = -20;
		Sortedarr[3] = -2;
		Sortedarr[4] = -1;

		SelectionSort selectionSort = new SelectionSort();

		int[] afterSorted = selectionSort.basicSelectionSort(arr);

		assertArrayEquals(Sortedarr, afterSorted);

		
	}

	public void testMixed() {
		
	}

	public void testDuplicates() {
		
	}
}
