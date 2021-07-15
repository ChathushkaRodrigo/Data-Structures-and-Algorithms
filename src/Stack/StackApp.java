package dataStructures.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stacks theStack = new Stacks(10);

        theStack.push(20);
        theStack.push(10);
        theStack.push(30);
        theStack.push(40);
        

        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
            System.out.println(" ");
        }
      

        System.out.println(" ");

    }
}
