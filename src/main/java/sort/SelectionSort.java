package sort;


/**
 * 
 * @author keertiraj
 * Find the smallest element, swap it with the element 0. Find the next smallest element and swap it with the element 1....so on..... Selection sort has the performance of O(n square)

 * For Each position i from Zero to length-2
 *     Find the smallest element in position i to length-1
 *     swap the element with the position i.
 * 
 * Selection Sort has the Best Case, Worst Case and Average Case performance of O(n square)
 *
 */
public class SelectionSort {

	public static void main(String arg[]) {
		
		int[] sort = {5,4,3,2,1};
		selectionSort(sort);
		System.out.println(sort[0]);
		System.out.println(sort[3]);
		System.out.println(sort[4]);

	}

	public static void selectionSort(int[] vals) {

		int indexMin;

		for (int i = 0; i < vals.length - 1; i++) {

			indexMin = i;
			boolean swapFlag = false;

			for (int j = i + 1; j < vals.length; j++) {

				if (vals[j] < vals[indexMin]) {
					indexMin = j;
					swapFlag = true;

				}

			}

			if (swapFlag) {
				swap(vals, indexMin, i);
			}

		}

	}

	public static void swap(int[] vals, int minIndex, int valIndex) {

		int temp = vals[minIndex];
		vals[minIndex] = vals[valIndex];
		vals[valIndex] = temp;

	}

}
