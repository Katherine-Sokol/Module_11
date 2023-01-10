import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITests {

    private static List<String> names = Arrays.asList("Kate", "Mark", "Max", "Monica", "Alice");

    public static void main(String[] args) {

        String sortedNames = Task1.sortNamesByOddIndexes(names);
        System.out.println("sortedNames = " + sortedNames);

        List<String> sortedLines = Task2.getLinesToUpperCaseAndSortedInDescendingOrder(names);
        System.out.println("sortedLines = " + sortedLines);

        List<String> sortedNumbers = Task3.sortNumbersFromList(Arrays.asList("1, 2, 0", "4, 5"));
        System.out.println("sortedNumbers = " + sortedNumbers);

        List<Long> randomNumbers = Task4.getEndlessStream(10L, 25214903917L, 11L, (long) Math.pow(2, 48))
                .limit(6)
                .collect(Collectors.toList());
        System.out.println("randomNumbers = " + randomNumbers);

        Stream<Integer> stream = Task5.zip(Stream.of(1, 2, 3, 4, 5), Stream.of(1, 2, 3, 4, 5, 6));
        System.out.println("stream = " + Arrays.toString(stream.toArray()));

    }
}
