package sort;

/**
 * 
 * @author keertiraj
 * 
 *   For Each position i from Zero to length-1
 * 
 *     Swap successive pairs to put value in position i, in correct location relative to earlier values. Insertion Sort has the Best Case
 *     performance of O(n), Worst Case and Average Case performance of O(n square)
 *
 */

public class InsertionSort {

	public static void main(String arg[]) {

		int[] sort = { 5, 4, 3, 2, 1 };
		insertionSort(sort);
		System.out.println(sort[0]);
		System.out.println(sort[3]);
		System.out.println(sort[4]);


	}

	public static void insertionSort(int[] vals) {

		int currInd;

		for (int pos = 1; pos < vals.length; pos++) {
			currInd = pos;
			while (currInd > 0 && vals[currInd] < vals[currInd - 1]) {
				swap(vals, currInd, currInd - 1);
				currInd = currInd - 1;

			}

		}

	}

	public static void swap(int[] vals, int minIndex, int valIndex) {

		int temp = vals[minIndex];
		vals[minIndex] = vals[valIndex];
		vals[valIndex] = temp;

	}

}
