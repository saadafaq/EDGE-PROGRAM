package linkedlist;

/**
* <h1>LinkList !</h1>
* The LinkList program implements an application that
* simply inserts,removes, prints the nodes in the linklist
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author   SYED SAAD AHMED
* @version 1.0
* @since   2021-07-14
*/

public class LinkedList {
	Node head;
	
	/**
	   * This method is used to add a new node
	   * in the linklist
	   * show the usage of various javadoc Tags.
	   * @param data The value for the new node
	   * @return Nothing.
	   */
	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(head == null) {
			this.head = newNode;
		}
		else {
			Node last = this.head;
			
			while (last.next != null) {
                last = last.next;
            }
			
			last.next = newNode;
		}
	}
	
	/**
	   * This method is used to add a new node in
	   * the linklist at the imdex specified.
	   * @param data The value for the new node.
	   * @param index The index at which the new node should be inserted.
	   * @return Nothing.
	   */
	public void insertAtIndex(int data,int index) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(head == null) {
			this.head = newNode;
		}
		else {
			Node last = this.head;
			Node prev = null;
			
			int nodeIndex = 0;
			
			while (last.next != null && nodeIndex != index) {
				++nodeIndex;
				prev = last;
                last = last.next;
            }
			
//			If index not found
			if(head == null) return;
			
			newNode.next = last;
	        prev.next = newNode;

		}
	}
	
	/**
	   * This method is used to used to remove the node
	   * at which data received by parameter is present.
	   * @param data This is the value which needs to be removed.
	   * @return Nothing.
	   */
	public void remove(int data) {
        Node temp = this.head, prev = null;

        if(temp != null && temp.data == data) {
        	head = null;
        	return;
        }
        
		while (temp != null && temp.data != data) {
			prev = temp;
            temp = temp.next;
        }
		
//		If value not found.
		if(temp == null) return;
		
        prev.next = temp.next;

	}
	
	/**
	   * This method is used to used to remove the node
	   * at the index received in the parameter.
	   * @param index This is the index at which the element should be removed
	   * @return Nothing.
	   */
	public void removeAtIndex(int index) {
	
			Node last = this.head;
			Node prev = null;
			
			int nodeIndex = 0;
			
			while (last.next != null && nodeIndex != index) {
				++nodeIndex;
				prev = last;
                last = last.next;
            }
			
//			If index not found
			if(head == null) return;
		
			prev.next = last.next;
	}

	/**
	   * This method is used to print the data member in
	   * all the nodes in the linklist.
	   * @param Nothing
	   * @return Nothing.
	   */
	public void print() {
		Node last = this.head;
		
		System.out.println();
		while (last != null) {
			System.out.print(last.data + " ");
            last = last.next;
        }
	}
	
	/**
	   * This method is used to get the count of Nodes in the linklist
	   * @param Nothing
	   * @return int This returns the number of nodes in the linklist.
	   */
	public int getNodeCount(){
		int count = 0;
		
		Node temp = head;
		
		while(temp !=null) {
			++count;
			temp = temp.next;
		}
		
		return count;
	}
	
	
}
