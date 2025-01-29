import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,2,2,2,1,3,4,4,4,4,5,6,7);

        List<Integer> withoutDuplicate = numList.stream()
                .distinct()
                .collect(Collectors.toList());

        withoutDuplicate.forEach(System.out::println);
    }
}
