package com.abhijit.j2se.dsa;

public class SinglyLinkedList {

	private static class Node{
		private int data;
		private Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		//creation of Node
		Node head = new Node(10);
		Node second = new Node(100);
		Node third = new Node(8);
		Node fourth = new Node(65);
		Node fifth=null;
		//Linking node with ref
		head.next=second;
		second.next=third;
		third.next=fourth;
		
		SinglyLinkedList sll = new SinglyLinkedList();
		System.out.println("Display of the List");
		sll.display(head);
		System.out.println();
		
		System.out.println("No. of Nodes in the list is "+sll.countNode(head));
		System.out.println();
		
		System.out.println("Inserting Node at the end of the list:");
		sll.insertNodeAtEnd(head, 15);
		sll.display(head);
		System.out.println();
		
		System.out.println("Inserting Node at the beginning of the list:");
		Node n = sll.insertNodeAtFrist(head, 1);
		sll.display(n);
		System.out.println();
		
		System.out.println("Inserting Node after a particular node of the list:");
		sll.insertNode(n,second, 105);
		sll.display(n);
		System.out.println();
		
//		System.out.println("Deleting end node of the list:");
//		Node del1 = sll.deleteNodeAtEnd(head);
//		System.out.println(del1.data);
//		System.out.println();
		
//		System.out.println("Deleting first node of the list:");
//		Node del = sll.deleteNodeAtFirst(head);
//		System.out.println(del.data);
//		System.out.println();
		
		System.out.println("Deleting node at particular index of the list:");
		Node del = sll.deleteNode(n, 2);
		System.out.println(del.data);
		sll.display(n);
	}
	// Display nodes
	public void display(Node head){
		Node current=head;
		if(head==null){
			return;
		}
		while(current!=null){
			System.out.print(current.data+" --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	// No. of Nodes in the list
	public int countNode(Node head){
		int count=0;
		Node current=head;
		while(current!=null){
			current=current.next;
			count++;
		}
		
		return count;
	}
	//insert node at the end
	public void insertNodeAtEnd(Node head, int data){
		if(head==null){
			return;
		}
		Node newNode = new Node(data);
		Node current = head;
		while(current.next!=null){
			current=current.next;
		}
		newNode.next=current.next;
		newNode.data=data;
		current.next=newNode;
	}
	//insert node at the beginning of the list
	public Node insertNodeAtFrist(Node head,int data){
		if(head==null)return null;
		Node newNode = new Node(data);
		newNode.next=head;
		newNode.data=data;
		head=newNode;
		return newNode;
	}
	//insert node at any position in the list
	public void insertNode(Node head, Node afterNode, int data){
		if(head==null)return;
		if(afterNode==null)System.out.println("afterNode cannot be null:");
		Node current=head;
		Node newNode = new Node(data);
		while(current.next!=afterNode){
			current=current.next;
		}
		newNode.next=afterNode.next;
		newNode.data=data;
		afterNode.next=newNode;
	}
	//delete node at the end of the list
	public Node deleteNodeAtEnd(Node head){
		if(head==null)return head;
		Node current=head;
		Node currentToPrev =null;
		while(current!=null){
			currentToPrev=current;
			current=current.next;
		}
		currentToPrev.next=null;
		return currentToPrev;
	}
	//deleting beginning node of the list
		public Node deleteNodeAtFirst(Node head){
			if(head==null)return head;
			Node current=head;
			head=current.next;
			current.next=null;
			return current;
		}
		
	//deleting beginning node of the list
		public Node deleteNode(Node head, int indexNode){
			Node current=head;
			Node currentToPrev=null;
			int count=0;
			while(count!=indexNode){
				currentToPrev=current;
				current=current.next;
				count++;
			}
			currentToPrev.next=current.next;
			return current;
		}	
}
