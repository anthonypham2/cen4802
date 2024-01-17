import java.util;

public class Fibonacci{
    //this class calculates the fibonacci on the number 10. The Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.
    public static int fibonacciSequence(int input){
            //if the number is less than 2, the program ends because the Fibonacci sequence for 0 is 0 and 1 is 1.
            if(input <= 1){
                return input;
            }
            //returns the Fibonacci sequence if the number is over 2
            else{
                return fibonacciSequence(input - 1) + fibonacciSequence(input - 2);
            }
    }    
        
    public static void main(String args[]){
        int input = 10;
        //we hard coded the number to be 10, so the function fibonacciSequence is called with 10 as the argument.    
        System.out.println("The " + input + " term of the fibonacciSequenceonacci sequence is " + fibonacciSequence(input));
    }
}


