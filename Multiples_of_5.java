import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiples_of_5 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(2, 4, 5, 10, 14, 35, 30, 20, 82, 90);

        List<Integer> multiples = numList.stream()
                .filter(n -> n%5 == 0)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(multiples);
    }
}
