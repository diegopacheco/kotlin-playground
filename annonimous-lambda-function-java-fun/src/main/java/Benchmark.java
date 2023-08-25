import java.time.Duration;
import java.time.Instant;
import java.util.function.Function;

public class Benchmark {

    public <I,O> O now(Function<I,O> func,I arg){
        Instant start = Instant.now();
        O result = func.apply(arg);
        Instant end = Instant.now();
        System.out.println("Execution time in " + Duration.between(end,start).toMillis() + " ms");
        return result;
    }

}
