import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "Welcome To Learn Streams";

        String reversed = IntStream.range(0, str.length())  // Generates indices 0 to length-1
                .mapToObj(i -> str.charAt(str.length() - 1 - i)) // Access characters in reverse order
                .map(String::valueOf) // Convert char to String
                .collect(Collectors.joining()); // Join characters

        System.out.println("Reversed String: " + reversed);
    }
}
