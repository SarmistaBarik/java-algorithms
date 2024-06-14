package custom;

public class StackImpl {

    public static void main(String[] args) {

        Stack nums = new Stack();

        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.show();
        System.out.println("peek :: "+nums.peek());

        System.out.println("pop :: "+nums.pop());

        nums.show();


    }
}
