import java.util.Scanner;
    public class StackUsing {
        int Stack[] = new int[6];
        int top = -1;
        Scanner s = new Scanner(System.in);

    public static void main (String[] args){
        StackUsing sua = new StackUsing();
        int choice;

        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice = sua.s.nextInt();
            switch(choice) {
                case 1: sua.push(); break;
                case 2: sua.pop(); break;
                case 3: sua.display(); break;
                case 4: System.out.println("Good bye");
            }
        }
        while (choice !=4);

    }

    void push(){
        if (top==5){
            System.out.println("cannot push, Stack is full");
        }
        else{
            top++;
            System.out.println("input an interger: ");
            Stack[top] = s.nextInt();
        }
    }

    void pop(){
        if (top==-1){
            System.out.println("cannot pop, stack is empty");
        }
        else{
            System.out.println("the popped element is " + Stack[top]);
            top --;
        }
    }

    void display(){
        if (top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack element: top to bottom :  ");
            for (int i = top; i >= 0 ; i--){
                System.out.println(Stack[i] + " ");
            }

            System.out.println();
        }

    }
    
}
