import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_Of_Each_Element {
    public static void main(String[] args) {
        List<String > nameList = Arrays.asList("Ram", "Shyam", "Ram", "Atul", "Pramod", "Atul", "Shyam", "Ram", "Shyam", "Ram");

        Map<String, Long> filteredList = nameList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(filteredList);
    }
}
