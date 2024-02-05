import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        LinkedList queueLinkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("what do you want to do 1.insert 2.delete 3.display");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the data");
                    queueLinkedList.insert(queueLinkedList, sc.nextInt());
                    break;
                case 2:
                    queueLinkedList.delete(queueLinkedList, false);
                    break;
                case 3:
                    queueLinkedList.display(queueLinkedList);
                    break;
                default:
                    System.out.println("enter a valid choice");
            }

        }
    }
}