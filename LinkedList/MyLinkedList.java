public class MyLinkedList{
	private Node head;
	public MyLinkedList(){
		head = null;
	}
	public void addNode(Node n){
		if(head==null){
			head = n;
		}else{
			Node trav = head;
			while(trav.next!=null){
				trav = trav.next;
			}
			trav.next = n;
		}
	}
	public void printList(){
		Node trav = head;
		while(trav!=null){
			System.out.println("Name= " + trav.name + " Num= " + trav.num);
			trav = trav.next;
		}
	}

	public void insertBefore (int index, Node n) {
		int numElements=0;
		Node trav = head;

		while (trav != null) {//计算现有多少个objs在list里
			numElements++;
			trav = trav.next;      
		}
		trav = head;
		if (index == 0) {
			n.next = trav;
			head = n;
		} else {
			int count = 0;
			while (count < index-1) {//this is to find where to insert
				trav = trav.next;
				count++;
			}
			n.next = trav.next;
			trav.next = n;
		}
	}
	
	public void insertAfter (int index,  Node n)
	{
		Node trav;
		trav = head;
		int i = 0;
		while( i < index){
			trav=trav.next;
		    i++;
		}
		n.next = trav.next;
		trav.next = n;
	}      // adds Node n after index value
	
	public int indexOf (String  str) 
	{
		try
		{
		Node trav = head;
		int count = 0;
		while(!trav.name.equals(str) && trav != null)//
		{
			trav = trav.next;
			count++;
		}
		return count;
		}
		catch(NullPointerException e){
			return -1;
		}  
	}//returns index of where String str  is at.  Returns -1 if String str is not in LinkedList

	public void removeNodeAt(int index) {
		Node trav = head;
		if (index == 0) {
			head = trav.next;
			trav.next = null;
			trav = head;
		} else {
			int count = 0;// count from index 0
			while (count < index-1) {
				trav = trav.next;
				count++;
			}
			Node travTemp = trav.next;
			trav.next = trav.next.next;
			travTemp.next = null;
		}    
	   }
}