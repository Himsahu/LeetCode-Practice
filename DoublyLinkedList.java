
import java.util.*;

public class DoublyLinkedList
 {
	Node head;
	class Node
	{
		int data;
		Node prev;
		Node next;
		 
		Node (int d)
		{
			data =d;
		}
	}
	
	public void push(int newData)
	{
		Node newNode = new Node(newData);
		
		newNode.next= head;
		newNode.prev= null;
		
		if( head != null)
		{
			head.prev= newNode;
		}
		
		head  = newNode;
	}
	
	public void insert(Node preNode, int newData)
	{
		if(preNode == null)
		{
			System.out.println("The given previous node cannot be null");
			return;
		}
		
		Node newNode = new Node(newData);
		newNode.next = preNode.next;
		preNode.next = newNode;
		newNode.prev = preNode;
		
		if(newNode.next != null)
		{
			newNode.next.prev= newNode;
		}
	}
	
	void append(int newData)
	{
		Node newNode = new Node(newData);
		
		Node last =  head;
		newNode.next = null;
		if(head==null)
		{
			newNode.prev = null;
			head = newNode;
			return;
		}
		
		while(last.next != null)
			last  = last.next;
		
		last.next = newNode;
		
		newNode.prev = last;
	}
	
	Node delete()
	{
		Node temp = head;
		if(head == null)
			System.out.println("No value to delete");
		
		head= head.next;
		return temp;
		
	}
	void printList(Node node)
	{
		Node last = null;
		System.out.println("Traversal in forward Direction");
		
		while (node != null)
		{
			System.out.print(node.data+ " ");
			last = node;
			node=node.next;
		}
		
		System.out.println();
		System.out.println("Traversal in reverse direction");
		
		while(last != null)
		{
			System.out.print(last.data+ " " );
			last = last.prev;
		}
	}

	

	public static void main(String[] args) {
		
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.append(6);
		
		obj.push(7);
		obj.push(5);
		obj.push(1);
		obj.push(2);
		obj.append(4);
		
		obj.insert(obj.head.next, 8);
		obj.printList(obj.head);
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		System.out.println("Adding new Element: "+ x);
		obj.push(x);
		obj.delete();
		obj.printList(obj.head);
	}
}