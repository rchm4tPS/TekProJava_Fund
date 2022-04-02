
public class Sort {
	/**
	 * Function for doing shell sort algorithm
	 * @param a with type of Sortable
	 */
	public static void shell_sort(Sortable[] a) {
		int n = a.length;
		
		// Starting from a big gap, defined as half of all elements
		// Then reduce the gap in each iteration by a half
		for (int gap = n/2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < n; i++) {
				// add i-th element of an "a" array object to the temp variable
				Sortable temp = a[i];
				
				int j;
				for (j = i; j >= gap && a[j-gap].compare(temp)>0; j = j - gap) {
					a[j] = a[j - gap];
				}
				
				// put the temp (or original i-th position of "a" element)
				// to the correct location after elements at j position
				// relocated to another index/position in the "a" array.
				a[j] = temp;
			}
		}
	}
}
