.................
Main.java
.................
class Main{
    public static void main(String[] args){
    Stack newStack = new Stack(4);
    }
}

..................................
Stack.java
..................................
public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack =-1;
        System.out.println("The Stack is created with size of : " + size);
        
    }
    
}

 
...........
//////finish///////////
