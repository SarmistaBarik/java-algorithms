package custom;

public class Stack {
    int stack[] = new int[5];
    int top = 0;
    public void push(int i) {

        stack[top] = i;
        top++;

    }

    public int peek() {
        int data = stack[top-1];
        return data;
    }

    public int pop() {
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }

    public void show() {

        for(int n : stack){
            System.out.print(n + " ");

        }
        System.out.println();
    }
}
