import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Separate_Odd_And_Even {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(2, 4, 5, 10, 14, 35, 30, 20, 82, 90, 71, 61);

        List<Integer> even = numList.stream()
                .filter(n-> n%2 == 0)
                .collect(Collectors.toList());

        List<Integer> odd = numList.stream()
                .filter(n-> n%2 !=0)
                .collect(Collectors.toList());

        System.out.println("Odd Numbers " + odd);
        System.out.println("Even Numbers "+ even);

    }
}
