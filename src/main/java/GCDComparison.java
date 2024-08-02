import java.time.Duration;
import java.time.Instant;

public class GCDComparison {

    public static void main(String[] args) {
        int a = 1234567;
        int b = 7654321;

        Instant start1 = Instant.now();
        GCD1.gcd(a, b);

        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toMillis();
        System.out.println("GCD1 time: " + timeElapsed1 + " ms");

        //Timing GCD2
        Instant start2 = Instant.now();
        GCD2.gcd(a, b);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();
        System.out.println("GCD2 time: " + timeElapsed2 + " ms");
    }
}
