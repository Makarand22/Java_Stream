import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_Of_Each_Number {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 9, 1, 11, 111, 1, 4, 5, 3, 3, 2, 9, 2, 2, 2 );

        Map<Integer,Long> filtered =
                numList.stream()
                        .collect(Collectors.groupingBy( Function.identity(), Collectors.counting()));

        System.out.println(filtered);

    }

}
