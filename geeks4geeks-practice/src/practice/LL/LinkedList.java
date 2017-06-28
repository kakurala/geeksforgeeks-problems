package practice.LL;

/**
 * 
 * @author Madhu
 *
 * @param <T>
 * 
 * Below operations were implemented
 * 
 *  1. creation
 *  2. insertion at head, after a key, at a given position, at the end *
 *  3. deletion with key, at a position, head, end node *
 *  4. print the list in given order
 *  4. print in reverse order
 *  5. reverse entire linked list *
 *  6. print nth element from the last node.
 *  7. insertion sort (swap an nodes without data)
 *  8. print middle of a linked list
 *  9. merge sort with linked list
 */
public class LinkedList<T> {
	Node<T> head;
	Node<T> top;
	
	public LinkedList() {
	}

	public static void main(String[] args) {
		 
		LinkedList<Character> ll= new LinkedList<Character>();
		
		for(char a='a'; a<='z'; a++){
			ll.insert(a);
		}
		
		ll.printNthNode(10, ll.head);
		ll.print();
		System.out.println();
		ll.reverse(ll.head);
		System.out.println();
		ll.print();
		System.out.println();
		ll.counter = 0;
		ll.printNthNode(-1, ll.head);
	}

	public void print(){
		Node<T> temp = head;
		while(temp !=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	// add a new node to linkedlist
	public void insert(T a){
		if(head == null && a != null){
			head = new Node<T>(a);
			top = head;
		} else if(a != null){
			top.next = new Node<T>(a);
			top = top.next;
		}
	}
	
	int counter = 0;
	
	// print nth node in LL from the end
	public void printNthNode(int n, Node<T> root){
		if(root == null || n<=0){
			return;
		}else{
			printNthNode(n, root.next); // will call recursively till the end
			if(root !=null)
				counter++;  // count the recursive function returns being executed
			if(counter == n){      // check counter is equal to n, if so print element
				System.out.println(root.data);
			}
		}
	}

public void reverse(Node<T> root){
	if(root == null){
		return;
	}else{
		reverse(root.next);
		System.out.print(root.data+" ");
	}
}
}



class Node<T>{
	T data;
	Node<T> next;
	
	public Node(T data){
		this.data =data;
		this.next = null;
	}
}