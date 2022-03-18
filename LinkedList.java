import java.util.*;

class Link
	{
		public int iData;
		public Link next;
	
		public Link(int id)
		{
			iData=id;
		}
	
		public void displayLink()
		{
			System.out.print(" "+iData+" ");
		}
	}

	 class LinkList
		{
			private Link first;
			public LinkList()
			{
				first= null;
			}
			
			public boolean isEmpty()
			{
				return (first == null);
			}
			
			public void insertFirst(int id)
			{
				Link newLink = new Link(id);
				newLink.next=first;
				first=newLink;
			}
			
			public Link deleteFirst()
			{
				Link temp = first;
				first= first.next;
				return temp;
			}
			
			public void displayList()
			{
				System.out.print("List :- ");
				
				Link current= first;
				
				while(current != null)
				{
					current.displayLink();
					current=current.next;
				}
				System.out.println();
			}
		}
public class LinkedList{

	private int size =0;
	public static void main (String [] args )
	{
		Scanner sc = new Scanner (System.in);
		LinkList list1 = new LinkList();
		
		while (true)
		{
			System.out.println("1- Insert \n2- Delete \n3- Display \n4- Exit");
			System.out.println("Enter Choice");
			
			switch(sc.nextInt())
			{
			case 1: 
				int i;
				i = sc.nextInt();
				list1.insertFirst(i);
				break;
				
			case 2:
				list1.deleteFirst();
				break;
				
			case 3:
				list1.displayList();
				break;
				
			default: sc.close();
			System.exit(0);
			}
		}
	}
}

