//here we use recurssive to solve the problem
//the idea is, current Fibonacci number is always the previous Fibonacci number plus the "previous previous" Fibonacci number
public class Fibonacci{
    
    public static int fib(int n) {
        if (n==0) return 0; 
        if (n==1) return 1; 
        return (fib(n-1)+fib(n-2)); //note here: when it starts to call itself, recurssive starts
        //each fib(n) will become fib(n-1)+fib(n-2) next round, and when the input is 0, fib returns 0, and when the input is 0, fib returns 1
    }

     public static void main(String []args){
        System.out.print("Answer is " +fib(7));
     }
}
