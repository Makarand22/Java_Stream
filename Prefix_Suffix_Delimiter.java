import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prefix_Suffix_Delimiter {
    //add prefix [, suffix ], separator as ,
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Rakesh", "Prakash", "Atul", "Yogesh", "Rakesh");

        String joinedString = nameList.stream()
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(joinedString);
    }
}
