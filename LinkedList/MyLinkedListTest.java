/*
public class MyLinkedListTest {
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		
		Node n1 = new Node("Bill",100);
		ll.addNode(n1);
		
		Node n2 = new Node("Jill",200);
		ll.addNode(n2);
		
		Node n3 = new Node("Hill",300);
		ll.addNode(n3);
		
		ll.printList();
		System.out.println(head);
	}

}
*/

public class MyLinkedListTest{
	public static void main(String[] args){
		MyLinkedList linkedList  = new MyLinkedList();
		
		Node n1 = new Node("Bill",100);
		linkedList.addNode(n1);
		
		Node n2 = new Node("Jill",200);
		linkedList.addNode(n2);
		
		Node n3 = new Node("Till",300);
		linkedList.addNode(n3);
		
		linkedList.printList();
		System.out.println("-------------------------------");
		System.out.println("Insert before: ");
		
		linkedList.insertBefore(2, new Node("Kevin",250));
		
		linkedList.printList();
		System.out.println("-------------------------------");
		linkedList.insertBefore(0, new Node("Al",75));
		linkedList.printList();
		System.out.println("-------------------------------");
		System.out.println("After Remove: ");
		linkedList.removeNodeAt(0);
		linkedList.removeNodeAt(3);
		linkedList.printList();
		System.out.println("-------------------------------");
		System.out.println("Insert after: ");
		linkedList.insertAfter(2, new Node("Scott",350));
		linkedList.printList();
	}
}