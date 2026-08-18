import java.util.Scanner;

public class QueueUsing {
    int Queue[] = new int[6];
    int front = 0;
    int rear = -1;
    int size = 0; // Theo dõi số lượng phần tử hiện tại trong Queue
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        QueueUsing qua = new QueueUsing();
        int choice;

        do {
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice = qua.s.nextInt();
            switch (choice) {
                case 1: qua.enqueue(); break;
                case 2: qua.dequeue(); break;
                case 3: qua.display(); break;
                case 4: System.out.println("Good bye");
            }
        }
        while (choice != 4);
    }

    void enqueue() {
        if (size == 5) { // Hoặc kiểm tra rear == 5 nếu dùng mảng thẳng
            System.out.println("cannot enqueue, Queue is full");
        } else {
            rear++;
            System.out.println("input an integer: ");
            Queue[rear] = s.nextInt();
            size++;
        }
    }

    void dequeue() {
        if (size == 0) { // Hoặc kiểm tra front > rear
            System.out.println("cannot dequeue, Queue is empty");
        } else {
            System.out.println("the dequeued element is " + Queue[front]);
            front++;
            size--;
        }
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue element: front to rear : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(Queue[i] + " ");
            }
            System.out.println();
        }
    }
}
