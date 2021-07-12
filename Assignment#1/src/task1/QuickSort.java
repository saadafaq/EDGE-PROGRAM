package task1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
class QuickSort implements Sorting{
	static void swap(List<Integer> arr, int i, int j)
	{
	    int temp = arr.get(i);
	    arr.set(i,  arr.get(j));
	    arr.set(j, temp);
	}
	
	static int partition(List<Integer> arr, int low, int high)
	{
	    int pivot = arr.get(high);
	
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (arr.get(j) < pivot)
	        {
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	 
	static void quickSort(List<Integer> arr, int low, int high)
	{
	    if (low < high)
	    {
	        int pi = partition(arr, low, high);
	
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	 
	static void printArray(List<Integer> arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr.get(i) + " ");
	         
	    System.out.println();
	}
	 
//	public static void main(String[] args)
//	{
//		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(15, 22, 1, 8, 9, 22));
//	    int n = arr.size();
//	     
//	    quickSort(arr, 0, n - 1);
//	    System.out.println("Sorted array: ");
//	    printArray(arr, n);
//	}

	@Override
	public void sort(List<Integer> list) {
		int n = list.size();
	     
		quickSort(list, 0, n - 1);		
	}
}