class Recursion implements TextMessages {

    //Finding factorial from 0 to 20
    private static long factorial(int x) {
        if (x == 1 || x == 0) return 1;
        else return x * factorial(x - 1);
    }

    protected static void factorialOutput(int x) {
        if (x > 20 || x < 0) System.out.println(factorialMessage + period);
        else System.out.println(factorial(x));
    }
}
