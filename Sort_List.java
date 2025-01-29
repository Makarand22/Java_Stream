import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_List {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 9, 33, 67, 11, 12 ,13, 0, 12, 33);

        List <Integer> sortedList = numList.stream()
                .sorted()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(sortedList);
    }
}
