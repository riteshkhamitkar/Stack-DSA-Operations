.................
Main.java
.................
class Main{
    public static void main(String[] args){
    Stack newStack = new Stack(4);
    boolean result = newStack.isEmpty();
    System.out.println(result);
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

    // isEmpty
    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;
        }else{
            return false;
        }
    }
    
}
 
...........
//////finish///////////
