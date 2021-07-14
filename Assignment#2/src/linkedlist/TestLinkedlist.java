package linkedlist;

public class TestLinkedlist {
	
	public static void main(String... args) {
		LinkedList linkList = new LinkedList();
				
		linkList.insert(1);
		linkList.insert(2);
		linkList.insert(5);
		linkList.insert(7);

		linkList.print();
		
		linkList.remove(5);
		linkList.removeAtIndex(2);
		
		linkList.print();
		linkList.insertAtIndex(4, 1);

		linkList.print();
		System.out.println();
		System.out.println("Count : "+linkList.getNodeCount());
				
	}
	
}
