
public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        // if list is empty
        if (list.head == null) {
            list.head = newNode;
            return list;
        }
        Node temp = list.head;
        while (temp.next != null) {
            temp = temp.next;// traverse
        }
        temp.next = newNode;
        return list;
    }

    public LinkedList insertFront(LinkedList list, int data) {
        Node newHead = new Node(data);
        if (list.head == null) {
            list.head = newHead;
            newHead.next = null;
            return list;
        }

        Node previousHead = list.head;
        newHead.next = previousHead;
        list.head = newHead;
        return list;
    }

    public LinkedList delete(LinkedList list, boolean end) {

        // if the linked list is empty
        if (list.head == null) {
            System.out.println("invalid");
            // throw new IllegalStateException("can't delete data from an empty list");
            return null;
        }
        // if the list has only one element
        if (list.head.next == null) {
            list.head = null;
            return null;
        }
        if (end) { // if user wants to delete from end
            Node nextTemp = list.head;

            Node temp = null;

            while (nextTemp.next != null) {
                temp = nextTemp;// give the old value to the temp
                nextTemp = nextTemp.next;// traverse
            }
            temp.next = null;
            return list;
        }
        // user wants to delete from the front
        Node secNode = list.head.next;
        list.head = secNode;
        return list;

    }
    // used to delete the node from the end of a linked list if any key isnt
    // mentioned explicitly by the user

    public LinkedList delete(LinkedList list, int data) {
        Node temp = null;
        Node nextTemp = list.head;
        if (list.head == null) {
            // throw new IllegalStateException("can't delete data from an empty linked
            // list");
            return null;
        }
        // if data found at first element
        if (nextTemp.data == data) {
            list.head = null;
            return list;
        }

        while (nextTemp.next != null && nextTemp.data != data) {
            temp = nextTemp;// give the old value to the temp
            nextTemp = nextTemp.next;// traverse
        }
        if (nextTemp.data == data) {// if it came out of the loop because of data match
            temp.next = nextTemp.next;
        } else {// if it came out of the for loop because of end of list
            // throw new IllegalStateException("data not in linked list");
            return null;
        }

        return list;

    }

    public static void display(LinkedList list) {
        if (list.head == null) {
            System.out.print("list empty");
        }
        Node temp = list.head;// initialise to the head of the list
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        display(linkedList);
        linkedList.delete(linkedList, true);
        linkedList.insert(linkedList, 1);
        linkedList.delete(linkedList, true);
        linkedList.insert(linkedList, 0);
        linkedList.insert(linkedList, 24);
        linkedList.insertFront(linkedList, 2);
        display(linkedList);
        linkedList.delete(linkedList, false);
        display(linkedList);
        linkedList.delete(linkedList, true);
        display(linkedList);
    }
}