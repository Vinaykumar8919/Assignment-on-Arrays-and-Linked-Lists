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


    public static LinkedList mergeLinkedList(LinkedList l1, LinkedList l2) {
        LinkedList l3 = new LinkedList();
        Node curr1 = l1.head;
        Node curr2 = l2.head;
        while(curr1 != null && curr2 != null) {
            if(curr1.item<curr2.item) {
                l3.add(curr1.item);
                curr1=curr1.next;
            } else {
                l3.add(curr2.item);
                curr2=curr2.next;
            }
        }
        while(curr1!=null) {
            l3.add(curr1.item);
            curr1=curr1.next;
        }
        while(curr2!=null) {
            l3.add(curr2.item);
            curr2=curr2.next;
        }

        return l3;
    }

    public void sort() {
        for(Node i=this.head; i!=null; i=i.next) {
            for(Node j=i.next; j!=null; j=j.next) {
                if(i.item>j.item) {
                    int temp = i.item;
                    i.item=j.item;
                    j.item=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(25);
        l1.add(35);
        l1.add(12);
        l1.add(4);
        l1.add(36);
        l1.add(48);
        LinkedList l2 = new LinkedList();
        l2.add(8);
        l2.add(32);
        l2.add(22);
        l2.add(45);
        l2.add(63);
        l2.add(49);
        LinkedList mergedList = mergeLinkedList(l1,l2);
        System.out.println("BEFORE SORTING");
        mergedList.display();
        mergedList.sort();
        System.out.println("AFTER SORTING");
        mergedList.display();

        
    }

    
}
