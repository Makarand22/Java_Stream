import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class First_Three_Maximum {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1 , 99, 4,  3, 34, 67, 22, 88, 23, 997, 30);

        List<Integer> firstThreeMax = numList.stream().sorted((a,b) -> b-a).limit(3).toList();

        System.out.println(firstThreeMax);
    }
}
