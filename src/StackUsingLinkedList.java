public class StackUsingLinkedList {
    // A Linked List Node
    private static class Node{
        int data; // Integer data
        Node link; // Reference variable node type
    }
    // Create global top reference variable.
    Node top;
    // Constructor
    StackUsingLinkedList(){
        this.top=null;
    }
    // Utility Function to add an element 'x' to the stack
    public void push(int x){
        // Create a new node 'temp' and allocate memory to it.
        Node temp = new Node();
        // Initialize data into temp data field.
        temp.data=x;
        // Put top reference into temp link.
        temp.link=top;
        // update top reference.
        top=temp;
    }
    // Utility function to check if the stack is empty.
    public boolean isEmpty(){
        return top==null;
    }
    // Utility Function to return the top element of the stack.
    public int peek(){
        // Check if the Stack is empty.
        if(isEmpty()){
            System.out.println("\nStack is Empty");
            return 1;
        }else{
            return top.data;
        }
    }
    // Utility Function to pop the top element of the Stack.
    public void pop(){
        // Check if the stack is empty.
        if(isEmpty()){
            System.out.println("\n Stack Underflow");
        }
        // Update the top pointer to point to the next node.
        top=top.link;
    }
    // Utility Function to display all the elements in the stack.
    public void display(){
        // Check for Stack Underflow
        if(top==null){
            System.out.println("\nStack Underflow");
        }else{
            Node temp=top;
            while (temp!=null){
                System.out.print(temp.data+" ");
                // Assign temp link to temp.
                temp=temp.link;
            }
        }
    }
    public static void main(String[] args){
        // Create object of implementing class
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        // Print Stack elements.
        System.out.println("Stack: ");
        stack.display();
        // Print top element of the Stack.
        System.out.println("\nTop element of the Stack is: "+stack.peek());
        // Delete top element of the Stack.
        System.out.println("Popping "+stack.peek());
        stack.pop();
        // Print the modified Stack.
        System.out.println("Modified Stack: ");
        stack.display();
    }
}
