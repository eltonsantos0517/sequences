import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        long number = 45;

        Date start = new Date();
        long result = fib(number);
        Date end = new Date();
        System.out.println("Time: " + (end.getTime() - start.getTime()));
        System.out.println("Result: " + result);


        Date start2 = new Date();
        long result2 = fibWithArray(number);
        Date end2 = new Date();
        System.out.println("Time: " + (end2.getTime() - start2.getTime()));
        System.out.println("Result: " + result2);
    }

    private static long fib(long n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

        //O(2^n)
    }

    private static long fibWithArray(long n) {


        List<Long> f = new ArrayList<>();
        f.add(1L);
        f.add(1L);

        for (int i = 2; i <= n; i++) {
            f.add(f.get(i - 1) + f.get(i - 2));
        }

        return f.get((int) n - 1);

        // O(n)
    }

    public static void main(String[] args) {

        List<Sequence> sequences = new ArrayList<>();
        sequences.add(new FibonacciIterative());
        sequences.add(new FibonacciRecursive());

        for (Sequence sequence : sequences) {


            Context context = new Context(sequence);
            context.execute(45);
        }

    }

}
