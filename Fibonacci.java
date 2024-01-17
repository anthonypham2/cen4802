import java.util;

public class Fibonacci{
    public static int fibonacciSequence(int input){
            if(input <= 1){
                return input;
            }
            else{
                return fibonacciSequence(input - 1) + fibonacciSequence(input - 2);
            }
    }    
        
    public static void main(String args[]){
        int input = 10;
        System.out.println("The " + input + " term of the fibonacciSequenceonacci sequence is " + fibonacciSequence(input));
    }
}


