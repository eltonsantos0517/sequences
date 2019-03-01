import java.util.ArrayList;
import java.util.List;

public class FibonacciIterative implements Sequence {

    @Override
    public long calculate(int n) {
        List<Long> f = new ArrayList<>();
        f.add(1L);
        f.add(1L);

        for (int i = 2; i <= n; i++) {
            f.add(f.get(i - 1) + f.get(i - 2));
        }

        return f.get(n - 1);
        // O(n)
    }
}
