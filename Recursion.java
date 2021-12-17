package library;

interface Recursion extends TextMessages {

    //Finding factorial from 0 to 20
    private static long factorial(int x) {
        if (x == 1 || x == 0) return 1;
        else return x * factorial(x - 1);
    }

    static boolean factorialOutput(int x) {
        if (x > 20 || x < 0) {
            System.out.print(factorialMessage);
            return false;
        }
        else {
            System.out.print(answer + factorial(x));
            return true;
        }
    }

    //Finding fibonacci from 0 to 36
    private static int fibonacci(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static boolean fibonacciOutput(int n) {
        if (n < 0 || n > 36) {
            System.out.print(fibonacciMessage);
            return false;
        }
        else {
            System.out.print(answer + fibonacci(n));
            return true;
        }
    }
}
