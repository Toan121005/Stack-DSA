import java.util.Scanner;
public class QueueUsing {

    int Queue[] = new int[6];
    int front = 0;
    int rear = 0;
    final int size = 6;
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        QueueUsing qua = new QueueUsing();
        int choice;
        do {
            System.out.println("\n\nQueue Operations\n\n");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("\nChoose one the four options above");
            choice = qua.s.nextInt();
            switch (choice) {
                case 1: qua.insert(); break;
                case 2: qua.delete(); break;
                case 3: qua.display(); break;
                case 4: System.out.println("Good Bye");
            }
        } while (choice != 4);
    }

    void insert (){
        if ( (rear+1) % 7 == front) {
            System.out.println("CAN NOT insert, queue is full");
        }
        else {
            System.out.println("input your number:  ");
            Queue[rear] = s.nextInt();
            rear = (rear + 1) % size;
        }
    }

    void delete() {
        if ( rear == front ){
            System.out.println("CAN NOT delete, the queue is empty");
        }
        else {
            System.out.println("The deleted element is:  " + Queue[rear]);
            front = (front + 1) % size;
        }
    }

    void display() {
        if (front == rear) {
            System.out.println("The Queue is empty");
        }
        else{
            System.out.print("The element in the Queue are: ");
            int i = front;
            while(i != rear) {
                System.out.print(Queue[i] + "  ");
                i = (i + 1) % size;
            }
        }
    }

}
