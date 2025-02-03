import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = isAnagramUsingStreams(str1, str2);

        System.out.println("Are the strings anagrams? " + isAnagram);
    }

    public static boolean isAnagramUsingStreams(String str1, String str2) {
        if (str1.length() != str2.length()) return false; // Different lengths → Not anagrams

        return str1.chars().sorted()
                .boxed()
                .toList()
                .equals(str2.chars().sorted()
                        .boxed()
                        .collect(Collectors.toList()));
    }
}
