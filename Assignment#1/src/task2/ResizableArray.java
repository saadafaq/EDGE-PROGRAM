package task2;

public class ResizableArray {
	int[] arr;
	int size;
	
	int lastIndex;
	{lastIndex = 0;}
	
	public ResizableArray(int size) {
		this.arr = new int[size];
		this.size = size;
		
	}
	
	public void insert(int element) {
		
		if(lastIndex >= size) {
			  int oldSize = java.lang.reflect.Array.getLength(arr);
			  ++size;
	          Class elementType = arr.getClass().getComponentType();
	          Object newArray = java.lang.reflect.Array.newInstance(elementType,size);
	          int preserveLength =  Math.min(oldSize,size);
	          if (preserveLength > 0)
	              System.arraycopy(arr, 0, newArray, 0, preserveLength);
	          arr = (int[]) newArray;
	          insert(element);
		}
		else {
			arr[lastIndex] = element;
			lastIndex++;
		}
	}
	
	public void sort(Sorting sortType) {
		sortType.sort(arr);
	}
	
	public void print() {
		for(int elem : this.arr) {
			System.out.print(elem + " ");
		}
	}
	
	public int[] getArray() {
		return this.arr;
	}
}
