package DSA;

public class LinkedList {
	
	Node head;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	//add - first, last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	//print
	public void printList() {
		
		if(head == null) {
			System.out.println("List is empty.......");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.println(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addLast("list");
		list.printList();
		
		list.addFirst("this");
		list.printList();
		
	}

}
