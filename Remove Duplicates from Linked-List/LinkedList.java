import java.util.HashSet;

class Node{
    int item;
    Node next;
    Node(){}
    Node(int data) {
        this.item=data;
    }
}

public class LinkedList {
    private Node head;
    public LinkedList() {// constructor
        this.head=null;
    }

    public void add(int i) {
        Node node = new Node();
        node.item = i;
        Node current=this.head;

        if(this.head==null) {
            this.head=node;
            this.head.next=null;
            
            System.out.println(this.head.toString());
        } else {
            while(current.next!=null) {
                current=current.next;
            }
            current.next=node;
            node.next=null;
        }
    }

    public void display() {
		Node current = this.head;
		while(current!=null) {
			System.out.print(current.item+"-> ");
			current=current.next;
		}
        System.out.println("END");
	}

    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        HashSet<Integer> list = new HashSet<>();
        list.add(curr.item);
        while(curr.next!=null) {
            if(list.contains(curr.next.item)) {
                curr.next=curr.next.next;
            } else {
                list.add(curr.next.item);
                curr=curr.next;
                
            }

        }
        return head;
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(4);
        l.add(5);
        l.add(9);
        l.add(7);
        l.add(4);
        l.add(100);
        l.add(3);
        l.add(7);
        System.out.println("ORIGINAL LINKED LIST");
        l.display();
        l.head=removeDuplicates(l.head);
        System.out.println("AFTER REMOVING DUPLICATES");
        l.display();
    }
}
