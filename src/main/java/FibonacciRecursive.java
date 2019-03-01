public class FibonacciRecursive implements Sequence {

    @Override
    public long calculate(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculate(n - 1) + calculate(n - 2);
        }

        //O(2^n)
    }
}
