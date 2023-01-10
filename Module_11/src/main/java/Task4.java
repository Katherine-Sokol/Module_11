import java.util.stream.Stream;

public class Task4 {

    public static Stream<Long> getEndlessStream(Long seed, Long a, Long c, Long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
