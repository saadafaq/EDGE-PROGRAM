package linklist;

public class TestLinklist {
	
	public static void main(String... args) {
		LinkList linkList = new LinkList();
				
		linkList.insert(1);
		linkList.insert(2);
		linkList.insert(5);
		linkList.insert(7);

		linkList.print();
		
		linkList.remove(5);
		linkList.removeAtIndex(2);
		
		linkList.insertAtIndex(3, 1);
		linkList.print();
		linkList.insertAtIndex(4, 1);

		linkList.print();
		System.out.println();
		System.out.println("Count : "+linkList.getNodeCount());
		
	}
	
}
