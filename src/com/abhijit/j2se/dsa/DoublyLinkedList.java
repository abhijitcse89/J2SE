package com.abhijit.j2se.dsa;

public class DoublyLinkedList{
	
	private static class Node{
		private Node prev;
		private int data;
		private Node next;
		
		public Node(int data){
			this.prev=null;
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		//create node
		Node head = new Node(8);
		Node second = new Node(19);
		Node third = new Node(35);
		
		// linking with nodes
		head.next=second;
		second.prev=head;
		second.next=third;
		third.prev=second;
		
		display(head);
		System.out.println("Link list size : "+nodeSize(head));
		
		createEnd(head,81);
		display(head);
		System.out.println("Link list size : "+nodeSize(head));
		
		Node cs = createStart(head, 2);
		display(cs);
		System.out.println("Link list size : "+nodeSize(cs));
		
		Node create = create(cs, 4, 27);
		display(create);
		System.out.println("Link list size : "+nodeSize(create));
		
	}
	public static void display(Node head){
		if(head==null){
			return; 
		}
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println(current);
	}
	// Display Number of nodes
	public static int nodeSize(Node head){
		if(head==null){
			return 0;
		}
		Node current=head;
		int count=0;
		while(current!=null){
			count++;
			current=current.next;
		}
		
//		System.out.println("The Number of Nodes in the Doubly linked List : "+count);
		return count;
	}
	
	// create node at end point
	public static Node createEnd(Node head,int data){
		if(head==null){
			return head;
		}
		Node newNode = new Node(data);
		Node current=head;
		while(current.next!=null){
			current=current.next;
		}
		newNode.prev=current;
		current.next=newNode;
		newNode.data=data;
		return head;
	}
	// create node at beginning
	public static Node createStart(Node head,int data){
		if(head==null){
			return head;
		}
		Node newNode = new Node(data);
		
		newNode.next=head;
		newNode.data=data;
		head.prev=newNode;
		head=newNode;
		return head;
	}
	//	create node at any index
	public static Node create(Node head,int index, int data){
		int len = nodeSize(head);
		if(head==null){
			return head;
		}
		if(index > len+1 || index < 1){
			System.out.println("Invalid position.");
		}
		
		Node newNode = new Node(data);
		if(index==0){
			newNode.next=head;
			return newNode;
		}
		else{
			int count=0;
			Node current = head;
			while(count < index-1){
				current=current.next;
				count++;
			}
			newNode.prev=current;
			newNode.data=data;
			newNode.next=current.next;
			current.next.prev=newNode;
			current.next=newNode;
			
			return head;
		}
	}
}