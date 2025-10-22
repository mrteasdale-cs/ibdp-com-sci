public class UserDefinedStacks {
    //instance variables
    int topIndex;
    int capacity;
    int[] stack;
    //constructor
    public UserDefinedStacks(int size) {
        this.capacity = size;
        this.stack = new int[capacity];
        this.topIndex = -1;
    }

    //push method
    public void push(int value) {
        if (topIndex < capacity -1) {
            stack[++topIndex] = value;
        } else {
            System.out.println("Stack overflow");
        }
    }//end push method

    //pop method
    public int pop() {
        if (!isStackEmpty()) {
            topIndex--;
            return stack[topIndex];
        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    //isempty method
    public boolean isStackEmpty() {
        if(this.topIndex == -1){
            return true; //returns true if stack index less than 0/empty
        }
        else{
            return false;
        }
    }//end isempty method
}//end class
