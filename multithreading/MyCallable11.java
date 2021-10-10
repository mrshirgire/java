import java.util.concurrent.Callable;

public class MyCallable11 implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        long sum = 0;
        for (long i = 0; i <= 2; i++) {
            sum += i;
        }
        return sum;
    }
}