import java.util.Stack;
public class Stacks {
    int[] numbersArr;
    Stack<Integer> numbers;
    //Constructor - create new instance of a stack
    public Stacks() {
        //generate new stack objects and assign values to array
        Stack<Integer> numbers = new Stack<Integer>();
    }
    // Constructor overloading
    public Stacks(int[] numbersArr) {
        //generate new stack objects and assign values to array
        this.numbers = new Stack<Integer>();
        //add to stack if available
        for (int i=0; i<numbersArr.length; i++){
            this.numbers.push(numbersArr[i]);
        }
    }

    public void pushToStack(int value){
        numbers.push(value);
    }
    public void printStack(){
        System.out.println("Current Stack: " + this.numbers);
    }
    public void addManyToStack(int[] numbersArr){
        for (int i=0; i<numbersArr.length; i++){
            numbers.push(numbersArr[i]);
        }
        printStack();
    }
}
