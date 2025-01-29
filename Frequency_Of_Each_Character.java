import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_Of_Each_Character {
    public static void main(String[] args) {
        String Sentense = "Welcome To 22 India";

//        mapToObj is used to convert the
//        IntStream (which contains integer values representing characters) into a Stream<Character>.
//        The lambda expression (char) c casts each integer to a Character object.

        Map<Character, Long>  frequency =
                Sentense.chars()
                        .mapToObj(c -> (char) c)                                                 // groupingBy(Function.identity()): Groups the elements in the stream by themselves
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); //Collectors.counting(): Counts the occurrences of each unique character.

        System.out.println(frequency);

    }
}
