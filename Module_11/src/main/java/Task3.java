import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static List<String> sortNumbersFromList(List<String> list) {
        return list.stream()
                .map(x -> Arrays.asList(x.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
    }
}
