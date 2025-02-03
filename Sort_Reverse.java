import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Reverse {
    public static void main(String[] args) {
        List <Integer> numlist = Arrays.asList(1, 12, 44, 3, 11, 14, 66, 13, 11, 100);

        List<Integer>sortedList =
                numlist.stream()
                        .sorted(Comparator.reverseOrder())
                        .toList();

        System.out.println(sortedList);
    }
}
