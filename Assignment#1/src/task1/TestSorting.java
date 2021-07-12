package task1;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

/* @Author : SAAD Ahmed
 * @Description:Work on ArrayList and sorting algorithm
 */
public class TestSorting {
	public static void main(String... args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(22,1,4,2,100));
		
		QuickSort quickSort = new  QuickSort();
		quickSort.sort(list);
		QuickSort.printArray(list, list.size());
	}
}
