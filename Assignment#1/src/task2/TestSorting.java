package task2;

public class TestSorting {

	public static void main(String[] args) {
		ResizableArray array = new ResizableArray(3);
		array.insert(1);
		array.insert(10);
		array.insert(4);
		array.insert(2);
		array.insert(50);
		array.insert(25);

		array.print();
		
		array.sort(new QuickSort());
		System.out.println("\n \nSorted Array");
		
		array.print();

	}

}
