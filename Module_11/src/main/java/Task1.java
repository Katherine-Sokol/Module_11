import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    public static String sortNamesByOddIndexes(List<String> names) {
        List<String> namesWithIndexes = IntStream.range(0, names.size())
                .boxed()
                .map(x -> x + 1 + ". " + names.get(x))
                .collect(Collectors.toList());
        return namesWithIndexes.stream()
                .filter(x -> namesWithIndexes.indexOf(x) % 2 == 0)
                .collect(Collectors.toList())
                .toString();
    }
}
