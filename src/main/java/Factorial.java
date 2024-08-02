public class Factorial {

    //Calculate factorial
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // base case if not 0 will be 1
        }
        return n * factorial(n - 1); // RECURSIVE!!
    }
}

